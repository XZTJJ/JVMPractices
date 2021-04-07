package com.zhouhc.chapter02;

/**
 * 测试字面量的存储位置
 * 证明jdk7以后就讲字面量放入堆中
 * <p>
 */
public class StringConstantTest {
    public static void main(String[] args) {
        //jdk 7 以前 false 会在永久代和堆中创建两个对象
        /**
         *   jdk 7 以后(包含jdk 7) 是false,
         *   new String("字面量测试1") 创建了两个对象
         *   一个是堆中的对象，一个是常量池的对象。str1指向的是
         *   堆中的对象，而 str2指向的是常量池中的对象。
         */
        String str1 = new String("字面量测试1");
        String str2 = str1.intern();
        System.out.println("str2 == str1 :" + (str2 == str1));

        //jdk 7 以及以前  true 会在永久代和堆中创建两个对象
        /**
         *   jdk 7 以后(包含jdk 7 ) 是true, 因为常量池被移入到了
         * 堆空间 , 当常量池中不存在的时候，intern压入常量池是 创建一个
         * 指向 堆中变量的引用。
         */
        String str3 = new String("字面量测试2");
        str3 = str3.intern();
        String str4 = "字面量测试2";
        System.out.println("str3 == str4 :" + (str3 == str4));


        //所有jdk 都为 false
        String str5 = new String("字面量测试2");
        String str6 = new String("字面量测试2");
        System.out.println("str5 == str6 : " + (str5 == str6));

        //jdk 7 以及以前 false 会在永久代和堆中创建两个对象
        /**
         *   jdk 7 以后(包含jdk 7 ) 是true, 因为 "计算机" , "软件"
         * 分别存在常量池中，而 "计算机软件" 不存在常量池中，当 StringBuilder.toString()
         *  会创建一个新的Stirng类型，内容就是"计算机软件"的char[]数组形式，当压入常量池中
         *  时，为了节省内存才会，直接保存了堆中对象的指针。
         */
        String str7 = new StringBuilder("计算机").append("软件").toString();
        String str8 = str7.intern();
        System.out.println("str7 == str8 : " + (str7 == str8));

        //都是false,以为java作为jdk的变量早就被压入了常量池了
        String str9 = new StringBuilder("ja").append("va").toString();
        String str10 = str9.intern();
        System.out.println("str9 == str10 :" + (str9 == str10));
    }
}
