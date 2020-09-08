package com.powernode.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.powernode.reflect.Student");
        System.out.println(c.getTypeName());
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        Object o = c.newInstance();
        Field[] fields =  c.getFields();//获取public属性
        System.out.println(fields.length);
        for (Field data:fields){
            System.out.println(data.getName());
        }
        System.out.println("***********");
        Field[] fields1 = c.getDeclaredFields();
        System.out.println(fields1.length);
        for (Field data:fields1){
            System.out.println(data.getName());
        }
//        for (int i = 0;i<fields1.length;i++){
//            System.out.println(fields1[i].getName());
//        }
        System.out.println("*****************");
        for (Field data:fields1){
//            System.out.println(data.getModifiers());
            System.out.print(Modifier.toString(data.getModifiers())+" ");
            System.out.print(data.getType().getSimpleName()+" ");
            System.out.println(data.getName());
        }
        System.out.println("*******************");
        Field fno = c.getDeclaredField("no");
        Field fname = c.getDeclaredField("name");
        fno.set(o,100);
        fname.setAccessible(true);
        fname.set(o,"ls");
        System.out.println(fno.get(o));
        System.out.println(fname.get(o));
        System.out.println("*******************");
//        fname.setAccessible(false);
//        fname.set(o,"zss");
//        Date d = new Date(0);
//        System.out.println(d);
        Method msum = c.getDeclaredMethod("sum", int.class, int.class);
        Object sum = msum.invoke(o,2,5);
        System.out.println(sum.getClass());
        System.out.println(sum);
        c.getDeclaredConstructors();
        System.out.println("***************");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods){
            Class[] classes = method.getParameterTypes();
            for (Class c2 : classes){
                System.out.println(c2.getSimpleName());
            }
        }
    }
}
