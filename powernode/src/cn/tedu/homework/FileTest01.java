package cn.tedu.homework;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("E:\\M");
//        showDir(file);
        showExe(file);

    }

    private static void showDir(File file) {
        File[] files = file.listFiles();
        for (File data:files){
            if (data.isDirectory()){
                System.out.println(data.getAbsolutePath());
                showDir(data);
            }
        }
    }

    private static void showExe(File file) {
        File[] files = file.listFiles();
        for (File data:files){
//            System.out.println(data);
            if (data.toString().endsWith(".exe")){
                System.out.println(data.getAbsolutePath());
            }
            if (data.isDirectory()){
                showExe(data);
            }
        }
    }

    @Test
    public void Demo(){
        File dirFile = new File("E:\\M");
        // 返回文件的数组
//		File[] listFiles = dirFile.listFiles();

		File[] listFiles = dirFile.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				System.out.println(dir.getAbsolutePath());
                System.out.println("***********");
				System.out.println(name);
                System.out.println("===========");
				return name.endsWith(".exe");
			}
		});

//        File[] listFiles = dirFile.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".exe");
//            }
//        });
//
        for(File file : listFiles) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
