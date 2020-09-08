package com.powernode.thread;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();
        for(int i = 0; i<100;i++){
            System.out.println("主线程>>>>>"+i);
        }
        Thread.sleep(5000);
        mt.interrupt();

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 0; i<100;i++){
            System.out.println("支 线 程>>>>>"+i);
        }
    }
}
