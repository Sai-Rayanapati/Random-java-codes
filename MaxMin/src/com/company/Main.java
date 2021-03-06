package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            String input = JOptionPane.showInputDialog("Enter your list of numbers separated\nby spaces:");
            Scanner numberScanner = new Scanner( input );
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
                JOptionPane.showMessageDialog(null, "The numbers you entered are between " +
                        minimumNumber + " and " + maximumNumber );
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No numbers provided.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


        }




