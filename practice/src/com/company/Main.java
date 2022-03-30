package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x=3;

        double loop=0;
        Scanner input=new Scanner(System.in);
        double userDeclaredNumber=input.nextDouble();
        int sign=1;
        double pi=0;
        double part;

        while (loop<userDeclaredNumber)
        {
            part = (4 / ((x - 1) * (x) * (x + 1)))*sign;
            pi=pi+part;

            x=x+2;
            loop++;
            sign=sign*-1;

        }
        System.out.println(pi+3);
    }
}
