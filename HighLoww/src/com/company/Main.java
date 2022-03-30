    package com.company;

    import java.util.Random;
    import java.util.Scanner;

    public class Main {

        public static final int OFFSET_NUMBER = 2;
        public static final int CORRECT_ANSWERS_TO_WIN = 4;
        public static final int WRONG_ANSWERS_TO_LOSE = 1;

        public static final int MAX_COMPUTER_OUTPUTS=13;

        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);

            int correctAnswerScore=0;
            int wrongAnswerScore=0;

            while(correctAnswerScore<=CORRECT_ANSWERS_TO_WIN && wrongAnswerScore<WRONG_ANSWERS_TO_LOSE)
            {
                Random number=new Random();

                int currentComputerNumber=number.nextInt(MAX_COMPUTER_OUTPUTS+OFFSET_NUMBER);

                if(currentComputerNumber==14)
            {
                System.out.println("The card is Ace");
            }
            else if(currentComputerNumber==13)
            {
                System.out.println("The card is King");
            }
            else if(currentComputerNumber==12)
            {
                System.out.println("The card is Queen");
            }
            else if(currentComputerNumber==11)
            {
                System.out.println("The card is Jack");
            }
            else{
                System.out.println("The card is " + currentComputerNumber);
            }

            int nextComputerNumber=number.nextInt(MAX_COMPUTER_OUTPUTS+OFFSET_NUMBER);

                System.out.println(nextComputerNumber);

                System.out.print("Do you think the next card will be higher, lower or equal?");
                String userInput = null;

                if(currentComputerNumber>nextComputerNumber && userInput.matches("higher"))
                {
                    correctAnswerScore++;
                }
                else if(currentComputerNumber>nextComputerNumber && userInput.matches("lower"))
                {
                    wrongAnswerScore++;
                }
                else if(currentComputerNumber>nextComputerNumber && userInput.matches("equal"))
                {
                    wrongAnswerScore++;
                }


                else if(currentComputerNumber<nextComputerNumber && userInput.matches("higher"))
                {
                    wrongAnswerScore++;
                }
                else if(currentComputerNumber<nextComputerNumber && userInput.matches("lower"))
                {
                    correctAnswerScore++;
                }
                else if(currentComputerNumber<nextComputerNumber && userInput.matches("equal"))
                {
                    wrongAnswerScore++;
                }

                else if(currentComputerNumber==nextComputerNumber && userInput.matches("higher"))
                {
                    wrongAnswerScore++;
                }
                else if(currentComputerNumber==nextComputerNumber && userInput.matches("lower"))
                {
                    wrongAnswerScore++;
                }
                else if(currentComputerNumber==nextComputerNumber && userInput.matches("equal"))
                {
                    correctAnswerScore++;
                }

                if(currentComputerNumber==4)
                {
                    System.out.println("Congratulations.  You got them all correct.");
                }

            }
    }
    }
