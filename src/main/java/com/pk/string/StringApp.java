package com.pk.string;

public class StringApp {

    static String str = "abcaanmmdaasdfddsaseddd";

    public static void main(String[] args) {
        // Longest substring
        char[] charr = str.toCharArray();

        // reverse string
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println("buffer:  " + buffer);

    }
}
