package com.zhouhc.chapter08;

import java.util.Random;

/**
 * 测试方法的重载
 */
public class StaticDispatch {
    static abstract class Human {

    }

    static class Man extends Human {

    }

    static class Woman extends Human {

    }

    public void sayHello(Human guy) {
        System.out.println("hello,guy!");
    }

    public void sayHello(Man guy) {
        System.out.println("hello,gentlmen!");
    }

    public void sayHello(Woman guy) {
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);
        sr.sayHello(woman);

        //测试类型变化
        Human human = (new Random().nextBoolean() ? new Man() : new Woman());
        sr.sayHello((Man) human);
        sr.sayHello((Woman) human);
    }
}
