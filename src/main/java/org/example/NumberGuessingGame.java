package org.example;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;

        int randomNum = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int maxAttempt = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess a number between " + lowerBound + " and " + upperBound);

        for (int minAttempt = 1; minAttempt  <= maxAttempt; minAttempt++) {
            System.out.println("Enter your guess (Attempts " + minAttempt + "/" + maxAttempt + "): ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNum) {
                System.out.println("Congratulations! You guessed the correct number");
                score+= (maxAttempt - minAttempt + 1 ) * 10;
                break;
            } else if (userGuess < randomNum) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too hight, try again.");
            }

            if (minAttempt == maxAttempt) {
                System.out.println("Sorry you ran out of attempts. The correct number was: " + randomNum);
            }
        }
        System.out.println("Your score is: " + score);
        scanner.close();
    }
}
