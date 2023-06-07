package com.pk.premitive;

public class TestRecursion {
    public static void main(String[] args) {
        int v = new TestRecursion().factorial(5);
        System.out.println(v);

    }

    //int f=0;
    public int factorial(int n) {
//int f = n;
        if (n > 1) {
            n = n * factorial(n - 1);// functions maintains the stack
            System.out.println("n:" + n);//op - 2,6,24,120
        }
        return n;
    }
}
