package com.powernode.string;

public class StringTest {
    public StringTest() {
    }
    public static void main(String[] args){
        String s = "java:c++:php";
        String[] s1 = s.split(":");
        for (int i = 0;i<s1.length;i++){
            System.out.println(s1[i]);//java c++ php
        }
        char c = s.charAt(3);//a
        System.out.println(c);//a
        System.out.println("**********");
        System.out.println("abc".compareTo("dbx"));//-3 比较，前减后
        System.out.println(s.contains("c#"));//false
        System.out.println(s.endsWith("php"));//true 为末尾
        System.out.println(s.startsWith("java"));//true 为起始
        System.out.println("*************");
        System.out.println(new String("abc") == "abc");//false
        System.out.println(new String("abc").equals("abc"));//true
        System.out.println(new String("ABc").equals("abC"));//false
        System.out.println(new String("ABc").equalsIgnoreCase("abC"));//true 忽略大小写的equals
        System.out.println("*******************");//s = "java:c++:php"
        byte[] b = s.getBytes();
        for (int i = 0; i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println("**************");
        System.out.println(s.indexOf("java"));//0
        System.out.println(s.length());//12
        System.out.println(s.lastIndexOf("a"));//3
        System.out.println(s.lastIndexOf('a'));//3
        System.out.println(s.replace("java","golang")); //golang：c++：php
        System.out.println(s.substring(5));//c++：php 包左
        System.out.println(s.substring(5,8));//c++ 包左不包右 前闭后开
        System.out.println("******************");
        char[] c1 = s.toCharArray();
        for (int i = 0;i<c1.length;i++){
            System.out.println(c1[i]);
        }
        System.out.println();
        System.out.println("******************");
        System.out.println(s.toUpperCase());//全大写
        System.out.println("ABC".toLowerCase());//全小写
        System.out.println("        abc   def     ");
        System.out.println("        abc   def     ".trim());//去掉首末空格
        System.out.println(String.valueOf(100));
    }
}
