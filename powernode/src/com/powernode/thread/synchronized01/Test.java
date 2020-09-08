package com.powernode.thread.synchronized01;

public class Test {
    public static void main(String[] args) {
        Do d1 = new Do();
        Do d2 = new Do();
        Sy s1 = new Sy(d1);
        Sy s2 = new Sy(d2);
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}


class Sy implements Runnable{
    private Do d;

    public Sy(Do d) {
        this.d = d;
    }

    public Do getD() {
        return d;
    }

    public void setD(Do d) {
        this.d = d;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName() == "t1"){
            d.doSome();
        }
        else {
            d.doOther();
        }
    }


}



class Do{
    public synchronized static void doSome(){
            System.out.println(Thread.currentThread().getName() + "dosome begin");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "doother over");
    }
    public synchronized void doOther(){
            System.out.println(Thread.currentThread().getName() + "doother begin");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "doother over");
    }

}
