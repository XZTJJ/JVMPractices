package com.zhouhc.chapter02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * VM args -Xms20m -Xmx20m -XX:+PrintGCDetails
 */
public class HeapOOM {

    //只是主类
    public static void main(String[] args) throws Exception {
        //测试对象
        List<Object> list = new ArrayList<Object>();
        //测试heap 溢出
        while (true) {
            //分配512K的数组对象
            list.add(new byte[1024*512]);
            TimeUnit.MILLISECONDS.sleep(200);
        }
    }
}
