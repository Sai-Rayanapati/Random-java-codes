package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double[] studentMarks = new double[1];
        for(int count=0;count<studentMarks.length;count++)
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a student percentage:");
                double studentPercentage = input.nextDouble();

                double tempArray[]=new double[studentMarks.length+1];
                System.arraycopy(studentMarks,0,tempArray,0,studentMarks.length);
                tempArray[tempArray.length-1]=studentPercentage;
                studentMarks=tempArray;


                System.out.println(countFirstClassHonours(studentMarks) + " students obtained first class honours. The highest mark was "
                        + determineBestMark(studentMarks));
            }
    }
    public static int countFirstClassHonours(double[] studentMarks)
    {
        int firstClassHonours=0;
        for(int i=0; i<studentMarks.length;i++)
        {
            if (studentMarks[i] >= 70) {
                firstClassHonours+=1;
            }
        }
        return firstClassHonours;
    }
    public static double determineBestMark(double[] array)
    {
        double highestMark=0;
        for (int i=0;i<array.length;i++)
        {
            if(array[i]>highestMark)
            {
                highestMark=array[i];
            }
        }
        return highestMark;
    }
}
