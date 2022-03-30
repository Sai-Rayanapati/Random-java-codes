package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter the start year");
        int year1=Sc.nextInt();

        System.out.println("Enter the end year ");
        int year2=Sc.nextInt();

        Sc.close();

        for(int year=year1;year<=year2;year++)
        {
            if((year%400==0)||(year%4==0)&&(year!=100))
            {
                System.out.println(year+" is a leap year");
            }


        }


    }
}
