package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        // s2 is created as a reference to s1 automatically by Java
        var s2 = "Hello!";

        if (s1 == s2) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match...");
        }

        String s3 = new String("Hello!");
        String s4 = new String("Hello!");

        // Wrong way
        if (s3 == s4) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match...");
        }

        // Correct way
        if (s3.equals(s4)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match...");
        }

        var s5 = "HELLO!";

        if (s3.equalsIgnoreCase(s5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match...");
        }
    }
}
