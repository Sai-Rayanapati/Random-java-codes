        import java.util.Scanner;

        public class SieveofEratosthenes
        {
            public static boolean[] createSequence(int userNumber)
            {
                boolean prime[] = new boolean[userNumber + 1];

                for (int count = 2; count < userNumber; count++)
                {
                    prime[count] = true;
                }
                return prime;
            }

            public static void crossOutHigherMultiples(int userNumber, boolean[] prime)
            {
                for (int i = 2; i*i<=userNumber; i++)
                {
                    if (prime[i]==true)
                    {
                        for (int j = 2; i*j <= userNumber; j++)
                        {
                            prime[i*j] = false;
                        }
                        System.out.println(sequenceToString(prime,userNumber));
                    }
                }
            }

            public static boolean[] sieve(int userNumber,boolean[] prime)
            {
                crossOutHigherMultiples(userNumber,prime);
                return prime;
            }

            public static String sequenceToString(boolean[] prime,int userNumber)
            {
                String arrayToString="";
                for(int i=2; i<=userNumber;i++)
                {
                    if (prime[i] == true) {
                            arrayToString = arrayToString + i;
                            if(i==userNumber)
                            {
                                arrayToString=arrayToString;
                            }
                            else
                                arrayToString=arrayToString+",";
                            }
                            if (prime[i] == false) {
                            arrayToString = arrayToString + "[" + i;
                                if(i==userNumber)
                                {
                                    arrayToString=arrayToString+"]";
                                }
                                else
                                    arrayToString=arrayToString+"],";
                            }

                }
                return arrayToString;
            }

            public static String nonCrossedOutSubseqToString(boolean[] prime,int userNumber)
            {
                String nonCrossedOut="";
                for(int i=2;i<=userNumber;i++)
                {
                    if (prime[i] == true)
                    {
                        nonCrossedOut = nonCrossedOut +i+",";
                    }

                }

                return nonCrossedOut;
            }


            public static void main(String[] args)
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a number >2");
                int userNumber = input.nextInt();
                boolean[] prime=createSequence(userNumber);

                prime=sieve(userNumber,prime);

                System.out.println(nonCrossedOutSubseqToString(prime,userNumber));


            }
        }


