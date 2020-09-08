package com.gui.servlet;

public class Demo {
    public static void main(String[] args) {
        double[] nums = {-1.6};//-2 -1 0 1 2 3
        for (double num : nums) {
            test(num);
        }
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        System.out.println(path);
    }
    private static void test(double num) {
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));
    }
}
