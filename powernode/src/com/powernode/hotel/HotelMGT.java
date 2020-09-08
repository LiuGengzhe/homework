package com.powernode.hotel;

//import java.util.Scanner;

public class HotelMGT {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        System.out.println("欢迎使用本酒店退订房系统，请按照说明进行操作");
        System.out.println("[1]为查询当前所有房间 [2]为订房 [3]为退房 [9]为查看帮助页面 [0]为退出");
        System.out.print("请输入编号:");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int i;
        while(true){
//            java.util.Scanner s = new java.util.Scanner(System.in);
            i = s.nextInt();
            switch (i) {
                case 0:
                    System.out.println("欢迎下次光临，再见");
                    return;
                case 1:
                    h.printRoom();break;
                case 2:
                    System.out.print("请输入您想要预定的房间编号：");
                    h.order(s.nextInt());
                    break;
                case 3:
                    System.out.print("请输入您想要退房的房间编号：");
                    h.exit(s.nextInt());
                    break;
                case 9:
                    System.out.println("[1]为查询当前所有房间 [2]为订房 [3]为退房 [9]为查看帮助页面 [0]为退出");
                    System.out.print("请输入编号:");
            }
        }
    }



}
