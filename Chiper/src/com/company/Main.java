package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner input= new Scanner(System.in);
        char[] plain;
        char[] cipher;
        plain=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        cipher=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};

        System.out.println("Enter a string");
        String myString=input.nextLine();
        System.out.println(myString);
        char[] charArray = myString.toCharArray();
        char[] newCipher=createCipher(cipher);
        System.out.println("plain array is "+ Arrays.toString(plain));
        System.out.println("cipher array is "+ Arrays.toString(newCipher));
        String encryptString=encrypt(charArray,newCipher,plain);
        System.out.println("the encrypted string is  ");
        System.out.println(encryptString);
        String decryptString=decrypt(encryptString,newCipher,plain);
        System.out.println("the decrypted string is  ");
        System.out.println(decryptString);

    }



    public static char [] createCipher(char[] cipher)
    {
        Random generator=new Random();
        if(cipher!=null)
        {
            for (int index=0;index<cipher.length;index++)
            {
                int index2=generator.nextInt(cipher.length);
                char temp=cipher[index];
                cipher[index]=cipher[index2];
                cipher[index2]=temp;
            }
        }
        return cipher;
    }

    public static String encrypt(char[] characterArray,char[] plain,char[] cipher)
    {
        int index2=0;

        for(int index=0;index<characterArray.length;index++)
        {
            char character=characterArray[index];
            for(int index1=0;index1<plain.length;index1++)
            {
                if(character==plain[index1])
                {
                    index2=index1;
                }
            }

            characterArray[index]=cipher[index2];
        }
        String encryptedString = new String( characterArray );
        return encryptedString;

    }

    public static String decrypt(String encryptString,char[] cipher, char[] plain)
    {
        char[] decryptArray=new char[26];

        char[] encryptCharArray = encryptString.toCharArray();
        int index2=0;
        for(int index=0; index<encryptString.length();index++)
        {
            char character=encryptCharArray[index];
            for(int index1=0;index1<cipher.length;index1++)
            {
                if(character==cipher[index1])
                {
                    index2=index1;
                }
            }

            encryptCharArray[index]=plain[index2];
        }
        String decryptString = new String( encryptCharArray );
        return decryptString;
    }
}
