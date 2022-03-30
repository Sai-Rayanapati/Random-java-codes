package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        double average=0;
        double averageP=0;
        double variance=0;
        double varianceP=0;
        int numberOfTerms=1;

        boolean quit=false;
        while (!quit)
        {
            System.out.print("Enter a number (or type 'exit'):");
            if (input.hasNext("exit"))
            {
                System.out.println("Good bye");
                quit = true;
            }
            if (input.hasNextInt()) {
                int number = input.nextInt();
                
                average = averageP+(number-averageP)/numberOfTerms;

                variance=((varianceP*(numberOfTerms-1))+(number-averageP)*(number-average))/numberOfTerms;

                numberOfTerms++;
                System.out.println(average);
                System.out.println(variance);
                averageP= average;
                varianceP= variance;
            }
        }

    }
}
