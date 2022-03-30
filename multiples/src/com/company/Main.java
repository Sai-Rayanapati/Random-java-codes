package com.company;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);

        System.out.println("Enter a positive Integer to find its multiples");
        int Number=Sc.nextInt();

        System.out.println("Enter a integer up to which you want to find its multiples");
        int Limit=Sc.nextInt();

        if((Number>0)&&(Limit>0))
        {
            System.out.println("The multiples of "+Number+" from 0 to "+Limit+" are:");
            for (int multiples = 0; multiples <= Limit; multiples++)
            {
                if(multiples%Number==0)
                {
                    System.out.print(multiples+", ");
                }
            }
        }
        else
        {
            System.out.println("Please enter a positive integer");
        }
    }

}
