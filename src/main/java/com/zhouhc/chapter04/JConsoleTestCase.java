package com.zhouhc.chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *  VM args : -Xmx100m -Xms100m -XX:+UseSerialGC
 *
 */


public class JConsoleTestCase {

    /*
     *  设置一个对象
     */
    static class OOMObject{
        public byte[] placeholder = new byte[64*1024];
    }

    public static void fillHeap(int num) throws InterruptedException{
        List<OOMObject>  oomObjects = new ArrayList<OOMObject>();
        for(int i =0;i<num;i++){
            TimeUnit.MILLISECONDS.sleep(50);
            oomObjects.add(new OOMObject());
        }
        //强制gc一下
        System.gc();
    }

    public static void main(String[] args) throws Exception{
        fillHeap(1000);
        //以下的命令纯粹是为了从图形化界面看出相关的内存变化情况。
        System.gc();
        System.out.println("准备输入!!!!!");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        System.out.println(s);
    }
}