package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Enter your list of numbers separated\nby spaces:");
        Scanner numberScanner = new Scanner( System.in );

            double minimumNumber = numberScanner.nextDouble();
            double maximumNumber = minimumNumber;
            while (numberScanner.hasNextDouble())
            {
                double currentNumber = numberScanner.nextDouble();
                if (currentNumber < minimumNumber)
                    minimumNumber = currentNumber;
                if (currentNumber > maximumNumber)
                    maximumNumber = currentNumber;
                else
                {
                    numberScanner.next();
                }
            }
            System.out.println("The numbers you entered are between " +
                    minimumNumber + " and " + maximumNumber );

    }
}
