package com.powernode.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student(10,20);
        Student s2 = new Student(20,18);
        FileOutputStream fos = new FileOutputStream("powernode/src/com/powernode/io/objecttest");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
//        oos.writeObject(s2);//无法存储多个，不知道是第二个存不进去还是无法读取
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("powernode/src/com/powernode/io/objecttest");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        System.out.println(o.getClass());
        System.out.println(o);



    }
}
