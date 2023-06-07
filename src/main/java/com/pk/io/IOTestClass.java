package com.pk.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOTestClass {
    public static void main(String[] args) throws IOException {
        useBufferedReader();
        // useScanner();
    }

    private static void useScanner() {
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();
        System.out.println("Count, " + number + ".");
        String name = s.nextLine();
        System.out.println("Hi, " + name + ".");

    }

    private static void useBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String number = br.readLine();
        System.out.println("Count, " + number + ".");

        String nameread = br.readLine();
        System.out.println("Hi, " + nameread + ".");
    }
}
