package com.pk.pkg3;

public class C extends A {
    public void getValue() {
        int qq = new A().x;
        int ee = new A().y;
        int dd = new A().z;

        System.out.println(qq + ee + dd);
    }
}
