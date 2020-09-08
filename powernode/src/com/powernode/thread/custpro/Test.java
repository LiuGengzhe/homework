package com.powernode.thread.custpro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List list = new ArrayList();
        Thread pro = new Thread(new Producer(list));
        Thread cus = new Thread(new Customer(list));
        pro.setName("生产者线程");
        cus.setName("消费者线程");
        pro.start();
        cus.start();
    }
}

class Producer implements Runnable{
    List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            synchronized(this.list){
                if (list.size() >=10){
                    try {
                        list.notify();
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = new Object();
                list.add(o);
                System.out.println("生产者生产了"+o+",当前容量"+list.size());

            }
        }
    }
}

class Customer implements  Runnable{
    List list;

    public Customer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            synchronized(this.list){
                if (list.size() == 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Iterator i = list.iterator();
                while (i.hasNext()){
                    System.out.println("消费者消费了"+i.next()+",当前容量"+(list.size()-1));
                    i.remove();
                }
                /*for (Object o : list){
                    System.out.println("消费者消费了"+o+",当前容量"+list.size());
                }*/
                list.clear();
                list.notify();
            }
        }
    }
}
