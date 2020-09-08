package com.powernode.thread.alternate;

public class Alternate02 {
    public static void main(String[] args) {
        Num n = new Num(1);
        OddNum02 odd = new OddNum02(n);
        EvenNum02 even = new EvenNum02(n);
        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
class Num{
    int i;

    public Num(int i) {
        this.i = i;
    }
}
class OddNum02 implements Runnable{
    Num n;

    public OddNum02(Num n) {
        this.n = n;
    }

    @Override
    public void run() {
        while(true){
            synchronized(n){
                if ((n.i)%2 == 0){
                    try {
                        n.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"--->"+n.i);
                n.i++;
                n.notify();
            }
        }
    }
}

class EvenNum02 implements Runnable{
    Num n;

    public EvenNum02(Num n) {
        this.n = n;
    }

    @Override
    public void run() {
        while(true){
            synchronized(n){
                if((n.i)%2 != 0){
                    try {
                        n.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"--->"+n.i);
                n.i++;
                n.notify();
            }
        }
    }
}
