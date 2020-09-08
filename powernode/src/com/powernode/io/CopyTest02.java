package com.powernode.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest02 {
    public static void main(String[] args) {

        FileOutputStream out = null;
        FileInputStream in = null;
        try {
            in = new FileInputStream("F:\\老友记\\S03\\Friends.S03E12.1996.BluRay.720p.x264.AAC-iSCG.mp4");
            out = new FileOutputStream("F:/Test");
            int readCounts = 0;
            byte[] bytes = new byte[1024*1024];
            while((readCounts = in.read(bytes)) != -1){
                out.write(bytes,0,readCounts);
            }
            out.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
