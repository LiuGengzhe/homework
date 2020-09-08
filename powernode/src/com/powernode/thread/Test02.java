package com.powernode.thread;

public class Test02 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
//        System.out.println(currentThread.getName());
        Thread mt2 = new Thread(new MyThread02());
        System.out.println(mt2.getName());
        //        mt2.run();
        mt2.start();
//        mt2.stop();
        for (int i = 0;i<100;i++){
            System.out.println(currentThread.getName()+">>>>>"+i);
        }

    }
}
class MyThread02 implements Runnable{
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        for(int i = 0; i<100;i++){
            System.out.println(currentThread.getName()+">>>>>"+i);
        }
    }
}
