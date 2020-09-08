package com.powernode.hotel;

public class Room {
    private int no;
    private String type;
    private boolean b;

    public Room() {

    }

    public Room(int no, String type, boolean b) {
        this.no = no;
        this.type = type;
        this.b = b;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public int getNo() {
        return no;
    }

    public String getType() {
        return type;
    }

    public boolean getB() {
        return b;
    }

    @Override
    public String toString() {
        return "{" +
                 + no +
                ", " + type +
                ", " + (b?"空闲":"不可用") +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(null == obj || !(obj instanceof Room)){
            return false;
        }
        if(this == obj)
            return true;
        return this.getNo() ==((Room) obj).getNo();
//        if(this.getNo() == ((Room) obj).getNo())
//            return true;
//        else
//            return false;
    }
    public static void main(String[] args) {
        Room r1 = new Room(101,"标准间",true);
        Room r2 = new Room(101,"标准间",true);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.equals(r2));
    }
}


