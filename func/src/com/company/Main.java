package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double total;
        System.out.println("Enter Two Numbers");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println("1st Number="+a);
        System.out.println("2nd Number="+b);
       /* System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("Enter Number");
        int OP=sc.nextInt();
        if (OP == 1)
        {
            total=a+b;
            System.out.println(total);
        }
        else if(OP==2)
        {
            total=a-b;
            System.out.println(total);
        }
        else if(OP==3)
        {
            total=a*b;
            System.out.println(total);
        }else if(OP==4)
        {
            total=a/b;
            System.out.println(total);
        }
*/


       System.out.println("Addition="+(a+b));
        System.out.println("Subraction="+(a-b));
        System.out.println("Multiplication="+(a*b));
        System.out.println("Division="+(a/b));






    }



}
