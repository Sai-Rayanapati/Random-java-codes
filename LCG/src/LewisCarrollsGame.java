/* SELF ASSESSMENT
1. readDictionary
- I have the correct method definition [Mark out of 5:]
- Comment:
- My method reads the words from the "words.txt" file. [Mark out of 5:]
- Comment:
- It returns the contents from "words.txt" in a String array or an ArrayList. [Mark out of 5:]
- Comment:

2. readWordList
- I have the correct method definition [Mark out of 5:]
- Comment:
- My method reads the words provided (which are separated by commas, saves them to an array or ArrayList of String references and returns it. [Mark out of 5:]
- Comment:

3. isUniqueList
- I have the correct method definition [Mark out of 5:]
- Comment:
- My method compares each word in the array with the rest of the words in the list. [Mark out of 5:]
- Comment:
- Exits the loop when a non-unique word is found. [Mark out of 5:]
- Comment:
- Returns true is all the words are unique and false otherwise. [Mark out of 5:]
- Comment:

4. isEnglishWord
- I have the correct method definition [Mark out of 5:]
- Comment:
- My method uses the binarySearch method in Arrays library class. [Mark out of 3:]
- Comment:
- Returns true if the binarySearch method return a value >= 0, otherwise false is returned. [Mark out of 2:]
- Comment:

5. isDifferentByOne
- I have the correct method definition [Mark out of 5:]
- Comment:
- My method loops through the length of a words comparing characters at the same position in both words searching for one difference. [Mark out of 10:]
- Comment:

6. isWordChain
- I have the correct method definition [Mark out of 5:]
- Comment:
- My method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message [Mark out of 10:]
- Comment:

7. main
- Reads all the words from file words.txt into an array or an ArrayList using the any of teh Java.IO classes covered in lectures [Mark out of 10:]
- Comment:
- Asks the user for input and calls isWordChain [Mark out of 5:]
- Comment:

 Total Mark out of 100 (Add all the previous marks):
*/

//package lewisCarrollsWordLink;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class LewisCarrollsGame
{
    static ArrayList<String> wordList=new ArrayList<String>();
    static ArrayList<String> dictionary=new ArrayList<String>();
    static void readDictionary() throws IOException {
        FileReader fr=new FileReader("/Users/subrahmanyamrayanapati/Downloads/words.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        line = br.readLine();
        while((line=br.readLine())!=null) {
            dictionary.add(line);
        }
    }

    static ArrayList<String> readWordList(String wordsString) throws IOException
    {
        String word="";
        String temp="";
        for(int index=0;index<wordsString.length();index++)
        {
            char character=wordsString.charAt(index);
            String charString=String.valueOf(character);

            if(charString.equalsIgnoreCase(",")==false&& (charString.equalsIgnoreCase(" "))==false)
            {
                word=temp+charString;
            }
            if((charString.equalsIgnoreCase(",")))
            {
                wordList.add(word);
                word="";
                temp="";
            }
            else if((charString.equalsIgnoreCase(" ")))
            {
                word="";
                temp="";
            }
            temp=word;
        }
        wordList.add(word);
        return wordList;
    }

    static boolean isUniquelist(ArrayList<String> list)
    {
        boolean isUnique=true;
        for(int i=0;i<list.size()-1;i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                String firstWord=list.get(i);
                String secondWord=list.get(j);
                if(firstWord.equalsIgnoreCase(secondWord))
                {
                    isUnique=false;
                }
            }
        }
        return isUnique;
    }

    static boolean isEnglishWord(String englishWord)
    {
        boolean isEnglishWord=false;
        int index = Collections.binarySearch(dictionary, englishWord);
        if(index>=0){
            isEnglishWord=true;
        }
        return isEnglishWord;
    }

    static boolean isDifferentByOne(String firstWord,String secondWord)
    {
        int differentLetterCount=0;
        boolean isDifferentByOne=false;
        int lengthOne=firstWord.length();
        int lengthTwo=secondWord.length();
        if(lengthOne==lengthTwo)
        {
            for(int i=0;i<lengthOne;i++)
            {
                char characterOfFirstWord=firstWord.charAt(i);
                char characterOfSecondWord=secondWord.charAt(i);
                if(characterOfFirstWord!=characterOfSecondWord)
                {
                    differentLetterCount++;
                }
            }
            if(differentLetterCount==1)
            {
                isDifferentByOne=true;
            }
        }
        return isDifferentByOne;
    }

    static boolean isWordChain(ArrayList<String> wordChain)
    {
        boolean isWordChain=false;
        boolean isDifferent=false;
        if(isUniquelist(wordChain))
        {
            for(int i=0;i<wordChain.size()-1;i++)
            {
                String firstWord=wordChain.get(i);
                String secondWord=wordChain.get(i+1);
                if(isDifferentByOne(firstWord,secondWord))
                {
                    isDifferent=true;
                }
                else {
                    isDifferent=false;
                    break;
                }
            }
            if(isDifferent==true)
            {
                for(int index=0;index<wordChain.size();index++)
                {
                    String currentWord=wordChain.get(index);
                    if(isEnglishWord(currentWord))
                    {
                        isWordChain=true;
                    }
                    else {
                        isWordChain=false;
                        index=wordChain.size();

                    }
                }
            }
        }
        return isWordChain;
    }

    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        boolean quit=false;
        readDictionary();
        while(quit!=true) {
            ArrayList<String> wordList=new ArrayList<String>();
            System.out.println("Enter a comma separated list of words (or an empty list to quit):");
            Scanner input=new Scanner(System.in);
            String userInput=input.nextLine();
            wordList=readWordList(userInput);
            if(!userInput.equals("")&&!userInput.equals(null))
            {
                if(isWordChain(wordList)) {
                    System.out.println("Valid chain of words from Lewis Carroll's word-links game");
                }
                else {
                    System.out.println("Not a valid chain of words from Lewis Carroll's word-links game");
                }
                wordList.clear();
            }
            else{
                quit=true;
            }
        }
    }
}