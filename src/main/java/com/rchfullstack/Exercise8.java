package com.rchfullstack;
import java.util.Random;
import java.util.Scanner;
public class Exercise8 {
    public void exerciseEightRandom(){
        Scanner inputScanner = new Scanner(System.in);
        Random randomInput = new Random();

        int min = 1;
        int max = 50;
        int randomNumber = randomInput.nextInt(max - min + 1) + min;

        int numberOfGuesses = 0;
        int userGuess;

        System.out.println("Enter a random number between 1- 500. Try to guess it.");

        do {
            System.out.println("Enter your guess: ");
            userGuess = inputScanner.nextInt();
            numberOfGuesses++;

            if (userGuess < randomNumber) {
                System.out.println("You guess was too small. ");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess was too big. ");
            } else {
                System.out.println("Congratulation! You've guessed the number " + randomNumber + " in " + numberOfGuesses + " Guesses.");
            }
        }while (userGuess != randomNumber);
        inputScanner.close();
    }
}