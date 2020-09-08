package com.powernode.test;


import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>();
        List<Integer> l = new ArrayList<>();
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(300);
        hashSet.add(400);
        hashSet.add(500);
        hashSet.add(100);
        hashSet.add(100);
//        for(Integer data:hashSet){
//            System.out.println(data);
//        }
        Iterator<Integer> i = hashSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
