package com.pk.test.algo;

public class Fabonacci {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("----------------DYNAMIC--------------------");
		fabonaciiDynamic();
		
		System.out.println("----------------RECURSION--------------------");
		fabonaciiRecursion(n);
		
	}

	// dynamic using while
	static void fabonaciiDynamic() {
		System.out.println("--------------WHILE LOOP---------------------");
		// option 1------------------
		int n = 10;
		int[] intarray = new int[n + 2];
		intarray[0] = 0;
		intarray[1] = 1;
		int index = 2;

		while (index <= n) {
			intarray[index] = intarray[index - 1] + intarray[index - 2];
			System.out.print("," + intarray[index]);
			index++;
		}
		System.out.println("--------------FOR LOOP---------------------");
		// option 2 --------------------
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n + 2]; // 1 extra to handle case, n = 0
		int i;

		/* 0th and 1st number of the series are 0 and 1 */
		f[0] = 0;
		f[1] = 1;
		i = 2;
		for (i = 2; i <= n; i++) {
			/*
			 * Add the previous 2 numbers in the series and store it
			 */
			f[i] = f[i - 1] + f[i - 2];
			System.out.print("," + f[i]);
		}

	}
	
	// recursion
	private static int fabonaciiRecursion(int n) {
		if (n > 2) {
			n = fabonaciiRecursion(n - 1) + fabonaciiRecursion(n - 2);
			System.out.print("," + n);
		}
		return n;
	}

}
