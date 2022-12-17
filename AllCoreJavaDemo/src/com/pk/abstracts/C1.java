package com.pk.abstracts;

public class C1 implements I1, I2 {

    @Override
    public void add() {
        System.out.println("i am at C1-add ");
    }

    @Override
    public int sub() {
        System.out.println("i am at C1-sub");
        return 0;
    }
}
