package com.zhouhc.chapter07;


public class ConstantInit {
    public static void main(String[] args) {
        System.out.println(ConstantClass.VALUE);
        System.out.println(ConstantClass.STR);
    }

    //测试类
    public static class ConstantClass {
        public final static int VALUE = 10;
        public final static String STR = "hello";

        static {
            System.out.println("ConstantClass 初始化");
        }
    }
}
