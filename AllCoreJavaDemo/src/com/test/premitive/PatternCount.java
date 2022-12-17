package com.test.premitive;

public class PatternCount {
    public static void main(String[] args) {
        char[] carr = {'g', 'o', 'o', 'd'};
        int i = 0, j = 1, counter = 0;
        boolean flag = false;
        while (carr.length > 0) {
            if (carr[i] == carr[j]) {
                counter++;
                j++;
                System.out.println(i + "," + j + "," + counter);
                //flag=true;
            }
            //continue fff;
        }
    }

}
