package com.powernode.test;

import java.io.PrintStream;
import java.util.StringJoiner;

public class Test {
    private int i;

    void dosome(){
        int x = 1;
//        x = 2;
        class Z{
            int j = 1;
            public void dosome(){
                System.out.println(x);
            }

        }
        Z a = new Z();

    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        Test t =new Test();
        try {
            t.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.notify();
//        Object o = a;
        String s = new String("sss");
//        Test.dosome();
        System.out.println(a);
//        System.out.println(t);
//        t.dosome();
//        PrintStream ps = new PrintStream();
//        String
        Integer m = 127;
        Integer n = 127;
        System.out.println(System.identityHashCode(m));
        System.out.println(System.identityHashCode(n));
        StringBuffer sb = new StringBuffer("sb");
        StringBuffer sb1 = sb.append(100);
        System.out.println(sb1);
        sb1.insert(1,"*");
//        sb1.delete(0,1);
//        sb1.delete(sb1.length()-1,sb1.length());
        System.out.println(sb1);
//        StringJoiner sj = new StringJoiner(",","123","456");
//        sj.add("***");
//        sj.add("BBB");
//        System.out.println(sj);
    }
}
