package com.pk.solid.O;

public class OCP {
    private static final Object Rectangle = new Rectangle();
    private static final Object Circle = new Circle();

// open closed principle
    // whenever will add any new object as per the below code
    // we need to modify the method

    public static void main(String[] args) {
        Object[] shapes = {Rectangle, Circle};
        area(shapes);
    }

    public static void area(Object[] shapes) {
        double area = 0;
        for (Object shape : shapes) {
            if (shape == Rectangle) {
                area = Rectangle.hashCode();
                System.out.println(area);
            }
            if (shape == Circle) {
                area = Circle.hashCode();
                System.out.println(area);
            }
        }
    }
}
