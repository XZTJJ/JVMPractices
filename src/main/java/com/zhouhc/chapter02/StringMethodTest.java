package com.zhouhc.chapter02;

/**
 * 测试字面量的存储位置
 * 证明jdk7以后就讲字面量放入堆中
 */
public class StringMethodTest {
    public static void main(String[] args) {
        String str1 = new String("字面量测试1");
        str1.intern();
        System.out.println(str1 == str1);

        String str2 =  new String("字面量测试2");
        String str3 = "字面量测试2";
        System.out.println(str2 == str3);
    }
}
