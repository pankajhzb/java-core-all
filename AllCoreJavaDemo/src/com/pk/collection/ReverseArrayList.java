package com.pk.collection;

import java.util.ArrayList;

public class ReverseArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A_rahul");
        arrList.add("B_sunil");
        arrList.add("C_dk");
        arrList.add("D_sk");
        arrList.add("E_pk");
        //
        //System.out.println("Arraylist value in order:");
        //for (String str : arrList)
        //System.out.print(",\n" + str);

        //
        //System.out.println();
        int size = arrList.size();
        //System.out.println("SIZE : - " + size);

        //System.out.println("Arraylist value in reverse order:");

        //for (int i = size - 1; i >= 0; i--) {
        //System.out.print(",\n" + arrList.get(i));
        //}

        //
        System.out.println();
        int j = 0;
        for (int i = size - 1; i > size / 2; i--) {
            String temp = arrList.get(i);
            arrList.set(i, arrList.get(j));
            arrList.set(j, temp);
            j++;
        }

        System.out.println("same Arraylist value in reverse order:");
        for (String str : arrList)
            System.out.print(",\n" + str);
    }

}
