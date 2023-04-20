package com.test.serialization;

import java.io.Serializable;
//Serializable is a marker interface , having no method defined,
//it only make class Serializable

public class A implements Serializable {
    //check this latter

    private static final long serialVersionUID = 1L;
    int a = 20;
    transient int x = 30;
    String str = "Beena";
    B b = null;
}
