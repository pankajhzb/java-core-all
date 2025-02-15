package com.pk.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        // op1
        Constructor<Student> studentConstructor = Student.class.getConstructor();
        Student student = studentConstructor.newInstance();
        student.setsName("Beena");
        System.out.println("Using Student class.getConstructor: " + student.getsName());

        // op2 to create new object
        Class classz = Class.forName("com.pk.reflection.Student");
        Student s = (Student) classz.newInstance();
        s.setsName("Beena");
        System.out.println("Using Class.forName: " + student.getsName());

        // op3 deserialize

        // op4 clone object
        
        // op5 new object


    }
}
