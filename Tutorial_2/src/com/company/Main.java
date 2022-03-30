package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("How many high scores do you want to enter");
        int noOfScores= input.nextInt();
        int[] scores= new int[noOfScores];
        initialiseHighScores(scores);
        for(int index=0;index<scores.length;index++)
        {
            System.out.print("Enter a score");
            scores[index]= input.nextInt();
            int currentScore=scores[index];
            if(higherThan(scores,currentScore))
            {
                System.out.println("Higher");
            }

        }
        insertScore(scores);
        printHighScores(scores);

    }

    public static void initialiseHighScores (int[] scores)
    {
        for(int index=0;index<scores.length;index++)
        {
            scores[index]=0;
        }
    }

    public static void printHighScores(int[] scores)
    {
        System.out.print("The high scores are");
        for(int index=0; index<scores.length;index++)
        {
            System.out.print(((index==0)?" ":",")+scores[index]);
            if(index==scores.length-1)
            {
                System.out.println(".");

            }
        }
    }

    public static boolean higherThan(int[] scores, int currentScore)
    {
        boolean highScore=false;
        for(int i=0;i<scores.length;i++)
        {
            if(currentScore>scores[i])
                highScore=true;
        }
        return highScore;
    }

    public static void insertScore(int[] scores)
    {
        int temp=0;
        for(int i=0;i<scores.length;i++)
        {
            for(int j=i+1;j<scores.length;j++)
            {
                if(scores[j]>scores[i])
                {
                    temp=scores[j];
                    scores[j]=scores[i];
                    scores[i]=temp;

                }
            }
        }

    }
}
