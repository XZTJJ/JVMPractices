package com.zhouhc.chapter02;

/*
  * 测试常量池溢出， 因为从jdk7以后常量池从永久代从分离出来了
  * jdk7以前使用的是 Vm Args :  -XX:PermSize=12M -XX:MaxPermSize=10M
  * jdk7以及以后的版本  Vm Args :  -XX:MaxMetaspaceSize=10M
  *
 */

import java.util.HashSet;
import java.util.Set;

//主要是通过 String 的 intern()方法进行加载的
public class RuntimeConstantPoolOOM {
    //测试
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<String>();
        int i = 0;
        while (true){
            stringSet.add(String.valueOf(++i).intern());
            stringSet.add(String.valueOf(++i).intern());
            stringSet.add(String.valueOf(++i).intern());
            stringSet.add(String.valueOf(++i).intern());
            stringSet.add(String.valueOf(++i).intern());
            stringSet.add(String.valueOf(++i).intern());
            stringSet.add(String.valueOf(++i).intern());
            stringSet.add(String.valueOf(++i).intern());
            stringSet.add(String.valueOf(++i).intern());
        }
    }
}
