/* SELF ASSESSMENT

 1. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?

        Mark out of 5:5
        Comment:Yes, I have used easy-to-understand meaningful variable names formatted them properly. Eg:userText,lowercaseUserText
                encryptedString, decryptedString and so on.

 2. Did I indent the code appropriately?

        Mark out of 5: 5
        Comment:Yes, I have intended the code properly.

 3. Did I write the createCipher function correctly (parameters, return type and function body) and invoke it correctly?

       Mark out of 20:20
        Comment:Yes, I wrote the createCipher function correctly (parameters, return type and function body) and invoked it correctly.

 4. Did I write the encrypt function correctly (parameters, return type and function body) and invoke it correctly?

       Mark out of 20:20
        Comment:Yes, I wrote the encrypt function correctly (parameters, return type and function body) and invoked it correctly.

 5. Did I write the decrypt function correctly (parameters, return type and function body) and invoke it correctly?

       Mark out of 20:20
        Comment:Yes, I wrote the decrypt function correctly (parameters, return type and function body) and invoked it correctly.

 6. Did I write the main function body correctly (repeatedly obtaining a string and encrypting it and then decrypting the encrypted version)?

       Mark out of 25:25
        Comment:Yes, I wrote the main function cody correctly (repeatedly obtaining a string and encrypting it and then decrypting the encrypted version)?

 7. How well did I complete this self-assessment?

        Mark out of 5:5
        Comment:I completed the self-assessment honestly.

 Total Mark out of 100 (Add all the previous marks):100

*/
package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static final char [] ALPHABETS_AND_SPACE_ARRAY = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};


    public static void main(String[] args)
    {

        while(true)
        {
            char [] cipher = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};

            System.out.println("Enter the text");
            Scanner input=new Scanner(System.in);
            String userText=input.nextLine();
            System.out.println("Your text is "+"'"+userText+"'");

            String lowercaseUserText = userText.toLowerCase();
            char[] characterArray = lowercaseUserText.toCharArray();
            char[] newCipher=createCipher(cipher);


            String encryptedString=encrypt(characterArray,newCipher);
            System.out.print("The encrypted string is ");
            System.out.println("'"+encryptedString+"'");
            char[] encryptedCharArray = encryptedString.toCharArray();
            String decryptedString=decrypt(encryptedCharArray,newCipher);
            System.out.print("The decrypted string is ");
            System.out.println("'"+decryptedString+"'\n");
        }
    }

    public static char[] createCipher(char [] cipher)
    {
        if (cipher!=null)
        {
            Random randomGenerator = new Random();
            for (int index=0; index<cipher.length; index++ )
            {
                int otherIndex = randomGenerator.nextInt(cipher.length);
                char temp = cipher[index];
                cipher[index] = cipher[otherIndex];
                cipher[otherIndex] = temp;
            }
        }
        return cipher;
    }

    public static String encrypt(char[] characterArray, char[]cipher)
    {
        int index2=0;
        for(int index=0;index<characterArray.length;index++)
        {
            char character=characterArray[index];
            for(int index1=0;index1<ALPHABETS_AND_SPACE_ARRAY.length;index1++)
            {
                if(character==ALPHABETS_AND_SPACE_ARRAY[index1])
                {
                    index2=index1;
                }
            }
            characterArray[index]=cipher[index2];
        }
        String encryptString = new String( characterArray );
        return encryptString;
    }

    public static String decrypt(char[]  encryptCharArray, char[] cipher)
    {
        int index2=0;
        for(int index=0; index<encryptCharArray.length;index++)
        {
            char character=encryptCharArray[index];
            for(int index1=0;index1<cipher.length;index1++)
            {
                if(character==cipher[index1])
                {
                    index2=index1;
                }
            }

            encryptCharArray[index]=ALPHABETS_AND_SPACE_ARRAY[index2];
        }
        String decryptString = new String( encryptCharArray );
        return decryptString;
    }
}




