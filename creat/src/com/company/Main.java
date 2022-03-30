package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String s= sc.nextLine();
        System.out.println(s);
        if(s.length()==5)
        {
            System.out.println("Full Name is");
            System.out.println("Padma Priya Rayanapati");
        }
        else if(s=="vijay")
        {
            System.out.println("Full Name is");
            System.out.println("Vijay kanth Rayanapati");
        }
        else if(s.length()==9)
        {
            System.out.println("Full Name is");
            System.out.println("S S S Meenakshi Rayanapati");
        }
        else if(s.length()==12)
        {
            System.out.println("Full Name is");
            System.out.println("S B Subrahmanya L K Rayanapati");
        }






    }
}
