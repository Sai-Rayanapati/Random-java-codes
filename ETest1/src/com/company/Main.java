package com.company;

import java.util.Scanner;

public class Main {

    public static final double BMI_OVERWEIGHT=25.00;

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean quit=false;
        double overWeight=0;
        double total=0;
        double percentage;
        double previousBMI=0;

        while(!quit)
        {
            System.out.print("Enter Persons height in meters(or quit)");
            if(input.hasNextDouble())
            {
                double height = input.nextDouble();
                System.out.print("Enter weight in kilograms");
                double weight = input.nextDouble();
                total=total+1;
                double BMI = (weight) / (height * height);
                double AverageBMI= (BMI+previousBMI)/total;
                previousBMI= previousBMI+BMI;


                if(BMI>=BMI_OVERWEIGHT)
                {
                    overWeight=overWeight+1;
                }

                percentage=(overWeight/total)*100;





                System.out.println("The average BMI is " + AverageBMI+" and "+percentage+"% of the people are overweight or obese");

            }
            else
            {
                quit=true;
            }
        }
    }
}
