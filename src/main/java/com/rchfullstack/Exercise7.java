package com.rchfullstack;
import java.util.Scanner;
public class Exercise7 {
    public void exerciseSevenConvert(){
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Input seconds: ");
        int totalSeconds = inputScanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("output: %02d:%02d:%02d%n", hours, minutes, seconds);
        inputScanner.close();
    }
}