package com.test.oops;

public class Circle {
    Operation op; //aggregation
    double pi = 3.14;

    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }

    double area(int radius) {
        op = new Operation();
        int rsquare = op.square(radius);
        return pi * rsquare;
    }
}
