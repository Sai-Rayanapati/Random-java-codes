package com.company;
import java.util.Scanner;

/*
 *Write a Java program which computes the monthly disposable income of the user
 * and also computes what percentage of their after tax income is disposable.
 * All income is taxed at 35%.
 * Disposable income = After tax income - Accommodation costs - Travel costs - Food costs
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.print("How much are you paid a month before tax? ");
        double income_before_tax= sc.nextDouble();

        double income_after_tax= (income_before_tax)-(income_before_tax*35/100);
        System.out.println("This is your monthly income after tax "+ income_after_tax);

        System.out.print("How much do you pay in Accommodation_costs/mortgage a month? ");
        double Accommodation_costs=sc.nextDouble();

        System.out.print("How much does your commute cost a month? ");
        double commute_cost=sc.nextDouble();

        System.out.print("How much do you spend on food per month? ");
        double food_cost=sc.nextDouble();

        double disposable_income= (income_after_tax-Accommodation_costs-commute_cost-food_cost);
        //Disposable income = After tax income - Accommodation costs - Travel costs - Food costs

        double disposable_income_percentage= ((disposable_income)/(income_before_tax))*100;


        System.out.print("Your disposable income is €"+ disposable_income+
                " which is "+disposable_income_percentage+"% of your salary");

    }
}
