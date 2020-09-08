package com.gui.bean;

import java.util.*;

public class Test {
    @org.junit.Test
    public void demo(){
        B b = new B();
        b.getFanxing();
    }

    @org.junit.Test
    public void listTest(){
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("568");
        list.add("sss");
        //list集合遍历
        //增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
        //list集合遍历
        //迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        Map<String,Integer> map = new HashMap<>();
        map.put("10",1);
        map.put("20",2);
        //map集合遍历
        //增强for遍历
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }
//        map集合遍历
//        迭代器遍历
//        Set<Map.Entry<String,Integer>> i = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator1 = i.iterator();
//        while(iterator1.hasNext()){
//            Map.Entry<String, Integer> next = iterator1.next();
//        }
    }

    public static void main(String[] args) {

        B b = new B();
        String s = b.getS();
        System.out.println(s);
    }


}
