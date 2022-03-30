
import java.util.Scanner;


public class ChuckALuck
{
	public static void main(String args[])
	{
		System.out.println("Enter the amount you want to add to your wallet");
		Scanner input=new Scanner(System.in);
		double cash=input.nextDouble();
		// create an object of wallet
		Wallet w= new Wallet();
		// call the member function of wallet to put in the cash
		w.put(cash);
		boolean quit=false;

		do
		{
			String bet;

			System.out.println("Enter the type of bet you would like to place or enter quit");
			if(input.hasNextLine())
			{
				bet=input.next();
				ResolveBet(bet,w);
				System.out.println( w.toString());
				
			}
			else if(input.hasNext("quit"))
			{
				quit=true;
			}
			else
			{
				System.out.println("Incorrect input. Please Try Again");
			}
			
			
		}while(!quit);
	}

	public static void ResolveBet(String bet, Wallet w)
	{
		//Wallet w=new Wallet();
		Dice d1=new Dice();
		Dice d2=new Dice();
		Dice d3=new Dice();
		int dice1,dice2,dice3;
		double updatedAmount;
		System.out.println("The Amount of Cash Present in Wallet are: ");
		System.out.println(w.check());
		System.out.println("Enter the bet amount");
		Scanner input=new Scanner(System.in);
		double betAmount=input.nextDouble();
		boolean ifMoney=false;
		ifMoney=w.get(betAmount);
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

					w.put(31*betAmount);
				}

				else
				{
					System.out.println("You Lose");

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
					w.put(2*betAmount);
				}
				else
				{
					System.out.println("You Lose");
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
						}
						else
						{
							System.out.println("You Win");
							w.put(2*betAmount);
						}
					}
					else
					{
						System.out.println("You Win");
						w.put(2*betAmount);
					}
				}
				else
				{
					System.out.println("You Lose");
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
						}
						else
						{
							System.out.println("You Win");
							w.put(2*betAmount);
						}
					}
					else
					{
						System.out.println("You Win");
						w.put(2*betAmount);
					}
				}
				else
				{
					System.out.println("You Lose");
				}

			}

		}

	}
}
