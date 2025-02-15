package com.pk.algo;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 17, 8, 90, 3, 45, 67, 102, 607, 33);
        int[] arr = {17, 12, 8, 90, 3, 45, 67, 102, 607, 33};
        int n = arr.length;
        boolean swapped = false;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
