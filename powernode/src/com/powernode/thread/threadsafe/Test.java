package com.powernode.thread.threadsafe;

public class Test {
    public static void main(String[] args) {
        Account acc = new Account("acc-001",10000);
        AccThread at = new AccThread(acc);
        Thread t1 = new Thread(at);
        Thread t2 = new Thread(at);
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}
