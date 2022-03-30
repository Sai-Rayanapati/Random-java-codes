package com.company;
/* SELF ASSESSMENT
   1. Did I use easy-to-understand meaningful variable and CONSTANT names?
       Mark out of 10:10
       Comment:Yes
   2. Did I format the variable and CONSTANT names properly (in lowerCamelCase and UPPERCASE_WITH_UNDERSCORES)?
       Mark out of 10:10
       Comment: Yes
   3. Did I indent the code appropriately?
       Mark out of 10:10
       Comment: Yes
   4. Did I read the input correctly from the user using appropriate questions?
       Mark out of 15:15
       Comment: Yes
   5. Did I computer the disposable income and disposable income percentage correctly, and output it in the correct format?
       Mark out of 15:15
       Comment: Yes
  6. Did I use an appropriate series of if statements to generate the income analysis to the user?
       Mark out of 25: 25
       Comment: Yes
   7. Did I provide the correct output for each possibility in an easy to read format?
       Mark out of 10:10
       Comment: Yes
   8. How well did I complete this self-assessment?
       Mark out of 5:5
       Comment: I completed the self-assignment honestly.
   Total Mark out of 100 (Add all the previous marks): 100
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);


                System.out.print("How much are you paid a month before tax? ");
                double incomeBeforetax= sc.nextDouble();

                double TAXRATE= 0.35;

                double incomeAftertax= (incomeBeforetax)-(incomeBeforetax*TAXRATE);

                System.out.print("How much do you pay in accommodationCosts a month? ");
                double accommodationCosts=sc.nextDouble();

                System.out.print("How much does your commute cost a month? ");
                double commuteCosts=sc.nextDouble();

                System.out.print("How much do you spend on food per month? ");
                double foodCost=sc.nextDouble();


                double disposableIncome= (incomeAftertax-accommodationCosts-commuteCosts-foodCost);
                //Disposable income = After tax income - Accommodation costs - Travel costs - Food costs

                double disposableIncomePercentage= ((disposableIncome)/(incomeBeforetax))*100;


                System.out.println("Your disposable income is €"+ disposableIncome+
                        " which is "+Math.round(disposableIncomePercentage)+"% of your salary");

                int AVERAGEDISPOSABLEINCOME= 500;

                double MUCHMORETHANAVERAGEDISPOSABLEINCOME=(AVERAGEDISPOSABLEINCOME+
                        (AVERAGEDISPOSABLEINCOME*50/100));
                // The value of this constant is 750 euros.

                double MUCHLESSTHANAVERAGEDISPOSABLEINCOME=(AVERAGEDISPOSABLEINCOME-
                        (AVERAGEDISPOSABLEINCOME*50/100));
                // The value of this constant is 250 euros.

                if(disposableIncome<=0)                     //Disposable Income = 0 euros
                {
                    System.out.println("You don't have any Disposable Income per month");
                }

                else if(disposableIncome==AVERAGEDISPOSABLEINCOME)      //Disposable Income = 500 euros
                {
                    System.out.println("You have exactly the average Disposable Income per month");
                }

                else if(disposableIncome>AVERAGEDISPOSABLEINCOME)
                {
                    if (disposableIncome >= MUCHMORETHANAVERAGEDISPOSABLEINCOME)//Disposable Income >= 750 euros
                    {
                        System.out.println("You have much more than the average disposable income per month");
                    }
                    else        //Disposable Income > 500 and < 750 euros
                    {
                        System.out.println("You have more than the average disposable income per month");
                    }
                }

                else if (disposableIncome<AVERAGEDISPOSABLEINCOME)
                {
                    if(disposableIncome<=MUCHLESSTHANAVERAGEDISPOSABLEINCOME) //Disposable Income <= 250 euros
                    {
                        System.out.println("You have much less than the average disposable income per month");
                    }
                    else           //Disposable Income > 250 and < 500 euros
                    {
                        System.out.println("You have less than the average disposable income per month");
                    }
                }


            }



        }


