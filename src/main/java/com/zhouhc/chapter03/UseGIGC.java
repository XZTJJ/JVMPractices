package com.zhouhc.chapter03;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用ParallelGC
 * vm args : -XX:+PrintCommandLineFlags -XX:+UseG1GC -Xmx100m -Xms100m -XX:+PrintGCDetails
 *
 */
public class UseGIGC {
    public static void main(String[] args) {
        System.out.println("正在使用G1 GC");
        //测试使用Parallel
        List<Byte[]> bytesList = new ArrayList<Byte[]>();
        while (true) {
            for (int i = 0; i < 100; i++) {
                bytesList.add(new Byte[1024]);
                try {
//                    Thread.sleep(5);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

//            if (bytesList.size() >= 300)
//                bytesList.clear();
        }
    }
}
