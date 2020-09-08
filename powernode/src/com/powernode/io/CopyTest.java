package com.powernode.io;

import java.io.*;

public class CopyTest implements Serializable {
    public static final double PI = 3.14;
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        byte[] bytes = new byte[1024*1024];
        int readCounts = 0;
        try {
            in = new FileInputStream("F:\\[190719]RADWIMPS - 天気の子\\愛にできることはまだあるかい.flac");//源文件目录
            out = new FileOutputStream("F:愛にできることはまだあるかい.flac");//目标位置
            while((readCounts = in.read(bytes)) != -1){
                out.write(bytes,0,readCounts);//写入目标位置
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();//关闭输入流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();//关闭输出流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
