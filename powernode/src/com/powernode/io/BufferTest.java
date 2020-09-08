package com.powernode.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferTest {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("powernode/src/com/powernode/io/buffer.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream());
//        bos.write();
//        System.out.println(bis.read());
        System.out.println(bis.read(new byte[20],0,4));
//        System.out.println(bis.read());
        bis.close();
    }
}
