package com.company;

import java.util.Scanner;

public class Main {

    public static boolean allEven(int[] userInputs)
    {
        boolean check=true;
        for (int index=0; index<userInputs.length && check==true;index++)
        {
            if(userInputs[index]%2==1)
                check=false;
        }
        return check;
    }
    public static int range(int[] userInput)
    {
        int difference;
        if(userInput.length<2)
            difference=0;
        else
        {
            int maxValue=0,minValue=userInput[0];
            for(int index=0;index<userInput.length;index++)
            {
                if(userInput[index]>maxValue)
                {
                    maxValue=userInput[index];
                }
                if(userInput[index]<minValue)
                    minValue=userInput[index];
            }
            difference=maxValue-minValue;
        }
        return difference;
    }

    public static void main(String[] args) {
        boolean exit=false;
        int[] userInput=new int[0];
        Scanner input =new Scanner(System.in);
        do
        {
            System.out.print("enter an integer to add to the array (or 'quit' to finish:");
            if(input.hasNext("quit"))
                exit=true;
            else if(input.hasNextInt())
            {
                int[] tempArray=new int[userInput.length+1];
                System.arraycopy(userInput, 0,tempArray, 0, userInput.length);
                tempArray[userInput.length]=input.nextInt();
                userInput=tempArray;
                boolean checkAllEven=allEven(userInput);
                int difference=range(userInput);
                System.out.print("the magnitude of the range of values is " +difference);
                if(checkAllEven)
                    System.out.println(", and all values are even");
                else
                    System.out.println(", and not all values are even");
            }
            else
                System.out.println("Invalid Input");

        }while(!exit);
        input.close();
    }

}
