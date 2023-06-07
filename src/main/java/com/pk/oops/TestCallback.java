package com.pk.oops;

public class TestCallback {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CallMe callMe = new CallMe();
        boolean response = callMe.interestingEvent();
        if (response) {
            System.out.println("Interesting event confirms ");
        }
    }

}
