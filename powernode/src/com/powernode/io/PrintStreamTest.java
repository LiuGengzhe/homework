package com.powernode.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("printStreamTest");
//        ps.println("nihao");
        System.setOut(ps);
        byte[] bytes = new byte[]{97,122,90};
        ps.write(bytes,0,3);
        System.out.println("HelloWorld");

    }

}
