package com.powernode.thread.alternate;

public class Alternate {
    public static void main(String[] args) {
        Integer i=Integer.valueOf(1);
        Object o = new Object();
        OddNum odd = new OddNum(i,o);
        EvenNum even = new EvenNum(i,o);
        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class OddNum implements Runnable{
    Integer i;
    Object o;

    public OddNum(Integer i,Object o) {
        this.i = i;
        this.o = o;
    }

    @Override
    public void run() {
        while(true){
            synchronized(o){
                int j = i.intValue();
                if (j%2 == 0){
                    try {
                        System.out.println("t1睡前"+i);
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"--->"+j);
                j++;
                i = Integer.valueOf(j);
                o.notify();
            }
        }
    }
}

class EvenNum implements Runnable{
    Integer i;
    Object o;

    public EvenNum(Integer i,Object o ) {
        this.i = i;
        this.o = o;
    }

    @Override
    public void run() {
        while(true){
            synchronized(o){
                int j = i.intValue();
                System.out.println("t2的i是"+i);
                if(j%2 != 0){
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"--->"+j);
                j++;
                i = Integer.valueOf(j);
                o.notify();
            }
        }
    }
}
