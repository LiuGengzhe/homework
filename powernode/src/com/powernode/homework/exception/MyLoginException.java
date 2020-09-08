package com.powernode.homework.exception;

public class MyLoginException extends RuntimeException {
    public MyLoginException(){
        super();
    }
    public MyLoginException(String s){
        super(s);
    }
}
