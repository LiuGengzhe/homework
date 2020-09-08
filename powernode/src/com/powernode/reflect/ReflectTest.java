package com.powernode.reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) {
        Properties p = new Properties();
        FileInputStream fr = null;
        try {
            fr = new FileInputStream("powernode/src/com/powernode/reflect/classinfo.properties");
            p.load(fr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        System.out.println(p.getProperty("className"));
        String className = p.getProperty("className");
        Class c;
        Object o = null;
        try {
            c = Class.forName(className);
            o = c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(o);
        String lujing = Thread.currentThread().getContextClassLoader().getResource("com/powernode/reflect/classinfo.properties").getPath();
        System.out.println(lujing);
    }
}
