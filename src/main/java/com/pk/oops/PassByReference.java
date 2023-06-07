package com.pk.oops;

public class PassByReference {
    public static void main(String[] args) {
        int a = 1;
        ABC abc = new ABC();
        int value = checkPassByReferenceOne(a, abc);
        int value2 = checkPassByReferenceTwo(a, abc);
        System.out.println("test one premitive , object :" + a + "," + value);
        System.out.println("test two :" + value2);
        System.out.println("test actual object value :" + abc.getA());
    }

    private static int checkPassByReferenceTwo(int a, ABC abc) {
        System.out.println("TWO : a :" + (a + 2));
        return abc.getA() + 2;
    }

    private static int checkPassByReferenceOne(int a, ABC abc) {
        System.out.println("One : a :" + (a + 1));
        return abc.getA() + 1;
    }
}
