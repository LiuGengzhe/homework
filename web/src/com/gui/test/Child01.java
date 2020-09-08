package com.gui.test;

public class Child01 extends Parent01 implements Interface01 {
    @Override
    public void eatsome() {
        System.out.println("子类的eat");
    }

    @Override
    public void dosome() {
        super.run();
    }
}
