package com.pk.string;

class Car {
    int code = 123456;
    String vin = "CVF32BNM";

    public Car(String param) {
        this.vin = param;
    }

    public Car(int param) {
        this.code = param;
    }

    public String getVin() {
        return vin;
    }

    public boolean equals(Object o) {
        if ((o instanceof Car) && ((Car) o).getVin() == this.vin) {
            return true;
        }
        return false;
    }
}

public class Test_equals {

    public static void main(String args[]) {
        String s1 = "mohan";
        String s2 = "pankaj";
        String s3 = new String("pankaj");
        String s4 = new String("pankaj");
        String s5 = new String("mohan");
        String s6 = s1;

        Car c1 = new Car(123456);
        Car c2 = new Car("QWERTY123");
        Car c3 = new Car(123456);
        Car c4 = new Car("QWERTY123");
        Car c5 = c1;

        //

        /**
         * Compares the string to the specified object.
         * The result is true if and only if the argument is not null and
         * is a String object that represents the same sequence of characters as this object.
         */

        System.out.println(" Object euals() method  test-------------");
        if (s1.equals(s2))
            System.out.println(s1 + " and " + s2 + " are equals");
        else
            System.out.println(s1 + " and " + s2 + " are Not equals");

        if (s3.equals(s4))
            System.out.println(s3 + " and " + s4 + "Equals");
        else
            System.out.println(s3 + " and " + s4 + "Not Equals");

        if (s4.equals(s5))
            System.out.println(s4 + " and " + s5 + "Equals");
        else
            System.out.println(s4 + " and " + s5 + "Not Equals");


        System.out.println(" == test--------------");
        if (s1 == s6)//here == operator see the hashcode of the objects ie indicating the same address.
            System.out.println(s1 + " and " + s6 + " == Equals");
        else
            System.out.println(s1 + " and " + s6 + "== / Not Equals");

        if (s1 == s2)//here == operator see the hashcode of the objects ie indicating the same address.
            System.out.println(s1 + " and " + s2 + " == Equals");
        else
            System.out.println(s1 + " and " + s2 + "== / Not Equals");

        if (s3 == s4)//here == operator see the hashcode of the objects ie indicating the same address.
            System.out.println(s3 + " and " + s4 + " == Equals");
        else
            System.out.println(s3 + " and " + s4 + "== / Not Equals");

        if (s4 == s5)//here == operator see the hashcode of the objects ie indicating the same address.
            System.out.println(s4 + " and " + s5 + " == Equals");
        else
            System.out.println(s4 + " and " + s5 + "== / Not Equals");


        System.out.println("  Testing with compareTo-------");
        //if(s3.compareTo(s4))// return int value, 0, -1, 1.
        int cvalue = s3.compareTo(s4);
        if (cvalue == 0)
            System.out.println("1.Equals");
        else
            System.out.println("1.Not Equals");

        //Testing with Generic Class object
        //testing with equals method
        System.out.println("  Generic object reference test with equals-------");
        if (c1.equals(c2))
            System.out.println("1.Generic class reference have different value, test with equals method :Equals");
        else
            System.out.println("1.Generic class reference have different value,test with equals method :Not Equals");

        if (c1.equals(c3))
            System.out.println("2.Generic class reference have same int value,test with equals method :Equals");
        else
            System.out.println("2.Generic class reference have same int value,test with equals method :Not Equals");

        if (c2.equals(c4))
            System.out.println("3.Generic class reference have same string value,test with equals method :Equals");
        else
            System.out.println("3.Generic class reference have same string value,test with equals method :Not Equals");

        if (c5.equals(c1))
            System.out.println("4.Generic class reference have same string value,test with equals method :Equals");
        else
            System.out.println("4.Generic class reference have same string value,test with equals method :Not Equals");

        //testing with ==
        System.out.println("  Generic object reference test with ==-------");
        if (c1 == c2)
            System.out.println("1.Generic class reference have different value, test with == :Equals");
        else
            System.out.println("1.Generic class reference have different value,test with == :Not Equals");

        if (c1 == c3)
            System.out.println("2.Generic class reference have same int value,test with == :Equals");
        else
            System.out.println("2.Generic class reference have same int value,test with == :Not Equals");

        if (c2 == c4)
            System.out.println("3.Generic class reference have same string value,test with == :Equals");
        else
            System.out.println("3.Generic class reference have same string value,test with == :Not Equals");

        if (c5 == c1)
            System.out.println("4.Generic class referer to same object of ,test with == :Equals");
        else
            System.out.println("4.Generic class referer to same object,test with == :Not Equals");


    }
}
