package com.powernode.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectStreamTest02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream fis = new ObjectInputStream(new FileInputStream("powernode/src/com/powernode/io/objecttest"));
        Object o = fis.readObject();
        System.out.println(o.toString());
        String s = "as";

    }
}
