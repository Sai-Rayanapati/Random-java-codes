package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);

        System.out.println("Enter a number for which you want to find the factorial");
        int Number=Sc.nextInt();
        Sc.close();

        int Factorial=1;

        for(int i=Number;i>0;i--)
        {
            Factorial=Factorial*i;
        }
        System.out.println(Factorial);

    }
}
