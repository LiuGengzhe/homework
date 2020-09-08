package com.powernode.suanfa;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{213,432,52,12,2,442,1};
//        Bubble.bubble(a);
        Quick.quick(a);
        PrintArray.printArray(a);
        System.out.println("*****************");
        System.out.println(Half.half(a,432));
    }
}
