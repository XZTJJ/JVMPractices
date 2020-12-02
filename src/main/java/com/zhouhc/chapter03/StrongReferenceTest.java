package com.zhouhc.chapter03;

/**
 * 强引用测试
 * 只要强引用关系存在就不会被回收
 */
public class StrongReferenceTest {

    public static void main(String[] args) throws Exception {
        String strongReference = "这是强引用测试";
        //没有用处的强引用，只是为了能够打印下面的输出语句
        StrongReferenceTest test = new StrongReferenceTest();
        test = null;
        //显示调用GC
        System.gc();
        Thread.sleep(2000);
        //打印看看能否找到对象
        System.out.println(strongReference);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("垃圾回收器已经开始工作了");
    }
}
