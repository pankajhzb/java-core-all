package com.pk.algo;

public class LargestAndSmallestNum {

	public static void main(String[] args) {
		int arry[] = { 11, 74, 9, 6, 81, 24 };
		for (int i = 0; i < arry.length-1; i++) {
			if (arry[i] > arry[i + 1]) {
				int temp = arry[i];
				arry[i] = arry[i + 1];
				arry[i + 1] = temp;
			}
		}
		System.out.println("Largest :" + arry[arry.length-1]);
		System.out.println("Smallest :" + arry[0]);
	}
}
