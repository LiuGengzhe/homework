package com.powernode.io;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        FileInputStream is = null;
        byte[] bytes = new byte[4];
        int readCounts;
        try {
            is = new FileInputStream("powernode/src/com/powernode/io/lianxi");
            while ((readCounts = is.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readCounts));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
