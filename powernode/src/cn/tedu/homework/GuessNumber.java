package cn.tedu.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random m = new Random();
        int answer = m.nextInt(101);
        Scanner s = new Scanner(System.in);
        int i = -1;
        System.out.print("请输入数字：");
        i = s.nextInt();
        do{
            if(i<0) {
                System.out.println("您数入的数字有误，请输入小等于100的正整数：");
                i = s.nextInt();
            }
            else if(i >= 0){
                System.out.println();
                if(i>answer){
                    System.out.print("如输入字较大，请重新输入:");
                    i = s.nextInt();
                }
                else {
                    System.out.print("输入数字较小，请重新输入:");
                    i = s.nextInt();
                }
            }

        }while(i != answer);
        s.close();
        System.out.println();
        System.out.println("恭喜你猜对了！");
    }
}
