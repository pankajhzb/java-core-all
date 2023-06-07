package com.pk.algo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AlgoApp {

    public static void main(String[] args) {

        // 1, How to Find Middle Element of Linked List in Java in Single Pass
        String middleElement = getMiddleElementFromLinkedList();
        System.out.println("middleElement :" + middleElement);
        // 2 . How to find the largest and smallest number in given Array in
        // Java

        // 3. 2 Ways to Check if a String is Rotation of Other in Java -
        // Algorithms

    }

    // op1
    private static String getMiddleElementFromLinkedList() {
        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList("good", "god", "go", "got", "google",
                "give", "gase"));

        int linkedListSize = linkedList.size();
        int index = linkedListSize / 2;
        String middleEle = linkedList.get(index);

        // linkedList.forEach(action);

        return middleEle;
    }

    /// op2
    /*
     * This is where candidates' logical ability puts into the test, whether he
     * is familiar with space and time trade-off or not etc.
     */

    /*
     * What makes this data structure Interview question interesting is that you
     * need to find the middle element of LinkedList in one pass and you don�t
     * know the length of LinkedList.
     *
     * Read more:
     * https://javarevisited.blogspot.com/2012/12/how-to-find-middle-element-of-linked-list-one-pass.html#ixzz6V9BnrGEe

     */

}
