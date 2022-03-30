package com.company;
import java.util.Scanner;
import java.lang.Math;


public class Main {

    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        double number1=Sc.nextDouble();
        double number2=Sc.nextDouble();
        double number3=Sc.nextDouble();

        double Average= (number1+number2+number3)/3;

        double No1= (number1-Average);
        double No2= (number2-Average);
        double No3= (number3-Average);

        //double SD= ((number1-Average)*(number1-Average)+(number2-Average)*(number2-Average)+(number3-Average)*(number3-Average))/3;
        //double Standard_Deviation=java.lang.Math.sqrt(SD);
        double SqNO1= java.lang.Math.pow(No1,2);
        double SqNO2= java.lang.Math.pow(No2,2);
        double SqNO3= java.lang.Math.pow(No3,2);

        double SD= (SqNO1+SqNO2+SqNO3)/3;
        double StandardDeviation= java.lang.Math.sqrt(SD);


        System.out.println("Average is "+Average);
        System.out.println("Standard Deviation is "+StandardDeviation);

    }
}
