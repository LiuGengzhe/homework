package com.powernode.thread.buyticket;


public class Test {
    public static void main(String[] args) {
        TicketTot tt = new TicketTot(100);
//        assert true;
        for (int i = 1;i<101;i++){
            Thread t = new Thread(new BuyTicketThread(tt));
            t.setName("t"+i);
            t.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        HashMap m = new HashMap();
//        m.get();
    }
}


class BuyTicketThread implements Runnable{
    private TicketTot t;

    public BuyTicketThread(TicketTot t) {
        this.t = t;
    }

    public TicketTot getT() {
        return t;
    }

    public void setT(TicketTot t) {
        this.t = t;
    }

    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName());

        synchronized (this.t){
            int before = t.getTotal();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int after = before - 1;
            t.setTotal(after);
            System.out.println("当前剩余"+before+"张票，用户"+Thread.currentThread().getName()+"购买一张后剩余"+after);
        }
    }
}

class TicketTot{
    private int total;

    public TicketTot(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
