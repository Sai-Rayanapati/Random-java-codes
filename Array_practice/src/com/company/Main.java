package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double[] numbers=null;
        double total=0;
        boolean quit=false;
        while (!quit)
        {
            System.out.println("Enter numbers");
            if(input.hasNextDouble())
            {
                double[] newNumbers= new double[(numbers==null)? 1:(numbers.length+1)];
                if(numbers!=null)
                System.arraycopy(numbers,0,newNumbers,0,numbers.length);
                newNumbers[newNumbers.length-1]= input.nextDouble();
                numbers=newNumbers;
                total=total+numbers[numbers.length-1];
                System.out.println("total= "+total);

            }
            else
                quit=true;
        }
    }
}
