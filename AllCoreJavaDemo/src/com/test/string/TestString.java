package com.test.string;
public class TestString {
	public static void main(String[] args) {
		int i = 0, j = 0, k = 0, len = 0, len2 = 0;

		String str = "Pankaj is a good boy.";
		System.out.println('c'+"c");
		System.out.println("_______");
		//left to right operation
		System.out.println(0+1+"-");
		System.out.println("________");
		System.out.println("-"+1+0);

		len = str.length();
		// System.out.println(len);

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
	}
}
