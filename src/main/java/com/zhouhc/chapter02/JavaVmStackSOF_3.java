package com.zhouhc.chapter02;

/*
 *VM Args -Xss40M
 *
 */
//无限制开线程，其实这个和栈溢出已经没有关系了，线程有限于本地系统的内存大小
// 64 位 win10 证明是不能拖死系统的，不过系统有假死的现象，
// CPU一直100% 并且线程数涨到15w+ ，正常只有2k~3k左右
public class JavaVmStackSOF_3 {

    //无限循环的目的是为了防止线程销毁
    public void stackLeak() {
       while(true){

       }
    }
   //无限制开线程，拖死系统
    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    stackLeak();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable {
        JavaVmStackSOF_3 stackSOF_3 = new JavaVmStackSOF_3();
        //主要是为了打印栈的深度
        try {
            stackSOF_3.stackLeakByThread();
        } catch (Throwable e) {
            throw e;
        }
    }
}
