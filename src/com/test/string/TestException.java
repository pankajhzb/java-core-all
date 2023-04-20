package com.test.string;

import java.io.IOException;
import java.util.ArrayList;

public class TestException {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // try{
        for (int i = 1; i < 10; i++) {
            int intArr[] = new int[10];
            // intArr[i] = 2/0;
            // intArr[11] = 11;//if Exception at this line then program
            // terminate if try catch not included
            // if try catch included then exception catch by the exception and
            // program continues and executes
            // System.out.println("Values :-"+intArr[i]);
        }

        // list added the values from 0 index.
        list.add(1, new Integer(1));

        // here if index is 0 then error not
        // generate otherwise error comes.
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        // System.out.print("At ArrayIndexOutOfBoundsException");
        // e.printStackTrace();
        // }
        // catch (Exception e) {
        // System.out.print("At Exception");
        // e.printStackTrace();
        // }
        // File f = new File("abc.txt");
        // f.createNewFile();
        // System.out.println(f.getName());
        System.out.print("At End withought try catch");
    }
}