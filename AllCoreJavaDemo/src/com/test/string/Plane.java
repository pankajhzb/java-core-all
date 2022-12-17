package com.test.string;

public class Plane {
    static String s = "-";

    public static void main(String[] args) {
        new Plane().s1();
        System.out.println(s);
    }

    void s1() {
        try {
            s2();
        } catch (Exception ex) {
            s += "c";
        }
    }

    void s2() throws Exception {
        s3();
        s += "2";
        s3();
        s += "2b";
    }

    void s3() throws Exception {
        throw new Exception();
    }
}
//Once s3() throws the exception to s2(),s2() throws it to s1(), and no more s2()'s code will be executed. 
