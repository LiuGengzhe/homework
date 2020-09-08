package com.powernode.test;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(100,"az");
        m1.put(200,"b");
        m1.put(50,"z");
        m1.put(600,"y");
//        System.out.println(m1.get(100));
        Set<Integer> mmm = m1.keySet();
        for (Integer data:mmm){
            System.out.println(data+"等于"+m1.get(data));
        }
        System.out.println("******************");
        Set<Map.Entry<Integer,String>> mm = m1.entrySet();
        for (Map.Entry<Integer,String> data : mm){
            System.out.println(data.getKey());
        }
        System.out.println("**********************");
        Collection<String> nn = m1.values();
        for (String data:nn){
            System.out.println(data);
        }
//        String i = "ssss";
//        i.hashCode();

        System.out.println("===============");

        Map<Integer,String> tm = new TreeMap<>();
        tm.put(100,"lz");
        tm.put(10,"zs");
        tm.put(5,"ww");
        tm.put(40,"zl");
        tm.put(200,"lm");
        Set<Integer> tmk = tm.keySet();
        for (Integer data: tmk){
            System.out.println(data+"等于"+tm.get(data));
        }
        Set<Map.Entry<Integer,String>> tme = tm.entrySet();
        for (Map.Entry<Integer,String> node:tme){
            System.out.println(node.getKey()+"=="+node.getValue());
            System.out.println(node);
        }
        System.out.println(tm.size());
        System.out.println("========================");
        Collection<String> a = tm.values();
        for (String data:a){
            System.out.println(data);
        }

    }
}
