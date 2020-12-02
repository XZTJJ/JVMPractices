package com.zhouhc.chapter10;

public class ObjectToOrgTest {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        // == 比较的是地址
        // equals比较的是值
        System.out.println(c == d);  //true
        System.out.println(e == f);  //false
        System.out.println(c == (a + b));  //true
        System.out.println(c.equals(a + b));  //true
        System.out.println(g == (a + b));  //true ==是处理窄类型到宽类型转换关系的，但是不处理自动拆箱
        System.out.println(g.equals(a + b));  //false equals 是不处理窄类型到宽类型转换关系的，但是处理自动拆箱
    }

}