package com.zhouhc.chapter02;

/*
 *VM Args -Xss256k
 *
 */
//无限制调用方法，使得堆栈溢出,设置栈的大小主要是为了更快得出测试结果
public class JavaVmStackSOF_1 {

    private int stactLength = 1;

    //无限制的递归调用
    public void stackLeak() {
        stactLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVmStackSOF_1 stackSOF_1 = new JavaVmStackSOF_1();
        //主要是为了打印栈的深度
        try {
            stackSOF_1.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length :" + stackSOF_1.stactLength);
            throw e;
        }
    }
}
