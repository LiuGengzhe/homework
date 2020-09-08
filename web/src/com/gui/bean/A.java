package com.gui.bean;

public class A<T> {
    static {
        System.out.println("父类的静态代码块执行");
    }

    {
        System.out.println("父类的实例代码块执行");
        this.dosome();
    }
    private String s = "私有";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void dosome(){
        System.out.println("父类的dosome()");
    }
}
