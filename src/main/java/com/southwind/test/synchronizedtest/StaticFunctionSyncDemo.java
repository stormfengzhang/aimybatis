package com.southwind.test.synchronizedtest;

/**
 * synchronized关键字（修饰静态方法）
 * 不互斥，因为一个访问的是当前类的锁，一个访问的是当前实例对象锁。
 * 输出get A....
 * get B....
 * end B
 * end A
 * get A....
 * end A
 */
public class StaticFunctionSyncDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                StaticFunctionSyncDemo.getA();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                StaticFunctionSyncDemo staticFunctionSyncDemo = new StaticFunctionSyncDemo();
                staticFunctionSyncDemo.getB();
                staticFunctionSyncDemo.getA();
            }
        }).start();
    }

    public static synchronized void getA(){

        System.out.println("get A....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end A");
    }

    public synchronized void getB(){

        System.out.println("get B....");

        System.out.println("end B");
    }
}
