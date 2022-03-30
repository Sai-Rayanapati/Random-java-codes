package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Enter your list of numbers separated\nby spaces:");
            Scanner numberScanner = new Scanner( System.in );
            if (numberScanner.hasNextDouble())
            {
                double minimumNumber = numberScanner.nextDouble();
                double maximumNumber = minimumNumber;
                while (numberScanner.hasNextDouble())
                {
                    double currentNumber = numberScanner.nextDouble();
                    if (currentNumber < minimumNumber)
                        minimumNumber = currentNumber;
                    if (currentNumber > maximumNumber)
                        maximumNumber = currentNumber;
                }
                System.out.println("The numbers you entered are between " +
                        minimumNumber + " and " + maximumNumber );
            }
            else
            {
                System.out.println("No numbers provided.");
            }
        }
    }

