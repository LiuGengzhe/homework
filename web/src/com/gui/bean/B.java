package com.gui.bean;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public class B extends A<String> {

    @Override
    public void dosome() {
        System.out.println("子类的dosome()");
    }

    public void getFanxing(){
        Type superclass = this.getClass().getGenericSuperclass();
        ParameterizedType x = (ParameterizedType) superclass;
        System.out.println(x);
    }

}


