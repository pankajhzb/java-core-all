package com.pk.solid;

public interface LiskovInterface {
    default void defaultMethod(String name) {
        System.out.println("Hello" + name);
    }

    void abstractMethod(String name);

}
