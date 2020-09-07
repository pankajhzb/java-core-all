package com.pk.algo;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int number = 123456789;

		// 1
		int sum = recursionSumMethod(number);
		System.out.println("SUM : " + sum);

		// 2
		Scanner scanner = new Scanner(System.in);      
        int testnumber = scanner.nextInt();
		int reverse = reverse(testnumber);
		
		if(testnumber == reverse)
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
		
		
	}

	private static boolean checkPalindrome(int number) {
		int reminder = number % 10;
		//int[] array = new int[];
		//reminder 
		return false;
	}
	
	private static int reverse(int number){
        int reverse = 0;
     
        while(number != 0){
          reverse = reverse*10 + number%10;
          number = number/10;
        }
             
        return reverse;
    }


	private static int recursionSumMethod(int number) {
		if(number/10 == 0)
			return number;
		return (number % 10) + recursionSumMethod(number /10);
	}
	
	
}

