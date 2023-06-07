package com.pk.oops;

public class TestSubClassB extends TestClassA {
    int a;
    int b = 9;
    String str = "aaisha";
    TestClassA testClassA = null;

    TestSubClassB() {
        System.out.println("I am at TestSubClassB");
    }

    public static void main(String[] args) {
        new TestSubClassB();
        new TestClassA();
    }

    public int getIntValue() {
        return a;
    }
}
