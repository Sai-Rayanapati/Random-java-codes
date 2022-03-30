package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int[] a ={1,2};
        int[] temp= new int[a.length+1];
        System.arraycopy(a,0,temp,0,a.length);
        temp[temp.length-1]=3;
        a=temp;
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i]);

        }   
    }



}
