package com.powernode.io;

import java.io.Serializable;

public class Student implements Serializable {
//    private static final long serialVersionUID = 8683452581122892189L;
    private int id;
    private int age;
    private int sex;

    public Student() {
    }

    public Student(int id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student(10,20);
        Student s2 = new Student(10,30);
        System.out.println(s1.equals(s2));
    }
}
