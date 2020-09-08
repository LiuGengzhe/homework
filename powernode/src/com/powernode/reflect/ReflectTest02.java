package com.powernode.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
        Class c = null;
        Object o = null;
        Object o2 = null;
        try {
            c = Class.forName("com.powernode.reflect.Student");
            System.out.println("************");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            o = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Constructor con = c.getDeclaredConstructor(int.class);
        o2 = con.newInstance(100);
        if(o instanceof Student)
            ((Student)o).dosome();
        System.out.println(o);
        System.out.println(o2);
    }
}
