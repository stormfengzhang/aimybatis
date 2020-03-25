package com.southwind.test.synchronizedtest;

/**
 * synchronized关键字（修饰方法）
 * 使用不同实例对象不会阻塞，输出
 * get A…..
 * get B....
 * end B....
 * end A....
 */

public class NormalFunctionDemo {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                NormalFunctionDemo normalFunctionDemo = new NormalFunctionDemo();
                normalFunctionDemo.getA();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                NormalFunctionDemo normalFunctionDemo2 = new NormalFunctionDemo();
                normalFunctionDemo2.getB();
            }
        }).start();
    }

    public synchronized void getA(){

        System.out.println("get A.....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end A ......");
    }


    public synchronized void getB(){

        System.out.println("get B......");

        System.out.println("end B......");
    }

}
