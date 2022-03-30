package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number to find if it is a palindrome");
        int userNumber=input.nextInt();
        int remainingNumber=userNumber;
        int reversedNumber=0;
        while(remainingNumber>0)
        {
            reversedNumber=(reversedNumber*10)+(remainingNumber%10);
            remainingNumber=remainingNumber/10;

        }

        if(reversedNumber==userNumber)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}
