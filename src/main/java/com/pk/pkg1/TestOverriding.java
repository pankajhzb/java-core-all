package com.pk.pkg1;

public class TestOverriding {

    public static void main(String[] args) {
        A a = new C();
        //A a1 = new A();

        //C c = new C();
        C c1 = (C) new A();


        //C c = (C) new A();

        System.out.println("result :" + c1.add(22, 34));
        //System.out.println("result :"+a.add(22.4, 34.7));
    }

}
