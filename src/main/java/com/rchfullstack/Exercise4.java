package com.rchfullstack;
public class Exercise4 {
    public void exerciseFourAverageNumber() {
        int numberA = 23;
        int numberB = 11;
        int numberC = 77;

        int sum = numberA + numberB + numberC;
        int count = 3;
        double average = (double) sum / count;

        if (average % 1 == 0) {
            System.out.printf("(%d + %d + %d) / %d = %d%n", numberA, numberB, numberC, count, (int) average);
        } else {
            System.out.printf("(%d + %d + %d) / %d = %.2f%n", numberA, numberB, numberC, count, average);
        }
    }
}