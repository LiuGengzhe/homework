package com.gui.bean;


public class Customer {
    private int id;
    private String name;
    private Integer VIPLevel;
    private boolean b;

    public boolean isB() {
        return b;
    }

    public void setB(Boolean b) {
        this.b = b;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVIPLevel() {
        return VIPLevel;
    }

    public void setVIPLevel(Integer VIPLevel) {
        this.VIPLevel = VIPLevel;
    }

    public Customer() {
    }

    public Customer(int id, String name, Integer VIPLevel, boolean b) {
        this.id = id;
        this.name = name;
        this.VIPLevel = VIPLevel;
        this.b = b;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", VIPLevel=" + VIPLevel +
                ", b=" + b +
                '}';
    }
}
