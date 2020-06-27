package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

    	System.out.print("Enter a numeric value: ");
	    var d1 = input.nextDouble();
	    System.out.print("Enter a numeric value: ");
	    var d2 = input.nextDouble();

	    System.out.println("The answer is: " + d1 / d2);
    }
}
