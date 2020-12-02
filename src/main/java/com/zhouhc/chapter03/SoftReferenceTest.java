package com.zhouhc.chapter03;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * 软引用测试，只有当内存不足的时候才会清楚软引用
 * vm args : -Xms5m -Xmx5m -XX:+PrintGCDetails(可以考虑不要)
 */
public class SoftReferenceTest {


    //java中有一个单独的软引用类型
    public static void main(String[] args) throws Exception {
        //创建软引用
        //一定要是对象才行，不能是字面量
        SoftReference<String> stringSoftReference = new SoftReference<String>(new String("软引用测试，只有内存不足时才回收"));
        System.out.println(stringSoftReference.get());
        System.gc();
        //需要通过GC日志精确的控制内存,需要预留一部分数据
        byte[] bytes1 = new byte[1024 * (4096 - 610)];
        System.out.println(stringSoftReference.get());

    }
}
