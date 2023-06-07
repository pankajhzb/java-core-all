package com.pk.oops;

public class DEF extends ABC {
    int b = 20;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DEF pqr = new DEF();
        int c = pqr.getA() + pqr.getB();
        System.out.print(c);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
