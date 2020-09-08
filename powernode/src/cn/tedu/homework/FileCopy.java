package cn.tedu.homework;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        File srcFile = null;
        File desFile = null;
        srcFile = new File("E:\\M");
        desFile = new File("F:\\TEST");
        copy(srcFile,desFile);
    }

    private static void copy(File srcFile, File desFile) {
        if (srcFile.isFile()){
            //读写操作
            FileInputStream in = null;
            FileOutputStream out = null;
            byte[] bytes = new byte[1024*1024];
            int readCounts = 0;
            System.out.println(desFile.getAbsolutePath());
            try {
                in = new FileInputStream(srcFile);
                out = new FileOutputStream(desFile);

                while ((readCounts = in.read(bytes)) != -1){
                    out.write(bytes,0,readCounts);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        else {
            File newdir = new File(("F:\\TEST\\".endsWith("\\")?"F:\\TEST\\":"F:\\TEST\\"+"\\")+srcFile.getAbsolutePath().substring(3));
//            System.out.println(newdir.getAbsolutePath());
            if (!newdir.exists()) {
                newdir.mkdirs();
            }
            File[] files = srcFile.listFiles();
            for (File f :files){
                File newFile = new File("F:\\TEST\\"+f.getAbsolutePath().substring(3));
//                System.out.println(f.getAbsolutePath().substring(3));
                copy(f,newFile);
            }
        }
    }
}
