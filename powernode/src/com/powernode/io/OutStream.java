package com.powernode.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutStream {
    public static void main(String[] args) {
        final int i ;
        System.out.println();
        FileOutputStream file = null;
        byte[] bytes = new byte[]{65,66};
        try {
            file = new FileOutputStream("powernode/src/com/powernode/out.txt");
            file.write(bytes);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
