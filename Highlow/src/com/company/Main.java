package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);


        int GUESSES_ALLOWED = 5;

        int MAX_NUMBER = 20;

        int numberGuessed = -1;

        int NUMBER_TO_GUESS;

        Random R = new Random();
        NUMBER_TO_GUESS = R.nextInt(MAX_NUMBER);

        System.out.println("NTG is " + NUMBER_TO_GUESS);

        int i;

        for (i = 0; (i <= GUESSES_ALLOWED) && (numberGuessed!=NUMBER_TO_GUESS); i++) {
            System.out.print("Guess a number between 0 and 20 (inclusive) ");
            numberGuessed = Sc.nextInt();

            if (numberGuessed > NUMBER_TO_GUESS) {
                System.out.println("Your guess is too high");
                System.out.println("You have "+(GUESSES_ALLOWED-i-1)+" chances");

            } else if (numberGuessed < NUMBER_TO_GUESS) {
                System.out.println("Your guess is too low");
                System.out.println("You have "+(GUESSES_ALLOWED-i-1)+" chances");

            }
        }

        if (numberGuessed == NUMBER_TO_GUESS)
        {
            System.out.println("Hurray!! You got it right in " + (i) + " chances");
        }
        else {
            System.out.println("The number to be guessed is " + NUMBER_TO_GUESS);
        }
    }
}
