package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("the numbers are:");

        if(input.hasNextInt())
        {
            double minimumNumber = input.nextDouble();
            double maximumNumber = minimumNumber;

            while (input.hasNextInt())
            {
                double currentNumber = input.nextDouble();
                if (currentNumber < minimumNumber)
                    minimumNumber = currentNumber;
                if (currentNumber > maximumNumber)
                    maximumNumber = currentNumber;

            }
            System.out.println("Max number "+maximumNumber+" min number"+minimumNumber);
        }
        else
        {
            System.out.println("No numbers provided");
        }

    }
}
