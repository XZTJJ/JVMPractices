package com.zhouhc.chapter06;

public class ClassNumTest {
    private static final int j = 9;
    private static final int m = 9;
    private static final int i = m+j;

    public static void main(String[] args)  {
        long _longOptions = 100L;
        System.out.println(_longOptions);
        ClassNumTest t1 = new ClassNumTest();
        int i = 300;
        byte b = (byte)i;
        i = 32769;
        float f = 32769;
        System.out.println(b);
        getInt(i);
        System.out.println(i);
        byte[] byteaArrays = new byte[10];
        ClassNumTest t2 = new ClassNumTest();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void getInt(int i){
        i += 9;
        System.out.println(i);
    }
}
