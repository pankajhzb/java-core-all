package com.pk.object;

public class C1 {
    public static void main(String[] args) {
        ConcreteSingleton cs = ConcreteSingleton.getInstance();
        //here we get the global variable set by the singleton class.
        //
        System.out.println(cs.red);
    }
}
