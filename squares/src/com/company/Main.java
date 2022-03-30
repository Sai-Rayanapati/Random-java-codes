package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number below which you want to find squares");

        int userNumber=input.nextInt();
        if(userNumber>=1)
        {
            int squarerootUserNumber= (int) Math.sqrt(userNumber);

            while(squarerootUserNumber>0)
            {
                System.out.print(squarerootUserNumber);
                squarerootUserNumber--;

            }
        }
        else
        {
            System.out.println("Enter valid number");
        }
    }
}
