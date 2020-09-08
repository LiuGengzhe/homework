package cn.tedu.homework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTest01 {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("powernode/src/cn/tedu/homework/a.txt","rw");

//            System.out.println(raf.length());
            byte[] inbytes = "123456".getBytes();
            byte[] tempbytes =new byte[100];
            byte[] outBytes = new byte[100];
            raf.seek(6);
            int i =raf.read(tempbytes);
            raf.seek(6);
            raf.write(inbytes,0,inbytes.length);
            raf.write(tempbytes,0,i);
            raf.seek(0);
//            System.out.println(raf.read(outBytes));
            System.out.println(new String(outBytes,0,raf.read(outBytes)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
