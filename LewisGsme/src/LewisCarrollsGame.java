/* SELF ASSESSMENT

1. readDictionary
- I have the correct method definition [Mark out of 5:5]
- Comment: Yes, I have the correct method definition
- My method reads the words from the "words.txt" file. [Mark out of 5:5]
- Comment: Yes, My method reads the words from the "words.txt" file.
- It returns the contents from "words.txt" in a String array or an ArrayList. [Mark out of 5:5]
- Comment: Yes, It returns the contents from "words.txt" in a String array or an ArrayList

2. readWordList
- I have the correct method definition [Mark out of 5:5]
- Comment:Yes, I have the correct method definition
- My method reads the words provided (which are separated by commas, saves them to an array or ArrayList of String references and returns it. [Mark out of 5:5]
- Comment: Yes, My method reads the words provided (which are separated by commas, saves them to an array or ArrayList of String references and returns it

3. isUniqueList
- I have the correct method definition [Mark out of 5:5]
- Comment: Yes, I have the correct method definition
- My method compares each word in the array with the rest of the words in the list. [Mark out of 5:5]
- Comment: Yes, My method compares each word in the array with the rest of the words in the list
- Exits the loop when a non-unique word is found. [Mark out of 5:5]
- Comment: Yes, My program exits the loop when a non-unique word is found
- Returns true is all the words are unique and false otherwise. [Mark out of 5:5]
- Comment: Yes, my program returns true is all the words are unique and false otherwise

4. isEnglishWord
- I have the correct method definition [Mark out of 5:5]
- Comment:Yes,I have the correct method definition
- My method uses the binarySearch method in Arrays library class. [Mark out of 3:3]
- Comment:Yes, My method uses the binarySearch method in Arrays library class
- Returns true if the binarySearch method return a value >= 0, otherwise false is returned. [Mark out of 2:2]
- Comment:Yes, Returns true if the binarySearch method return a value >= 0, otherwise false is returned

5. isDifferentByOne
- I have the correct method definition [Mark out of 5:5]
- Comment:Yes, I have the correct method definition
- My method loops through the length of a words comparing characters at the same position in both words searching for one difference. [Mark out of 10:10]
- Comment:Yes, My method loops through the length of a words comparing characters at the same position in both words searching for one difference

6. isWordChain
- I have the correct method definition [Mark out of 5:5]
- Comment:Yes,I have the correct method definition
- My method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message [Mark out of 10:10]
- Comment:Yes, My method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message

7. main
- Reads all the words from file words.txt into an array or an ArrayList using the any of teh Java.IO classes covered in lectures [Mark out of 10:10]
- Comment:Yes, my program Reads all the words from file words.txt into an array or an ArrayList using the any of teh Java.IO classes covered in lectures
- Asks the user for input and calls isWordChain [Mark out of 5:5]
- Comment:Yes, my program asks the user for input and calls isWordChain

 Total Mark out of 100 (Add all the previous marks):
*/
import java.io.*;
import java.util.*;

public class LewisCarrollsGame
{

    public static String[] WORDLIST = new String[658964];

    public static void main(String[] args) throws IOException
    {
        File wordFile = new File("/Users/subrahmanyamrayanapati/Downloads/words.txt");
        ArrayList<String> dictionary = readDictionary(wordFile);
        for (int i = 0; i <WORDLIST.length; i++)
        {
            WORDLIST[i] = dictionary.get(i);
        }
        boolean quit = false;
        while (!quit)
        {
            System.out.println("Enter a comma separated list of words (or an empty list to quit):");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            ArrayList<String> userInputList = readWordList(userInput);
            if(!userInput.equals("")
                    &&!userInput.equals(null))
            {
                if(isWordChain(userInputList))
                {
                    System.out.println("Valid chain of words from Lewis Carroll's word-links game");
                }
                else
                    {
                    System.out.println("Not a valid chain of words from Lewis Carroll's word-links game");
                    }
                userInputList.clear();
            }
            else
                quit=true;
        }
    }

    public static ArrayList<String> readDictionary(File wordFile) throws IOException
    {
        ArrayList<String> Dictionary = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(wordFile));
        String word;
        while ((word = reader.readLine()) != null)
            Dictionary.add(word);
        return Dictionary;
    }

    public static ArrayList<String> readWordList(String inputList)
    {
        ArrayList<String> wordList = new ArrayList<>();
        String[] arrayWordList=inputList.split(",");
        for(int i=0;i<arrayWordList.length;i++)
        {
            arrayWordList[i] = arrayWordList[i].trim();
            wordList.add(arrayWordList[i]);
        }
        return wordList;
    }

    public static boolean isUniqueList(ArrayList<String> inputList)
    {
        boolean uniqueList= true;
        for(int index=0; index<inputList.size()-1;index++)
        {
            for(int index2=index+1; index2<inputList.size();index2++)
            {
                if((inputList.get(index)).equalsIgnoreCase(inputList.get(index2)))
                    uniqueList=false;
            }
        }
        return uniqueList;
    }

    public static boolean isEnglishWord(String word)
    {
        boolean isEnglishWord = false;
        int binarySearch = Arrays.binarySearch(WORDLIST, word);
        if (binarySearch >= 0)
            isEnglishWord = true;
        return isEnglishWord;
    }

    public static boolean isDifferentByOne(String word1, String word2)
    {
        boolean differentByOne = false;
        int diffCharCount = 0;
        if (word1.length() == word2.length())
        {
            for (int index = 0; index < word1.length(); index++)
            {
                char charOfWord1=word1.charAt(index);
                char charOfWord2=word2.charAt(index);
                if(charOfWord1!=charOfWord2)
                    diffCharCount++;
            }
            if(diffCharCount==1)
                differentByOne=true;
        }
        return differentByOne;
    }

    public static boolean isWordChain(ArrayList<String> inputList)
    {
        boolean isWordChain = false;
        boolean isDifferent=false;
        if (isUniqueList(inputList))
        {
            for (int index = 0; index < inputList.size()-1; index++)
            {
                String word1=inputList.get(index);
                String word2=inputList.get(index+1);
                if(isDifferentByOne(word1,word2))
                    isDifferent=true;
            }
            if(isDifferent)
            {
                for(int index2=0;index2<inputList.size();index2++)
                {
                    String word=inputList.get(index2);
                    if(isEnglishWord(word))
                        isWordChain=true;
                }
            }
        }

        return isWordChain;
    }
}
