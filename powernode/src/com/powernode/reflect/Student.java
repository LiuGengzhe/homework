package com.powernode.reflect;

public class Student {
    public int no;
    protected double money;
    boolean sex;
    private String name;

    static {
        System.out.println("静态代码块执行");
    }
    {
        System.out.println("实例代码块执行");
    }

    public Student() {
        System.out.println("Student类无参构造执行");
    }
    public int sum(int a,int b){
        return a+b;
    }

    public Student(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                '}';
    }
    public void dosome(){
        System.out.println("dosome !!!");
    }
}
