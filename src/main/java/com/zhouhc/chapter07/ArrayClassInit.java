package com.zhouhc.chapter07;

import java.util.Random;

public class ArrayClassInit {

    public static void main(String[] args) {
        ArrayClass[] arrayClasses = new ArrayClass[10];
    }

    //测试类
    public static class ArrayClass {
        public final static int value = new Random().nextInt();

        static {
            System.out.println("ArrayClass 初始化了");
        }
    }
}
