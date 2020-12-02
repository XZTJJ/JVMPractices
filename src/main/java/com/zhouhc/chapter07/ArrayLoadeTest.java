package com.zhouhc.chapter07;

//看看数组的加载过程

/**
 * vm args :  -XX:+TraceClassLoading -verbose:class
 *
 */
public class ArrayLoadeTest {

    public static void main(String[] args) throws Exception {
        int[] ints = new int[10];
        System.out.println("ints[]的类加载器为:" + ints.getClass().getClassLoader());
        byte[][] bytes = new byte[9][9];
        System.out.println("bytes[][]的类加载器为:" + bytes.getClass().getClassLoader());
        System.out.println("bytes[]的类加载器为:" + bytes[0].getClass().getClassLoader());
        float[][][] floats = new float[8][8][8];
        System.out.println("floats[][][]的类加载器为:" + floats.getClass().getClassLoader());
        System.out.println("floats[][]的类加载器为:" + floats[0].getClass().getClassLoader());
        System.out.println("floats[]的类加载器为:" + floats[0][0].getClass().getClassLoader());

        FieldInitTest[][][] arrayLoadeTests = new FieldInitTest[7][7][7];
        System.out.println("arrayLoadeTests[][][]的类加载器为:" + arrayLoadeTests.getClass().getClassLoader());
        System.out.println("arrayLoadeTests[][]的类加载器为:" + arrayLoadeTests[0].getClass().getClassLoader());
        System.out.println("arrayLoadeTests[]的类加载器为:" + arrayLoadeTests[0][0].getClass().getClassLoader());

    }

}
