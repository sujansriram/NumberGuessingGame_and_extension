package org.example;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        System.out.println("Guess the number from 1 to 1000");
//        random number generator
        Random randomNumber = new Random();
        int secretNumber = randomNumber.nextInt(1000);

//        assign the guessed number a value outside the generator bound so the while loop starts off true
        int guessedNumber = 1001;

//        NEW GUESSING GAME (ALLOWS UNLIMITED GUESSES)
        while (guessedNumber != secretNumber){
            Scanner reader = new Scanner(System.in);
            guessedNumber = reader.nextInt();
            if (guessedNumber < secretNumber) {
                System.out.println("Wrong! Too Small");
            } else if (guessedNumber > secretNumber) {
                System.out.println("Wrong! Too Big");
            } else {
                System.out.println("correct!");
            }
        }
    }
}
//        OLD GUESSING GAME (RUBBISH! ONLY ONE GUESS)
//        Scanner reader = new Scanner(System.in);
//        int guessedNumber = reader.nextInt();

//        if (guessedNumber == secretNumber){
//            System.out.println("correct!");
//        } else if (guessedNumber < secretNumber) {
//            System.out.println("Wrong! Too Small");
//        } else {
//            System.out.println("Wrong! Too Big");
//        }