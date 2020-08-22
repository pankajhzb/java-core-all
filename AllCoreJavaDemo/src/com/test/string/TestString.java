package com.test.string;

public class TestString {
	public static void main(String[] args) {
		int i = 0, j = 0, k = 0, len = 0, len2 = 0;
		String str = "Pranjal is a good boy.";
		System.out.println('c' + "c");
		System.out.println("----------------------");
		// follows LEFT to RIGHT operation for operation till string value
		// found,
		// if found string in left then all concatenate all string
		System.out.println(1 + 2 + "-");
		System.out.println("----------------------");
		System.out.println("-" + 1 + 2);

		System.out.println("----------------------");
		System.out.println(1 + "-" + 2);

		len = str.length();
		// Substring
		try {
			for (i = 0; i <= len; i = i + 5) {
				j = i + 5;
				k = i;
				len2 = str.substring(k).length();
				if (j > len2) {
					System.out.println(str.substring(i));
					break;
				}
				System.out.println(str.substring(i, j));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Reverse
		String string = "Mannu is a good boy.";
		reverseString(string);

		// reverse using recursion
		char[] strCharArray = string.toCharArray();
		int lastIndex = strCharArray.length - 1;
		String reverseStr = reverseStringUsingRecursion(strCharArray,
				lastIndex);
		System.out.println("Recursive str" + reverseStr);

		// How to reverse the numbers in "123456"
		String str2 = "123456";
		System.out.println("" + str2);
		char[] ch1 = str2.toCharArray();
		int ch1len = ch1.length;
		System.out.println("chlen :" + ch1len);
		int index1 = ch1len - 1;
		while (index1 >= 0) {
			System.out.print(ch1[index1]);
			index1--;
		}

		// how to use this string as a number for calculation

		//

	}

	private static void reverseString(String str) {
		System.out.println("String to reverse : - " + str);
		char[] ch = str.toCharArray();
		int chlen = ch.length;
		int index = chlen - 1;
		System.out.print("String after reverse : - ");
		while (index >= 0) {
			System.out.print(ch[index]);
			index--;
		}
	}

	//
	static String reverseStringUsingRecursion(char[] strCharArray, int index) {
		char ch = strCharArray[index];
		String chstr = String.valueOf(ch);
		if (index > 1)
			--index;

		String reversestr = chstr + reverseStringUsingRecursion(strCharArray, index);
		return reversestr;
	}
}
