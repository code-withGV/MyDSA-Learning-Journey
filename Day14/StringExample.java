package com.Gaurav;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String naam = in.next();
        String message2 = myGreet(naam);
        System.out.println(message2);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


    static String greet() {

        String greeting = "How r u?";
        return greeting;
    }
}
