package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

//        var scanner = new Scanner(System.in);
//        System.out.print("Enter a month number (1-12): ");
//        var monthNumber = scanner.nextInt();

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        String message;
//        if (monthNumber < 1 || monthNumber > 12) {
//            message = "That isn't a valid month!";
//        }
        if (monthNumber <= 3) {
            message = "That's in quarter 1";
        } else if (monthNumber <= 6) {
            message = "That's in quarter 2";
        } else {
            message = "That's not in the first half of the year!";
        }
        System.out.println(message);

    }
}
