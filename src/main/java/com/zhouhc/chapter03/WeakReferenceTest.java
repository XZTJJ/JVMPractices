package com.zhouhc.chapter03;

import java.lang.ref.WeakReference;

/**
 * 弱引用，证明只能被生存到下一次垃圾回收发生的时候
 */
public class WeakReferenceTest {

    public static void main(String[] args) {
        String str = new String("弱引用测试，只能生存到下一次垃圾回收发生的时候");
        WeakReference<String> weakReference = new WeakReference<String>(str);
        //这一步的意义是，因为str是个强引用，不用时一定要置空不然会导致内存回收不了
        str = null;
        System.out.println(weakReference.get());
        //强制调用垃圾回收器
        System.gc();
        System.out.println(weakReference.get());
    }

}
