package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

        public static final int OFFSET_NUMBER = 2;
        public static final int MAX_COMPUTER_OUTPUTS=13;

        public static void main(String[] args)
        {
            int gameCount=1;
            int correctAnswer = 0;
            int wrongAnswer = 0;

            Random number=new Random();
            int previousComputerNumber=number.nextInt(MAX_COMPUTER_OUTPUTS)+OFFSET_NUMBER;

            if(previousComputerNumber==14)
            {
                System.out.println("The card is Ace");
            }
            else if(previousComputerNumber==13)
            {
                System.out.println("The card is King ");
            }
            else if(previousComputerNumber==12)
            {
                System.out.println("The card is Queen ");
            }
            else if(previousComputerNumber==11)
            {
                System.out.println("The card is Jack ");
            }
            else
            {
                System.out.println("The card is "+previousComputerNumber);
            }


            while(gameCount<=4)
            {

                System.out.print("Do you think the next card will be higher, lower or equal?");
                Scanner input=new Scanner(System.in);

                int nextComputerNumber= number.nextInt(MAX_COMPUTER_OUTPUTS)+OFFSET_NUMBER;

                if(input.hasNext("higher") &&nextComputerNumber>previousComputerNumber)
                {
                    correctAnswer++;
                }
                else if(input.hasNext("lower")&&nextComputerNumber<previousComputerNumber)
                {
                    correctAnswer++;
                }
                else if(input.hasNext("equal")&&nextComputerNumber==previousComputerNumber)
                {
                    correctAnswer++;
                }
                else
                {
                    wrongAnswer++;
                }

                if(nextComputerNumber==14)
                {
                    System.out.println("The card is Ace");
                }
                else if(nextComputerNumber==13)
                {
                    System.out.println("The card is King ");
                }
                else if(nextComputerNumber==12)
                {
                    System.out.println("The card is Queen ");
                }
                else if(nextComputerNumber==11)
                {
                    System.out.println("The card is Jack ");
                }
                else
                {
                    System.out.println("The card is "+nextComputerNumber);
                }

                gameCount++;
                previousComputerNumber=nextComputerNumber;


            }

            if (correctAnswer==4)
            {
                System.out.println("Congratulations.  You got them all correct.");
            }
            else
            {
                System.out.println("Better luck next time");
            }
        }
}
