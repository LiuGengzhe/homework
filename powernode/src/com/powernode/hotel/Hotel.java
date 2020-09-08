package com.powernode.hotel;

import java.util.Arrays;

public class Hotel {
    private Room[][] hotel;

    public Hotel() {
        hotel = new Room[3][10];
        for(int i = 0;i<hotel.length;i++){
            for(int j = 0;j<hotel[i].length;j++){
                switch (i+1){//!!!!!!!!!!!!!!!!!!switch别忘记加上break！！！！！！！
                    case 1: hotel[i][j] = new Room((i+1)*100+j+1,"经济间",true);
                            break;
                    case 2: hotel[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                            break;
                    case 3: hotel[i][j] = new Room((i+1)*100+j+1,"豪华间",true);
                            break;
                }
            }
        }
    }
    public void printRoom(){
        for(int i = 0;i<hotel.length;i++){
            for(int j = 0;j<hotel[i].length;j++){
                System.out.print(hotel[i][j].toString());
            }
            System.out.println();
        }
    }
    public void order(int roomNo){
        hotel[roomNo/100-1][roomNo%100-1].setB(false);
        System.out.println("已定房");
        System.out.println(hotel[roomNo/100-1][roomNo%100-1]);
    }
    public void exit(int roomNo){
        hotel[roomNo/100-1][roomNo%100-1].setB(true);
        System.out.println("已退房");
        System.out.println(hotel[roomNo/100-1][roomNo%100-1]);
    }
//    public Hotel(int i,int j) {
//        hotel = new Room[i][j];
//    }

    public void setHotel(Room[][] hotel) {
        this.hotel = hotel;
    }

    public Room[][] getHotel() {
        return hotel;
    }



//    public static void main(String[] args) {
//        Hotel h = new Hotel();
//        h.order(102);
////        h.printRoom();
//    }
}
