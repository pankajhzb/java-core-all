package com.pk.object;

public class ConcreteSingletonApp {
    public static void main(String[] args) {
        ConcreteSingleton cs = ConcreteSingleton.getInstance();
        //here we get the global variable set by the singleton class.
        //
        System.out.println(cs.red);
    }
}
