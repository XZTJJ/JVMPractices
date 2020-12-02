package com.zhouhc.chapter03;

/**
 * 测试finalze方法
 */
public class FinalizeMethodTest {
    private static FinalizeMethodTest obj;

    public static void main(String[] args) throws Exception {
        //按照道理来说，这样该对象应该就要被回收掉
        FinalizeMethodTest finalizeMethodTest = new FinalizeMethodTest();
        System.out.println("finalizeMethodTest的值为:" + finalizeMethodTest +
                "     FinalizeMethodTest.obj : " + FinalizeMethodTest.obj);
        finalizeMethodTest = null;
        System.gc();
        Thread.sleep(2000);

        System.out.println("finalizeMethodTest的值为:" + finalizeMethodTest +
                "   FinalizeMethodTest.obj : " + FinalizeMethodTest.obj);
        
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("我还能挣扎一下");
        FinalizeMethodTest.obj = this;
    }
}
