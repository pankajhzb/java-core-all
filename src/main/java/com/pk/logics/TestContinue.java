package com.pk.logics;

public class TestContinue {

    public static void main(String[] args) {
        char[] crr = {'g', 'o', 'o', 'd'};
        int i = 0, j = 1, counter = 0;
        System.out.println("hi");
        while (j < crr.length) {
            if (crr[i] == crr[j]) {
                counter++;
                j++;
                if (j == crr.length)
                    i++;
                System.out.println("i:" + i + ",j:" + j + ",counter:" + counter);
                continue;
            }
            System.out.println("i:" + i + ",j:" + j + ",counter:" + counter);
//				else if(j == crr.length){
//				i++;
//				j++;
//				System.out.println("i:"+i+",j:"+j+",counter:"+counter);
//				continue;
//			}

        }
    }

}
