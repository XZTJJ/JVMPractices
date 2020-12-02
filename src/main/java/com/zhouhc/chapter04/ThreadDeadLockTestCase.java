package com.zhouhc.chapter04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

//演示的是线程，所以这里是不需要指定vm参数的
public class ThreadDeadLockTestCase {

    /**
     * 死循环演示
     */
    public static void createBusyThread() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    ;
            }
        }, "testBusyThread");

        thread.start();
    }

    /**
     * 线程锁等待演示
     */
    public static void createLockThread(final Object obj) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "testLockThread");
        thread.start();
    }

    /**
     * 正常的线程等待
     */
    public static void createNormalThread() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("线程" + Thread.currentThread().getName() + "开始休眠了");
                    TimeUnit.SECONDS.sleep(10);
                    System.out.println("线程" + Thread.currentThread().getName() + "结束");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                }
            }
        }, "testNormalThread");
        thread.start();
    }

    /**
     * 线程死锁演示
     */
    private static class DeadLockRunnable implements Runnable {
        private int a;
        private int b;

        public DeadLockRunnable(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (Integer.valueOf(a)) {
                synchronized (Integer.valueOf(b)) {
                    System.out.println(a + b);
                }
            }
        }
    }

    public static void createDeadLockThread() {
        for (int i = 0; i < 100; i++) {
            new Thread(new DeadLockRunnable(1, 2)).start();
            new Thread(new DeadLockRunnable(2, 1)).start();
        }
    }

    //主方法
    public static void main(String[] args) throws IOException {
        //开始使用
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        System.out.println("开始演示死循环");
        createBusyThread();

        s = bufferedReader.readLine();
        System.out.println("开始演示线程等待");
        createLockThread(new Object());

        s = bufferedReader.readLine();
        System.out.println("开始演示正常线程");
        createNormalThread();

        s = bufferedReader.readLine();
        System.out.println("开始演示线程死锁");
        createDeadLockThread();

    }
}
