/* SELF ASSESSMENT
   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code? 
       Mark out of 10:10
       Comment:Yes I used meaningful variables and CONSTANTS within the code 
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)?
       Mark out of 5:5
       Comment:I did format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)
   3. Did I generate the computer's choice in each game correctly using a Random number generator?
       Mark out of 10:10
       Comment:Yes I did generate the computer's choice in each game correctly using a Random number generator
   4. Did I input the user's choice in each game correctly?
       Mark out of 10:10
       Comment:Yes I did input the user's choice in each game correctly
   5. Did I correctly compare the choices and update the score appropriately?
       Mark out of 20:20
       Comment:Yes I did correctly compare the choices and update the score appropriately
   6. Did I inform the user of who won each game (and why) correctly?
       Mark out of 10:10
       Comment:Yes I did inform the user of who won each game (and why) correctly
   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop.
       Mark out of 20: 20
       Comment:Yes I did use an appropriate for loop to allow the player to play 5 games
   8. Did I output the final scores correctly after the 5 games were played. 
       Mark out of 10:10 
       Comment:Yes I did output the final scores correctly after the 5 games were played
   9. How well did I complete this self-assessment?
       Mark out of 5:5
       Comment:I completed this self-assessment honestly
   Total Mark out of 100 (Add all the previous marks):100
*/

import java.util.*;

public class RockPaperScissors {

    public static int MAX_NUMBER=3;
    public static int computerScore=0;
    public static int userScore=0;
    
	public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        for(int count=1;count<=5;count++)
        {
            Random number= new Random();
            int computerChosenNumber = number.nextInt(MAX_NUMBER+1);

            String rockPaperScissor;

            if(computerChosenNumber==1)
            {
                rockPaperScissor= "Rock";	//The computer chose rock
            }
            else if(computerChosenNumber==2)
            {
                rockPaperScissor="Paper";	//The computer chose paper
            }
            else
            {
                rockPaperScissor="Scissors";	//The computer chose scissors 
            }

            System.out.print("Enter 1(for Rock) or 2(for Paper) or 3(for Scissors)");
            int userChosenNumber= input.nextInt();
          
            if(userChosenNumber==1)		//The user chose 1(rock)
            {
                if(computerChosenNumber==1) //Both computer and user chose rock
                {
                    System.out.println("The round was a draw as I chose "+rockPaperScissor+" too");
                }
                else if(computerChosenNumber==2) //The user chose rock and the computer chose paper
                {
                    System.out.println("You lost this round as I chose "+rockPaperScissor);
                    computerScore++;		//computerScore=computerScore+1
                }
                else			//The user chose rock and the computer chose scissors
                {
                    System.out.println("You won this round as I chose "+rockPaperScissor);
                    userScore++;	//userScore=userScore+1
                }
            }

            else if(userChosenNumber==2)		//The user chose 2(paper)
            {
                if(computerChosenNumber==1)		//The user chose paper and the computer chose rock
                {
                    System.out.println("You won this round as I chose "+rockPaperScissor);
                    userScore++;	//userScore=userScore+1
                }
                else if(computerChosenNumber==2)	//Both computer and user chose paper
                {
                    System.out.println("The round was a draw as I chose "+rockPaperScissor+" too" );
                }
                else					//The user chose paper and the computer chose scissors
                {
                    System.out.println("You lost this round as I chose "+rockPaperScissor );
                    computerScore++;	//computerScore=computerScore+1
                }
            }
            else if (userChosenNumber==3)		//The user chose 3(scissors)
            {
                if(computerChosenNumber==1)	//The user chose scissors and the computer chose rock
                {
                    System.out.println("You lost this round as I chose "+rockPaperScissor );
                    computerScore++;	//computerScore=computerScore+1
                }
                else if(computerChosenNumber==2)	//The user chose scissors and the computer chose paper
                {
                    System.out.println("You won this round as I chose "+rockPaperScissor);
                    userScore++;	//userScore=userScore+1
                }
                else						//Both computer and user chose scissors
                {
                    System.out.println("The round was a draw as I chose "+rockPaperScissor+" too"  );
                }
            }
            else						//If the user chose a number which is not 1,2 or 3
            {
            	System.out.println("Enter a valid number!!!!");
            	count--;			
            }
        }
        input.close();


        System.out.println("The final score was Computer: "+computerScore+" User: "+userScore);


    }

	

}
