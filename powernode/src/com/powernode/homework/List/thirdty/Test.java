package com.powernode.homework.List.thirdty;

public class Test {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        MyLinkedList mll = new MyLinkedList();
        System.out.println(mll.length);
        System.out.println(mll.header);
        mll.add(o1);
        System.out.println(mll.length);
        System.out.println(mll.header);
        mll.add(o2);
        System.out.println(mll.length);
        System.out.println(mll.header.next);
        mll.add(o3);
        System.out.println(mll.length);
        System.out.println(mll.header.next.next);
        System.out.println("*******************");
        mll.delete(o1);
        System.out.println(mll.length);
        System.out.println(mll.header);
    }
}
