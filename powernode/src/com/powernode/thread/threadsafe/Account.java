package com.powernode.thread.threadsafe;

public class Account {
    private String act;
    private double money;

    public void takeMoney(double m){
        synchronized (act){
            double nowMoney = this.getMoney() - m;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setMoney(nowMoney);
            Thread now = Thread.currentThread();
            System.out.println("用户"+now.getName()+"对"+this.getAct()+"取款"+m+"成功，剩余"+nowMoney);

        }
    }
    public Account(String act, double money) {
        this.act = act;
        this.money = money;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
