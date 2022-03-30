package com.company;

import java.util.Scanner;

public class Main<quit> {

    int number;
    int[]array=new int[1];
    boolean quit=false;
    while(!quit)
    {
        for(int count=0;count<array.length;count++) {
            System.out.println("Enter the number");
            Scanner input=new Scanner(System.in);
            if(input.hasNext("quit")) {
                quit=true;
            }
            if(input.hasNextInt())
            {
                number=input.nextInt();

                int [] tempArray=new int[array.length+1];
                System.arraycopy(array,0,tempArray,0,array.length);
                tempArray[tempArray.length-1]=number;
                array=tempArray;
                System.out.println(getmin(array));
                if(getpal(tempArray)) {
                    System.out.println("The number is pallendrome");

                }

            }
        }

    }
}
    public static boolean getpal(int[]array) {
        boolean ok=false;
        int copy;
        copy=array[1];
        for(int i=1;i<array.length-1;i++) {
            int j=copy*10;
            copy=j+array[i+1];
        }
        int cop;
        cop=array[array.length-1];
        for(int i=array.length-1;i>1;i--) {
            int j=cop*10;
            cop=j+array[i-1];
        }

        if(cop==copy) {
            ok=true;
        }

        return ok;
    }

    public static int getmin(int[]array) {
        int min=0;
        if(array!=null) {
            min=array[1];

            for(int index=1;index<array.length;index++)
            {

                if(array[index]<min)
                {
                    min = array[index];
                }
            }
        }
        return min;
    }
}
