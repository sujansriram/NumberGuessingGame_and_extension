package org.example;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

//        int randomNumber = Math.random();
        int secretNumber = 69;

        Scanner reader = new Scanner(System.in);
        int guessedNumber = reader.nextInt();

        if (guessedNumber == secretNumber){
            System.out.println("correct!");
        } else if (guessedNumber < secretNumber) {
            System.out.println("Wrong! Too Small");
        } else {
            System.out.println("Wrong! Too Big");
        }
    }
}