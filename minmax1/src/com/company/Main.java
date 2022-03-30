package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean quit=false;
        System.out.println("enter numbers");


            if(input.hasNextInt())
            {
                int previousNumber=input.nextInt();
                int minNumber=previousNumber;
                int maxNumber=minNumber;

                while (input.hasNextInt())
                {
                    int number = input.nextInt();
                    if (number < minNumber)
                    {
                        minNumber = number;
                    }
                    if (number > maxNumber) {
                        maxNumber = number;
                    }

                }

                System.out.println(minNumber+"  "+maxNumber);
            }
            else
            {
                System.out.println("error" );
            }







        }

    }

