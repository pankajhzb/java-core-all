package com.test.serialization;

//Serialization of static variables

import java.io.*;

public class SerTest {
    public static void main(String[] args) {
        ABC a = new ABC();
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("serialization.ser"));
            os.writeObject(a);
            os.close();
            System.out.println("Before Serialization :" + a.toString());

            ObjectInputStream is = new ObjectInputStream(new FileInputStream("serialization.ser"));
            ABC aNew = (ABC) is.readObject();
            is.close();
            System.out.println("ABCafter Serialization :" + aNew.toString());
        } catch (FileNotFoundException e) {
            // TODO ABCuto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO ABCuto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO ABCuto-generated catch block
            e.printStackTrace();
        }
    }
}

class ABC implements Serializable {
    static int y = 9;
    transient int x = 8;

    public ABC() {
        y = 20;
    }

    @Override
    public String toString() {
        return "x : " + x + ", y :" + y;
    }
}

//type 2
class SerTest1 {
    public static void main(String[] args) {
        ABC a = new ABC();
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("serialization.ser"));
            os.writeObject(a);
            os.close();
            System.out.println("Before Serialization :" + a.toString());
        } catch (IOException e) {
            // TODO ABCuto-generated catch block   
            e.printStackTrace();
        }
    }
}

class DeSerTest {
    public static void main(String[] args) {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("serialization.ser"));
            ABC aNew = (ABC) is.readObject();
            is.close();
            System.out.println("ABCfter Serialization :" + aNew.toString());
        } catch (FileNotFoundException e) {
            // TODO ABCuto-generated catch block   
            e.printStackTrace();
        } catch (IOException e) {
            // TODO ABCuto-generated catch block   
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO ABCuto-generated catch block   
            e.printStackTrace();
        }
    }
} 
