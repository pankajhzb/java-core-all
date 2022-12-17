package com.test.string;

import java.io.FileNotFoundException;

class Master {
    String doFileStuff() throws FileNotFoundException {
        return "a";
    }
}

class Slave extends Master {
    public static void main(String[] args) {
        String s = null;
        try {
            s = new Slave().doFileStuff();
        } catch (Exception ex) {
            s = "b";
        }
        System.out.println(s);
    }
    //An overriding method to throw the same exception ,narrower exception , or no exceptions.
    //And its okay for the overriding method to throw any runtime exceptions.

    //insert code here
    //String doFileStuff(){return "b";}
    //String doFileStuff(int x) throws IOException {return "b";}
    //String doFileStuff() throws FileNotFoundException { return "b"; }
    //String doFileStuff() throws NumberFormatException { return "b"; }
    //String doFileStuff() throws NumberFormatException , FileNotFoundException { return "b"; }

}