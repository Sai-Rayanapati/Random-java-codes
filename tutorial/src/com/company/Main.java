package com.company;
import javax.swing.*;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Does the vertebrate have Cold blood?");
        boolean answer= sc.nextBoolean();
        if(answer== true)
        {
            System.out.println("Does the vertebrate have fins?");
            boolean answer1= sc.nextBoolean();
            if(answer1==false)
            {
                System.out.println("Does the vertebrate have moist skin?");
                boolean answer2= sc.nextBoolean();
                if(answer2==true)
                {
                    System.out.println("The vertebrate is an amphibian");
                }
                else
                {
                    System.out.println("The vertebrate is a reptile");
                }

            }
            else
            {
                System.out.println("The vertebrate is a Fish");
            }

        }
        else
        {
            System.out.println("Does the vertebrate have feathers?");
            boolean answer3= sc.nextBoolean();
            if (answer3==true)
            {
                System.out.println("The vertebrate is a Bird");
            }
            else
            {
                System.out.println("The vertebrate is a Mammal");
            }
        }








    }
}
