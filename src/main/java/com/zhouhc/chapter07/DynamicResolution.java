package com.zhouhc.chapter07;

import java.util.function.Function;

public class DynamicResolution {
    public static void main(String[] args) {
        //将JVM自动生成的lambda代理类输出到目录中中
        System.setProperty("jdk.internal.lambda.dumpProxyClasses", "C:\\Users\\f1355\\Desktop\\java_zhouhc_20201109");
        //方法解析
        String str = new String("I am very stupid");
        //生成动态调用点
        Function<String, Integer> function = (s) -> {
            return s.length();
        };

        int length = function.apply(str);
        System.out.println(length);
    }


    //MethodHandle也就是方法句柄，只有在运行时才能确定，方法的接受者(也就是方法所在类)，
    //不管在什么语言中，要调用一个方法就必须明确知道下面三个信息
    /**  先注释掉。
     * 1.方法的接受者，也就是方法所在的类，只要明确了所在的类才能去对应的类中查找
     * 2.方法的名称 ： 在一个类中大概率是存在多个方法的，只有通过方法的名称才能知道方法
     * 3.方法的描述符(方法类型) : 如果一种需要允许方法重载的话，那么有可能存在方法名称重复的情况，这个为了进一步
     *   明确要调用的方法，就需要方法的描述符，方法的描述符一般是这样的 (L/java.lang.String)V 表示
     *   的是接受一个String类型参数，返回值为void。
     */
    /**
     public static void getPrintlnMH(Object reveiverClass) throws Throwable {
     //首先确定方法的描述符，因为参数是可以多个的，而返回值是有一个，所以一般把返回值现在前面，在Java中 ，使用MehtodType来支持动态类型的
     //方法描述，对于而动态的直接使用Methodref来描述就好
     MethodType methodType = MethodType.methodType(String.class, int.class);
     //lookup()方法指定查找的上下文，作用是LambdaMetafactory在指定的类中查找符合给定方法名称，方法类型，并且符合调用权限的方法句柄
     //findStatic 对应静态方法中的字节码方法的调用
     MethodHandle methodHand = MethodHandles.lookup().findStatic(reveiverClass.getClass(), "toBinaryString", methodType);
     String result = (String) methodHand.invoke(2);
     System.out.println(result);
     }
     */
}
