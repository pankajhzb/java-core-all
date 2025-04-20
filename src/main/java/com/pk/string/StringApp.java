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

        // Find vowels available in a string
        String str = "QSWEOCDIDDSQUA";
        char[] temp = new char[str.length()];
        int i=0;
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        for(char c: str.toCharArray()){
            for(char v: vowels){
                if(c==v){
                    temp[i] = c;
                    i++;
                }
            }
        }
        System.out.println("temp:" + String.copyValueOf(temp));

        // op2

    }
}
