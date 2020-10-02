package com.pk.algo;

import java.util.HashSet;
import java.util.Set;

public class PairSumTest {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 4, 4 };
		int[] arr2 = { 1, 2, 3, 9 };
		int sum = 8;
		boolean bool = hasPairSum(arr1, sum);
		boolean bool2 = hasPairSum(arr2, sum);
		System.out.println("hasPairSum : " + bool);
		System.out.println("hasPairSum : " + bool2);
	}

	private static boolean hasPairSum(int[] arr1, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : arr1) {
			if (set.contains(Integer.valueOf(i))) {
				return true;
			}
			set.add(Integer.valueOf(i));
		}
		return false;
	}

}
