package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte a= 10;
        short b= 20;
        int c= 50;
        long d= (50000+10*(a+b+c));
        System.out.println(d);

        short e= (short) (1000+ 10 *(a+b+c));
        System.out.println(e);
    }
}
