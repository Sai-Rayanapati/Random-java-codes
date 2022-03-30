package com.company;

import java.util.Scanner;

public class Main {
    public static final int ASSUMED_DURATION=20;

    public static double readDoubleFromUser(String question)
    {
        boolean quit=false;
        double userInput=0;
        while(!quit)
        {
            Scanner input= new Scanner(System.in);
            System.out.print(question);
            if (input.hasNextDouble())
            {
                userInput = input.nextDouble();
                quit=true;
            }
            else
                {
                    quit=false;
                    System.out.println("Invalid input! please try again.");
                }
        }
        return userInput;
    }

   public static double calculateMonthlyRepayment(double principalAmount,double annualInterestRate, int DURATION)
    {
        double monthlyRepayment=(principalAmount)*(annualInterestRate/12/100)/((1 - Math.pow(1+(annualInterestRate/12/100),(-DURATION*12))));
        monthlyRepayment=Math.round(monthlyRepayment*100)/100.0;
        return monthlyRepayment;
    }

    public static int calculateMonthsToRepayMortgage(double mortgageAmount,double affordableMonthlyRepayment,double interestRate)
    {
        int monthCount=1;
        while(mortgageAmount>affordableMonthlyRepayment)
        {
            mortgageAmount=mortgageAmount+mortgageAmount*(interestRate/12/100);
            mortgageAmount= mortgageAmount-affordableMonthlyRepayment;
            monthCount++;
        }
        return monthCount;
    }
    public static void main(String[] args)
    {
        boolean quit=false;
        while(!quit)
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to the mortgage calculator");
            String question1="Please enter the mortgage amount:";
            double mortgageAmount = readDoubleFromUser(question1);
            String question2="Please enter the annual interest rate (APR):";
            double annualInterestRate = readDoubleFromUser(question2);
            System.out.println("Assuming a " + ASSUMED_DURATION + " year term, the monthly repayments would be " + calculateMonthlyRepayment(mortgageAmount, annualInterestRate, ASSUMED_DURATION));
            String question3="How much can you afford to pay per month?";
            double affordableMonthlyRepayment = readDoubleFromUser(question3);
            int numberOfMonths = calculateMonthsToRepayMortgage(mortgageAmount, affordableMonthlyRepayment, annualInterestRate);
            System.out.println("If you pay " + affordableMonthlyRepayment + " per month your mortgage would be paid off in " + numberOfMonths / 12 +
                    " years and " + numberOfMonths % 12 + " months");
            System.out.print("Would you like to use the mortgage calculator again (yes/no)?");
            if(input.hasNext("yes"))
            {
                quit=false;
            }
            else if(input.hasNext("no"))
            {
                quit=true;
            }
        }
    }
}
