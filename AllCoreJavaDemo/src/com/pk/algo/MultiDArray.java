package com.pk.algo;

public class MultiDArray {

	public static void main(String[] args) {
		int arr[][] = { { 3, 5 }, { 13, 4, 8, 14, 1 }, { 9, 6, 3, 7, 21 },
				{ 5, 12, 17, 9, 3 } };
		int[][] outarr = new int[arr.length][];
		int m = -1, n = -1;
		for (int[] i : arr) {
			for (int j : i) {
				System.out.println(j);
				outarr[++m][++n] = j;
				System.out.println(outarr[j]);
			}
		}
	}

}
