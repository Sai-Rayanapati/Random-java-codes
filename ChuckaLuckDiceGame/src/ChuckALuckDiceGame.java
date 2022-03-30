/* SELF ASSESSMENT

1. ResolveBet

I have correctly defined ResolveBet which takes the bet type (String) and the Wallet object, and a void return type [Mark out of 7: 7].
Comment:Yes,I have correctly defined ResolveBet which takes the bet type (String) and the Wallet object, and a void return type
My program presents the amount of cash in the wallet and asks the user how much he/she would like to bet [Mark out of 8:8 ].
Comment:Yes, my program presents the amount of cash in the wallet and asks the user how much he/she would like to bet
My program ensures the bet amount is not greater than the cash in the wallet [Mark out of 5:5 ].
Comment:Yes, my program ensures the bet amount is not greater than the cash in the wallet
My program creates three Dice objects, rolls them and creates a total variable with a summation of the roll values returned [Mark out of 15:15 ].
Comment:Yes, my program creates three Dice objects, rolls them and creates a total variable with a summation of the roll values returned
My program determines the winnings by comparing the bet type with the total and comparing the bet type with the dice faces for the triple bet [Mark out of 20:20 ].
Comment:Yes, my program determines the winnings by comparing the bet type with the total and comparing the bet type with the dice faces for the triple bet
My program outputs the results (win or loss) and adds the winnings to the wallet if user wins or removes the bet amount from the wallet if the user loses [Mark out of 10:10 ].
Comment:Yes, my program outputs the results (win or loss) and adds the winnings to the wallet if user wins or removes the bet amount from the wallet if the user loses

2. Main

I ask the user for the amount of cash he/she has, create a Wallet object and put this cash into it [Mark out of 15:15 ]
Comment:Yes, I ask the user for the amount of cash he/she has, create a Wallet object and put this cash into it
My program loops continuously until the user either enters quit or the cash in the wallet is 0 [Mark out of 5:5 ]
Comment:Yes, My program loops continuously until the user either enters quit or the cash in the wallet is 0
I ask the user to enter any of the four bet types or quit [Mark out of 5:5 ].
Comment:Yes,I ask the user to enter any of the four bet types or quit
My program calls resolveBet for each bet type entered [Mark out of 5:5 ].
Comment:Yes, My program calls resolveBet for each bet type entered
At the end of the game my program presents a summary message regarding winnings and losses [Mark out of 5:5 ]
Comment:Yes, At the end of the game my program presents a summary message regarding winnings and losses

 Total Mark out of 100 (Add all the previous marks):100
*/


import java.util.Scanner;

public class ChuckALuckDiceGame
{
    public static int lose,win;
    public static void main(String[] args)
    {
        double cash=0;
        Scanner input = new Scanner(System.in);
        boolean exit=false;
        while(!exit)
        {
            System.out.println("Enter the amount you want to add to your wallet");
            Scanner input1 = new Scanner(System.in);
            if (input1.hasNextDouble())
            {
                cash = input1.nextDouble();
                exit=true;
            }
            else if (input1.hasNext())
            {
                System.out.println("Invalid Input");
            }
        }
        Wallet wallet = new Wallet();
        wallet.put(cash);
        boolean quit = false;
        while (!quit)
        {
            String bet;
            System.out.println("Enter the type of bet('Triple','Field','High','Low') you would like to place or enter 'quit'");
            if (input.hasNext("Triple")||input.hasNext("Field")||input.hasNext("High")||input.hasNext("Low")||
                    input.hasNext("triple")||input.hasNext("field")||input.hasNext("high")||input.hasNext("low"))
            {
                bet = input.next();
                bet=bet.toLowerCase();
                ResolveBet(bet, wallet);
                System.out.println(wallet.toString());
                if(wallet.check()==0.0)
                {
                    System.out.println("Number wins: "+win+" Number of losses: "+lose);
                    quit=true;
                }
            }
            else if (input.hasNext("quit"))
            {
                System.out.println("Number wins: "+win+" Number of losses: "+lose);
                quit = true;
            }
            else
            {
                System.out.println("Incorrect input. Please Try Again");
                bet=input.next();
            }
        }
    }

    public static void ResolveBet(String bet, Wallet wallet)
    {
        Dice d1=new Dice();
        Dice d2=new Dice();
        Dice d3=new Dice();
        boolean ifMoney;
        int dice1,dice2,dice3;
        System.out.println("The Amount of Cash Present in Wallet are: ");
        System.out.println(wallet.check());
        System.out.println("Enter the bet amount");
        Scanner betInput=new Scanner(System.in);
        double betAmount=betInput.nextDouble();
        ifMoney=wallet.get(betAmount);
        if(ifMoney==false)
        {
            System.out.println("Insufficient Money");
        }
        else
        {
            if(bet.equalsIgnoreCase("Triple"))
            {
                dice1=d1.roll();
                dice2=d2.roll();
                dice3=d3.roll();
                System.out.println(dice1);
                System.out.println(dice2);
                System.out.println(dice3);
                if(dice1!=1&&dice1!=6&&dice2!=1&&dice2!=6&&dice3!=1&&dice3!=6&&dice1==dice2&&dice2==dice3&&dice1==dice3)
                {
                    System.out.println("You Win");
                    win++;
                    wallet.put(31*betAmount);
                }
                else
                {
                    System.out.println("You Lose");
                    lose++;
                }
            }
            else if(bet.equalsIgnoreCase("Field"))
            {
                dice1=d1.roll();
                dice2=d2.roll();
                dice3=d3.roll();
                System.out.println(dice1);
                System.out.println(dice2);
                System.out.println(dice3);
                if(dice1+dice2+dice3<8|| dice1+dice2+dice3>12)
                {
                    System.out.println("You Win");
                    win++;
                    wallet.put(2*betAmount);
                }
                else
                {
                    System.out.println("You Lose");
                    lose++;
                }
            }
            else if(bet.equalsIgnoreCase("High"))
            {
                dice1=d1.roll();
                dice2=d2.roll();
                dice3=d3.roll();
                System.out.println(dice1);
                System.out.println(dice2);
                System.out.println(dice3);
                if(dice1+dice2+dice3>10)
                {
                    if(dice1==dice2&&dice2==dice3&&dice3==dice1)
                    {
                        if(dice1==4||dice1==5||dice1==6)
                        {
                            System.out.println("You Lose");
                            lose++;
                        }
                        else
                        {
                            System.out.println("You Win");
                            win++;
                            wallet.put(2*betAmount);
                        }
                    }
                    else
                    {
                        System.out.println("You Win");
                        win++;
                        wallet.put(2*betAmount);
                    }
                }
                else
                {
                    System.out.println("You Lose");
                    lose++;
                }
            }
            else if(bet.equalsIgnoreCase("Low"))
            {
                dice1=d1.roll();
                dice2=d2.roll();
                dice3=d3.roll();
                System.out.println(dice1);
                System.out.println(dice2);
                System.out.println(dice3);
                if(dice1+dice2+dice3<11)
                {
                    if(dice1==dice2&&dice2==dice3&&dice3==dice1)
                    {
                        if(dice1==1||dice1==2||dice1==3)
                        {
                            System.out.println("You Lose");
                            lose++;
                        }
                        else
                            {
                                System.out.println("You Win");
                                win++;
                                wallet.put(2*betAmount);
                            }
                    }
                    else
                        {
                            System.out.println("You Win");
                            win++;
                            wallet.put(2*betAmount);
                        }
                }
                else
                    {
                        System.out.println("You Lose");
                        lose++;
                    }
            }
        }
    }
}
