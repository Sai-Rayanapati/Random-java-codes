/* SELF ASSESSMENT

 1. Did I use easy-to-understand meaningful, properly formatted, variable names and CONSTANTS?
        Mark out of 10:10 
        Comment:Yes, I used easy-to-understand meaningful, properly formatted, variable names and CONSTANTS
 2. Did I indent the code appropriately?
        Mark out of 5:5 
        Comment:Yes, I indented the code appropriately.  
 3. Did I implement the mainline correctly with a loop which continues using the user says "no" ?
       Mark out of 10:10 
        Comment:Yes, I implemented the mainline correctly with a loop which continues using the user says "no"  
 4. Did I obtain the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats ?
       Mark out of 10:10 
        Comment:Yes, I obtained the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats   
 5. Did I implement the readDoubleFromUser function correctly and in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20:20 
        Comment:Yes, I implemented the readDoubleFromUser function correctly and in a manner that can be easily understood   
 6. Did I implement the calculateMonthlyRepayment function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20:20 
        Comment:Yes, I implemented the calculateMonthlyRepayment function correctly in a manner that can be easily understood   
 7. Did I implement the calculateMonthsToRepayMortgage function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20:20 
        Comment:Yes, I implement the calculateMonthsToRepayMortgage function correctly in a manner that can be easily understood  
 8. How well did I complete this self-assessment?
        Mark out of 5:5 
        Comment:I completed the self-assignment honestly.
 Total Mark out of 100 (Add all the previous marks):100
*/ 
import java.util.Scanner;
public class MortgageCalculator 
{
	public static final int ASSUMED_DURATION=20;

    public static double readDoubleFromUser(String question)
    {
        boolean quit=false;
        double userInput=0;
        while(!quit)
        {
            Scanner input= new Scanner(System.in);
            System.out.print(question);
            if (input.hasNextDouble())
            {
                userInput = input.nextDouble();
                quit=true;
            }
            else
                {
                    quit=false;
                    System.out.println("Invalid input! please try again.");
                }
        }
        return userInput;
    }

   public static double calculateMonthlyRepayment(double principalAmount,double annualInterestRate, int DURATION)
    {
        double monthlyRepayment=(principalAmount)*(annualInterestRate/12/100)/((1 - Math.pow(1+(annualInterestRate/12/100),(-DURATION*12))));
        monthlyRepayment=Math.round(monthlyRepayment*100)/100.0;
        return monthlyRepayment;
    }

    public static int calculateMonthsToRepayMortgage(double mortgageAmount,double affordableMonthlyRepayment,double interestRate)
    {
        int monthCount=1;
        while(mortgageAmount>affordableMonthlyRepayment)
        {
            mortgageAmount=mortgageAmount+mortgageAmount*(interestRate/12/100);
            mortgageAmount= mortgageAmount-affordableMonthlyRepayment;
            monthCount++;
        }
        return monthCount;
    }
    public static void main(String[] args)
    {
        boolean quit=false;
        while(!quit)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the mortgage calculator");
            String question1="Please enter the mortgage amount:";
            double mortgageAmount = readDoubleFromUser(question1);
            String question2="Please enter the annual interest rate (APR):";
            double annualInterestRate = readDoubleFromUser(question2);
            System.out.println("Assuming a " + ASSUMED_DURATION + " year term, the monthly repayments would be " + calculateMonthlyRepayment(mortgageAmount, annualInterestRate, ASSUMED_DURATION));
            String question3="How much can you afford to pay per month?";
            double affordableMonthlyRepayment = readDoubleFromUser(question3);
            int numberOfMonths = calculateMonthsToRepayMortgage(mortgageAmount, affordableMonthlyRepayment, annualInterestRate);
            System.out.println("If you pay " + affordableMonthlyRepayment + " per month your mortgage would be paid off in " + numberOfMonths / 12 +
                    " years and " + numberOfMonths % 12 + " months");
            System.out.print("Would you like to use the mortgage calculator again (yes/no)?");
            if(input.hasNext("yes"))
            {
                quit=false;
            }
            else if(input.hasNext("no"))
            {
                quit=true;
            }
        }
    }

}
