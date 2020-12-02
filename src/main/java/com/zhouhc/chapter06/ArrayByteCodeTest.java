package com.zhouhc.chapter06;

public class ArrayByteCodeTest {

    public static void main(String[] args) {
        int[] intSpace = new int[8];
        float[] floatSpace = new float[9];
        byte[] byteSpace = new byte[10];
        long[] longSpace = new long[11];
        Object[] objectSpace = new Object[12];

        //二位数组
        int[][] intTwoSpace = new int[8][9];
        float[][] floatTwoSpace = new float[9][10];
        byte[][] byteTwoSpace = new byte[10][11];
        long[][] longTwoSpace = new long[11][12];
        Object[][] objectTwoSpace = new Object[12][13];

        //三位数组
        int[][][] intThridSpace = new int[8][8][8];
        float[][][] floatThridSpace = new float[9][9][9];
        byte[][][] byteThridSpace = new byte[10][10][10];
        long[][][] longThridSpace = new long[11][11][11];
        Object[][][] objectThridSpace = new Object[12][12][12];
        System.out.println("数组字节码查看");

        boolean remark = true;
        if(remark)
            System.out.println("true , 布尔类型为true");
        else
            System.out.println("false , 布尔类型为false");
        System.out.println("布尔类型为比较完毕");

        //条件跳转指令
        long l1 = 9;
        long l2 = 11;
        if (l1 < l2)
            System.out.println("true , 长整形l1");
        else
            System.out.println("false , 长整形l2");
        System.out.println("长整形比较完毕");

        int i1 = 200;
        int i2 = 201;
        if (i1 < i2)
            System.out.println("yes,200");
        else
            System.out.println("yes,201");
        System.out.println("整形比较完毕");

        String str1 = "200";
        String str2 = "201";
        if (str1 == str2)
            System.out.println("yes,String 200");
        else
            System.out.println("yes, String 201");
        System.out.println("String比较完毕");

        int switchLong = 9;
        switch (switchLong){
            case 0 :
                System.out.println("这是0");
                break;
            case 1:
                System.out.println("这是1");
                break;
            case 2:
                System.out.println("这是2");
                break;
                //测试连续和不连续
            case 5:
                System.out.println("这是5");
                break;
        }

        EmumTest emumTest = null;
        switch(emumTest){
            case ONE:
                System.out.println("One");
                break;
            case TWO:
                System.out.println("One");
                break;
        }

    }

     static enum EmumTest{
        ONE,TWO

    }

}
