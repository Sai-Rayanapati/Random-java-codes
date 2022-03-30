/*  SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10: 10  
       Comment:Yes
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5: 5 
       Comment:Yes
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5:5  
       Comment:Yes
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:  10
       Comment:Yes
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10:10  
       Comment:Yes
   6. Did I indent the code appropriately?
       Mark out of 10:10  
       Comment:yes
   7. Did I read the input correctly from the user using appropriate question(s)?
       Mark out of 10:10  
       Comment:Yes
   8. Did I compute the disposable income correctly?
       Mark out of 10:10  
       Comment:Yes
   9. Did I compute the disposable income percentage correctly?
       Mark out of 10:  10
       Comment:Yes
   10. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10:10  
       Comment:Yes
   11. How well did I complete this self-assessment?
       Mark out of 10:10  
       Comment:Yes
   Total Mark out of 100 (Add all the previous marks):  
*/
import java.util.Scanner;
import java.lang.Math;

/*
 *Write a Java program which computes the monthly disposable income of the user
 * and also computes what percentage of their after tax income is disposable.
 * All income is taxed at 35%.
 * Disposable income = After tax income - Accommodation costs - Travel costs - Food costs
 */


public class DisposableIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("How much are you paid a month before tax? ");
        double incomeBeforetax= sc.nextDouble();
        
        double TAXRATE=(0.35);

        double incomeAftertax= (incomeBeforetax)-(incomeBeforetax*TAXRATE);
       
        System.out.print("How much do you pay in accommodationCosts a month? ");
        double accommodationCosts=sc.nextDouble();

        System.out.print("How much does your commute cost a month? ");
        double commuteCosts=sc.nextDouble();

        System.out.print("How much do you spend on food per month? ");
        double foodCost=sc.nextDouble();
        
        sc.close();

        double disposableIncome= (incomeAftertax-accommodationCosts-commuteCosts-foodCost);
        //Disposable income = After tax income - Accommodation costs - Travel costs - Food costs

        double disposableIncomePercentage= ((disposableIncome)/(incomeBeforetax))*100;


        System.out.print("Your disposable income is €"+ disposableIncome+
                " which is "+Math.round(disposableIncomePercentage)+"% of your salary");

    }
	
	

}
