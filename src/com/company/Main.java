package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1 = 0;
        double d2 = 0;
        String operator;

        try {
            System.out.print("Enter a numeric value: ");
            d1 = sc.nextDouble();

            System.out.print("Enter a numeric value: ");
            d2 = sc.nextDouble();

            System.out.println("Please choose one of the following operations: + - * /");
            operator = sc.next();

            CheckOperator(d1, d2, operator);

        } catch (Exception e) {
            System.out.println("Couldn't format as a number");
        }
        
    }

    private static void CheckOperator(double d1, double d2, String operator) {
        switch (operator) {
            case "+":
                Add(d1, d2);
                break;
            case "/":
                Divide(d1, d2);
                break;
            case "*":
                Multiply(d1, d2);
                break;
            case "-":
                Minus(d1, d2);
                break;
            default:
                System.out.println("Could not interpret operator");
        }
    }

    private static void Divide(double d1, double d2) {
        if (d2 != 0) {
            System.out.println(d1 / d2);
        } else {
            System.out.println("Second value cannot be zero!");
        }
    }
    private static void Add(double d1, double d2) {
        System.out.println(d1 + d2);
    }
    private static void Multiply(double d1, double d2) {
        System.out.println(d1 * d2);
    }
    private static void Minus(double d1, double d2) {
        System.out.println(d1 - d2);
    }

}

