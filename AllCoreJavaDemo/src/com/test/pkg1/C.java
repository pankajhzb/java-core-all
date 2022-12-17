package com.test.pkg1;

public class C extends A {
    int v = 6;

    public C() {
        this.v = 9;
        this.x = 10;
    }

    public double add(double a, double b) {
        double c = a + b;
        return c;
    }

    public void getValue() {
        int qq = new A().x;
        int ee = new A().y;
        int dd = new A().z;

        System.out.println(qq + ee + dd);
    }
}
