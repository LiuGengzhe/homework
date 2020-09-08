package com.powernode.homework.exception;

public class UserService {
    public static void register(String useName,String passWord) throws MyLoginException {
        if(useName.length()<6 || useName.length() > 12){
            throw new MyLoginException("用户名位数不正确");
        }
    }
}
