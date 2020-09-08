package com.powernode.io;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("F:\\TEST\\欢迎来到");
        if (!file.exists()){
            file.mkdir();
        }
    }

}
