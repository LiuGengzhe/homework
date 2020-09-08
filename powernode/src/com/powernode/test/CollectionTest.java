package com.powernode.test;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<Stu> l1 = new ArrayList<>();
        l1.add(new Stu(10));
        l1.add(new Stu(4));
        l1.add(new Stu(15));
        l1.add(new Stu(4));
        System.out.println(l1.size());
        Iterator<Stu> i = l1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
//            i.remove();
        }
        System.out.println(l1.size());

//        for (int i = 0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }

//        for (Stu data : l1){
//            System.out.println(data);
//        }


        System.out.println("*****************");
        Set<Stu1> s1 = new TreeSet<>(new Stu1Compare());
        s1.add(new Stu1(10)); //往TreeSet中添加元素需要重写compareTo方法 或者传入一个比较器
        s1.add(new Stu1(5));
        s1.add(new Stu1(8));
        s1.add(new Stu1(10));
        s1.add(new Stu1(4));
        s1.add(new Stu1(1));

        System.out.println(s1.size());
        s1.remove(new Stu1(10));
        for (Stu1 data:s1){
            System.out.println(data);
        }
//        Iterator<Stu1> i1 = s1.iterator();
//        while(i1.hasNext()){
//            System.out.println(i1.next());
//            i1.remove();
//        }


        System.out.println(s1.size());

        System.out.println("********************");
        Set<Stu2> s2 = new HashSet<>();  //往HashSet里添加数据需要重写equals和hashCode方法
        s2.add(new Stu2(100));
        s2.add(new Stu2(500));
        s2.add(new Stu2(300));
        s2.add(new Stu2(400));
        s2.add(new Stu2(100));
        System.out.println(s2.size());

//        Iterator<Stu2> i2 = s2.iterator();
//        while (i2.hasNext()){
//            System.out.println(i2.next());
//            i2.remove();
//        }
        System.out.println(s2.size());
        System.out.println("******************");
        List<Stu1> lt1 = new ArrayList<>(s1);
        for (Stu1 node : lt1){
            System.out.println(node);
        }
        System.out.println("===================");
        System.out.println(l1.size());
        Set<Stu> st2 = new TreeSet<>(l1);
        System.out.println(st2.size());
        for (Stu node:st2){
            System.out.println(node);
        }






    }
}

class Stu implements Comparable<Stu>{
    int id;
    public Stu(){

    }
    public Stu(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stu stu = (Stu) o;

        return id == stu.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Stu o) {
        return this.id-o.id;
    }
}

class Stu1 {
    int id;
    public Stu1(){

    }
    public Stu1(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stu1{" +
                "id=" + id +
                '}';
    }

//    @Override
//    public int compareTo(Stu1 o) {
//        return this.id - o.id;
//    }
}

class Stu1Compare implements Comparator<Stu1>{


    @Override
    public int compare(Stu1 o1, Stu1 o2) {
        return o1.id-o2.id;
    }
}

class Stu2{
    int id;
    public Stu2(){

    }
    public Stu2(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Stu2{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stu2 stu2 = (Stu2) o;

        return id == stu2.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

