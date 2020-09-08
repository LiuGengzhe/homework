package com.powernode.jihe;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList c = new ArrayList();
        c.add(100);//实则自动装箱进Integer
        c.add(2);
        c.add(300);
        c.toArray();
//        Integer a = new Integer(300);
//        c.add(100);//实则自动装箱进Integer
//        c.clear();
//        System.out.println(c.size());
//        c.add(25);//实则自动装箱进Integer
//        c.add(20);
//        c.add(30);
        Iterator i = c.iterator();
//        c.clear();
//        c.remove(a);//删除之后迭代/遍历有问题，不太懂
//        System.out.println(c.size());//0
//        c.add(2);
//        c.add(300);
//        System.out.println(c.size());//3

        while (i.hasNext()){
            System.out.println(i.next());//100 2
        }
//        while (i.hasNext()){
//            System.out.println(i.next());//100 2
//        }

    }
}
