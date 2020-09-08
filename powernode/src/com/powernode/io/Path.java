package com.powernode.io;

import org.junit.Test;

import java.io.FileInputStream;

public class Path {
    @Test
    public void demo() throws Exception{
        FileInputStream fis = new FileInputStream("src/com/powernode/io/buffer.txt");
        System.out.println(fis);
    }

    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("powernode/src/com/powernode/io/buffer.txt");
        System.out.println(fis);
    }
}
