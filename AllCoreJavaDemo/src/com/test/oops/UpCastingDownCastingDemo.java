package com.test.oops;

public class UpCastingDownCastingDemo {

    public static void main(String[] args) {
        TestClassA testClassAObj = new TestClassA();
        int temp = testClassAObj.getIntValue();

        TestSubClassB testClassBObj = new TestSubClassB();
        int temp1 = testClassBObj.getIntValue();

        //com.test.oops.TestClassA cannot be cast to com.test.oops.TestSubClassB
        //java.lang.ClassCastException
        TestSubClassB testClassBObj1 = (TestSubClassB) new TestClassA();
        int temp2 = testClassBObj1.getIntValue();

        System.out.println("value result" + temp);
        System.out.println("value result" + temp1);
        System.out.println("value result" + temp2);
    }

}

