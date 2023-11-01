package com.rchfullstack;
import java.util.Scanner;
public class Exercise5 {
    public void exerciseFiveUsername(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        if(inputScanner.hasNextLine()) {
            String username = inputScanner.nextLine();
            System.out.println("Hello " + username);
        } else {
            System.out.println("No input provided. ");
        }
        inputScanner.close();
    }
}