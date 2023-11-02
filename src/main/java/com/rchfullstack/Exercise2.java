package com.rchfullstack;
import java.util.Scanner;
public class Exercise2 {
    public void exerciseTwoLeapYear() {
        try (Scanner scanInput = new Scanner(System.in)) {
            System.out.println("Enter any year and press Enter: ");
            int year = scanInput.nextInt();

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year. ");
            }
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter a valid year.");
        }
    }
}