package com.powernode.test;

public class Path {
    public static void main(String[] args) {
        String path = Thread.currentThread().getContextClassLoader().getResource("family.xml").getPath();
        System.out.println(path);
    }
}
