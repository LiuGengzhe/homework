package com.powernode.test;

public class ChushihuaTest {
    public static void main(String[] args) {
        int i;
//        i=1;

//        System.out.println(i);
        A a = new A();
        System.out.println(a.a);
    }
}
class A{
    int a;

    public A() {
    }

    public A(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        int i;
        A a = new A();
        A b = new A();
        System.out.println(a.a+","+b.a);
//        System.out.println(i);
    }
}
