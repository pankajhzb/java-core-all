package com.pk.string;

public class Palindrome {

    public static void main(String[] args) {
        String str = "MADAM";
        char[] charr = str.toCharArray();
        int i = 0;
        int j = charr.length - 1;
        boolean flag = true;
        while (flag && j >= 0) {
            if (charr[i] == charr[j]) {
                System.out.println("charr[i] - \"charr[j]\" " + charr[i] + "-" + charr[j]);
                flag = true;
                i++;
                j--;
            } else {
                flag = false;
                System.out.println("charr[i]" + charr[i]);
                System.out.println("charr[j]" + charr[j]);
            }
        }

        // op2
        if(str.equals(reverseString(str))){
            System.out.println("PALINDROME");
        }
    }

    // a method t reverse the string
    public static String reverseString(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }
}
