package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int MAX_NUMBER=3;
        int computerScore=0;
        int userScore=0;

        for(int count=1;count<=5;count++)
        {
            Random number= new Random();
            int computerChosenNumber = number.nextInt(MAX_NUMBER+1);

            String rockPaperScissor;

            if(computerChosenNumber==1)
            {
                rockPaperScissor= "Rock";
            }
            else if(computerChosenNumber==2)
            {
                rockPaperScissor="Paper";
            }
            else
            {
                rockPaperScissor="Scissors";
            }

            System.out.print("Enter 1(for Rock) or 2(for Paper) or 3(for Scissors)");
            int userChosenNumber= sc.nextInt();

            if(userChosenNumber==1)
            {
                if(computerChosenNumber==1)
                {
                    System.out.println("The round was a draw as I chose "+rockPaperScissor+" too");
                }
                else if(computerChosenNumber==2)
                {
                    System.out.println("You lost this round as I chose "+rockPaperScissor);
                    computerScore++;
                }
                else
                {
                    System.out.println("You won this round as I chose "+rockPaperScissor);
                    userScore++;
                }
            }

            else if(userChosenNumber==2)
            {
                if(computerChosenNumber==1)
                {
                    System.out.println("You won this round as I chose "+rockPaperScissor);
                    userScore++;
                }
                else if(computerChosenNumber==2)
                {
                    System.out.println("The round was a draw as I chose "+rockPaperScissor+" too" );
                }
                else
                {
                    System.out.println("You lost this round as I chose "+rockPaperScissor );
                    computerScore++;
                }
            }
            else
            {
                if(computerChosenNumber==1)
                {
                    System.out.println("You lost this round as I chose "+rockPaperScissor );
                    computerScore++;
                }
                else if(computerChosenNumber==2)
                {
                    System.out.println("You won this round as I chose "+rockPaperScissor);
                    userScore++;
                }
                else
                {
                    System.out.println("The round was a draw as I chose "+rockPaperScissor+" too"  );
                }
            }
        }

        System.out.println("The final score was Computer: "+computerScore+" User: "+userScore);


    }
}
