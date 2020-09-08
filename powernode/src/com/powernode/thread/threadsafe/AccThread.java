package com.powernode.thread.threadsafe;

public class AccThread implements Runnable{
    private Account acc;

    public AccThread(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
       acc.takeMoney(5000);
    }
}
