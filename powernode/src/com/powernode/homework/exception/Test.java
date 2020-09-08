package com.powernode.homework.exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎您注册");
        System.out.print("请输入6-14位的用户名及密码：");
        Scanner s = new Scanner(System.in);
        String userName = s.next();
        String passWord = s.next();
        try {
            UserService.register(userName,passWord);
        } catch (MyLoginException e) {
            e.printStackTrace();
        }


    }
}
