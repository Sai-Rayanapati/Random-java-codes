package com.company;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the coefficients of your second order polynomial separated by spaces (or enter quit):");
        boolean quit=false;
               while(!quit)
               if(input.hasNext("quit"))
               {
                    quit=true;
               }
               else
               {

                   double coeff1 = input.nextDouble();
                   double coeff2 = input.nextDouble();
                   double coeff3 = input.nextDouble();
                   double determinant = Math.sqrt((coeff2 * coeff2) - (4 * coeff1 * coeff3));

                   if(coeff1==0)
                   {
                       System.out.println("It is not a second order equation. Please enter a valid equation.");
                       System.out.print("Enter the coefficients of your second order polynomial separated by spaces (or enter quit):");
                   }

                   else if(determinant<0)
                   {
                       System.out.println("It has imaginary roots");
                       System.out.print("Enter the coefficients of your second order polynomial separated by spaces (or enter quit):");
                   }
                   else
                       {

                       double root1 = ((-coeff2 + determinant) / 2 * coeff1);
                       double root2 = ((-coeff2 - determinant) / 2 * coeff1);

                       System.out.println("The roots of the equations are x=" + root1 + " and x=" + root2);
                       System.out.print("Enter the coefficients of your second order polynomial separated by spaces (or enter quit):");
                   }
               }

    }
}
