package com.powernode.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ObjectStreamTest03 {
    public static void main(String[] args) throws Exception {
        List<Student> l = new LinkedList<>();
        l.add(new Student(1000,15));
        l.add(new Student(1006,16));
        l.add(new Student(1005,17));
//        for (Student node:l){
//            System.out.println(node);
//        }
//        System.out.println("************");
//        Iterator i = l.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("powernode\\src\\com\\powernode\\io\\objStream"));
        oos.writeObject(l);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("powernode\\src\\com\\powernode\\io\\objStream"));
        Object o =ois.readObject();
        if(o instanceof List){
            List<Student> l2 = (List<Student>)o;
//            for (Object node:l2){
//                System.out.println(node);
//            }
            Iterator<Student> i = l2.iterator();
            while (i.hasNext()){
                System.out.println(i.next());
            }
        }
        ois.close();
    }
}
