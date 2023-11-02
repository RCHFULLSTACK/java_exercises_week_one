package com.rchfullstack;
import java.util.Scanner;
public class Exercise6 {
    public void exerciseSixTwoNumbers() {
        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int numb1 = (int) scannerInput.nextDouble();

        System.out.println("Enter the second number: ");
        int numb2 = (int) scannerInput.nextDouble();

        if (numb2 == 0) {
            System.out.println("Division by zero is undefined.");
        } else {
            int sum = numb1 + numb2;
            int multiplication = numb1 * numb2;
            int division = numb1 / numb2;
            int difference = numb1 - numb2;

            System.out.println("Sum: " + sum);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + division);
            System.out.println("Difference: " + difference);
        }
        scannerInput.close();
    }
}