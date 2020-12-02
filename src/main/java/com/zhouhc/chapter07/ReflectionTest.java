package com.zhouhc.chapter07;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class ReflectionTest {

    public ReflectionTest() {
    }

    private int i = 0;

    public void count() {
        i++;
    }

    public void sayI() {
        System.out.println(i);
    }

    public static void main(String[] args) throws Throwable {
        ReflectionTest reflectionTest = new ReflectionTest();
        reflectionTest.count();
        MethodType methodType = MethodType.methodType(void.class);
        MethodHandle methodHandle = MethodHandles.lookup().findVirtual(reflectionTest.getClass(),"sayI",methodType);
        methodHandle.invokeExact(reflectionTest);
        methodHandle.invokeExact(new ReflectionTest());
    }
}
