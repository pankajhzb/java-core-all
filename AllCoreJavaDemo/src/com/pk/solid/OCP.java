package com.pk.solid;

public class OCP {
	private static final Object Rectangle = null;
	private static final Object Circle = null;

// open closed principle
	// whenever will add any new object as per the below code 
	// we need to modify the method

	public static void main(String[] args) {

	}

	public double area(Object[] shapes) {
		double area = 0;
		for (Object shape : shapes) {
			if (shape == Rectangle) {

			}
			if (shape == Circle) {

			}
		}
		return area;
	}
	// better solution
	class Shape{
		
	}
}
