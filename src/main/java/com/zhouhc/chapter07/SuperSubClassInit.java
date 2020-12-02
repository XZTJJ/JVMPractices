package com.zhouhc.chapter07;

import java.util.Random;

public class SuperSubClassInit {

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }

    //父类
    public static class SuperClass {
        public final static int value = new Random().nextInt();

        static {
            System.out.println("SuperClass 初始化了");
        }
    }
    //子类
    public static class SubClass extends SuperClass {
        static {
            System.out.println("SubClass 初始化了");
        }
    }
}
