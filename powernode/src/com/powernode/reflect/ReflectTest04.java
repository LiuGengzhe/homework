package com.powernode.reflect;

import java.lang.reflect.*;

public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        Class stuClass = Student.class;
        Constructor constructor = stuClass.getDeclaredConstructor();
        Method method = stuClass.getDeclaredMethod("sum",int.class,int.class);
        Object o = constructor.newInstance();
        System.out.println(method.invoke(o,100,420));
        //        System.out.println(stuClass.getSimpleName());
        Field[] fields = stuClass.getDeclaredFields();
        for (Field field:fields){
            System.out.println(Modifier.toString(field.getModifiers()));
        }
        Field noField = stuClass.getDeclaredField("no");
        noField.set(o,100);
        System.out.println(noField.get(o));
    }
}
