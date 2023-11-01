package com.rchfullstack;
import java.util.Scanner;
public class Exercise6 {
    public void exerciseSixTwoNumbers() {
        Scanner scannerInput = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double numb1 = scannerInput.nextDouble();

        System.out.println("Enter the second number: ");
        double numb2 = scannerInput.nextDouble();

        if (numb2 == 0) {
            System.out.println("Division by zero is undefined.");
        } else {
            double sum = numb1 + numb2;
            double multiplication = numb1 * numb2;
            double division = numb1 / numb2;
            double difference = numb1 - numb2;

            System.out.println("Sum: " + sum);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + division);
            System.out.println("Difference: " + difference);
        }
        scannerInput.close();
    }
}