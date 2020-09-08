package cn.tedu.homework;

import java.io.*;

public class FileCopyTest {
    public static void myCopy(String srcPath){
        FileInputStream in = null;
        FileOutputStream out = null;
        File file = null;
        file = new File(srcPath);
        File destFiles = new File("F:\\TEST\\"+srcPath.substring(3));
        if(file.isDirectory()){
            destFiles.mkdirs();
            File[] files = file.listFiles();
            for (File f : files) {
//                System.out.println(srcPath);
                myCopy(f.toString());
                System.out.println("写入完毕");
            }
        }
        else {
            try {
                in = new FileInputStream(srcPath);

                out = new FileOutputStream(destFiles.getAbsoluteFile());
                byte[] bytes = new byte[1024 * 1024];
                int readCounts = 0;
                while ((readCounts = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCounts);
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


    }
    public static void main(String[] args) {
        myCopy("F:\\电子书");

    }
}
