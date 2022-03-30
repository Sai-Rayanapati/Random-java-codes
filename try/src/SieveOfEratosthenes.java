/* SELF ASSESSMENT
   1.  createSequence:
Did I use the correct method definition?
Mark out of 5:5
Comment:Yes, I used correct method definition
Did I create an array of size n (passed as the parameter) and initialise it?
Mark out of 5:5
Comment:Yes, I created an array of size n (passed as the parameter) and initialise it
Did I return the correct item?
Mark out of 5:5
Comment:Yes, I returned the correct item
   2.  crossOutMultiples
Did I use the correct method definition?
Mark out of 5:5
Comment:Yes,I used the correct method definition
Did I ensure the parameters are not null and one of them is a valid index into the array
Mark out of 2:2
Comment:Yes,I ensured the parameters are not null and one of them is a valid index into the array
Did I loop through the array using the correct multiple?
Mark out of 5:5
Comment:Yes, I looped through the array using the correct multiple
Did I cross out correct items in the array that were not already crossed out?
Mark out of 3:3
Comment:yes, I crossed out correct items in the array that were not already crossed out
   3.  sieve
Did I have the correct function definition?
Mark out of 5:5
Comment:Yes, I have the correct function definition
Did I make calls to other methods?
Mark out of 5:5
Comment:Yes, I made calls to other methods
Did I return an array with all non-prime numbers are crossed out?
Mark out of 2:2
Comment:Yes, I returned an array with all non-prime numbers are crossed out
   4.  sequenceTostring
Did I have the correct function definition?
Mark out of 5:5
Comment:Yes, I had the correct function definition
Did I ensure the parameter to be used is not null?
Mark out of 3:3
Comment:Yes, I ensured the parameter to be used is not null
Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets?
Mark out of 10:10
Comment:Yes, I Looped through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets
   5.  nonCrossedOutSubseqToString
Did I have the correct function definition
Mark out of 5:5
Comment:Yes,I had the correct function definition
Did I ensure the parameter to be used is not null?
Mark out of 3:3
Comment:Yes, I ensured the parameter to be used is not null
Did I loop through the array updating the String variable with just the non-crossed out numbers?
Mark out of 5:5
Comment:Yes, I looped through the array updating the String variable with just the non-crossed out numbers
   6.  main
Did I ask  the user for input n and handles input errors?
Mark out of 5:3
Comments:Yes, I asked  the user for input n and have done partial error handling
Did I make calls to other methods (at least one)?
Mark out of 5:5
Comment:Yes, I made calls to other methods
Did I print the output as shown in the question?
Mark out of 5:5
Comment:Yes, I printed the output as shown in the question
   7.  Overall
Is my code indented correctly?
Mark out of 4:4
Comments:Yes, I intended my code correctly
Do my variable names make sense?
Mark out of 4:4
Comments:Yes, my variable names make sense
Do my variable names, method names and class name follow the Java coding standard
Mark out of 4:4
Comments:Yes, my variable names, method names and class name follow the Java coding standards
      Total Mark out of 100 (Add all the previous marks):100
*/

import java.util.Scanner;

    public class SieveOfEratosthenes {
        public static int[] createSequence(int userNumber)
        {
            int prime[] = new int[userNumber + 1];
            for (int count = 2; count <= userNumber; count++)
                {
                    prime[count] = count;
                }
            return prime;
        }

        public static void crossOutHigherMultiples(int userNumber, boolean[] primeBoolean, int[] prime)
        {
            for (int index1 = 2; index1 * index1 <= userNumber; index1++)
                {
                    if (primeBoolean[index1] == true)
                        {
                            for (int index2 = 2; index1 * index2 <= userNumber; index2++)
                                {
                                    primeBoolean[index1 * index2] = false;
                                }
                            System.out.println(sequenceToString(prime, userNumber, primeBoolean));
                        }
                }
        }

        public static boolean[] sieve(int userNumber, boolean[] primeBoolean, int[] prime)
        {
            crossOutHigherMultiples(userNumber, primeBoolean, prime);
            return primeBoolean;
        }

        public static String sequenceToString(int[] prime, int userNumber, boolean[] primeBoolean)
        {
            String arrayToString = "";
            for (int index1 = 2; index1 <= userNumber; index1++)
                {
                    if (primeBoolean[index1] == true)
                        {
                            if (index1 == userNumber)
                                {
                                    arrayToString = arrayToString + prime[index1] + "";
                                }
                            else
                                    arrayToString = arrayToString + prime[index1] + ",";
                        }
                    else if (primeBoolean[index1] == false)
                        {
                            if (index1 == userNumber)
                                {
                                    arrayToString = arrayToString + "[" + prime[index1] + "]";
                                }
                            else
                                    arrayToString = arrayToString + "[" + prime[index1] + "],";
                        }
                }

            return arrayToString;
        }

        public static String nonCrossedOutSubseqToString(boolean[] primeBoolean, int userNumber)
        {
            String nonCrossedOut = "";
            for (int index1 = 2; index1 <= userNumber; index1++)
                {
                    if (primeBoolean[index1] == true)
                        {
                            if (index1 == 2)
                                {
                                    nonCrossedOut = "" + index1;
                                }
                            else
                                    nonCrossedOut = nonCrossedOut + "," + index1;
                        }
                }
            return nonCrossedOut;
        }

        public static void main(String[] args)
        {

            boolean quit = false;
            while (!quit)
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a number >2");
                int userNumber = input.nextInt();
                if (userNumber <= 2)
                    {
                        System.out.println("Please enter a valid number");
                    }
                else
                    {
                        int[] prime = createSequence(userNumber);
                        for (int index1 = 2; index1 <= userNumber; index1++)
                            {
                                if (index1 == userNumber)
                                    {
                                        System.out.println(prime[index1]);
                                    }
                                else
                                        System.out.print(prime[index1] + ",");
                            }

                        boolean[] primeBoolean = new boolean[userNumber + 1];
                        for (int index2 = 2; index2 <= userNumber; index2++)
                            {
                                primeBoolean[index2] = true;
                            }

                        primeBoolean = sieve(userNumber, primeBoolean, prime);
                        System.out.println(nonCrossedOutSubseqToString(primeBoolean, userNumber));
                    }

            }
        }
    }