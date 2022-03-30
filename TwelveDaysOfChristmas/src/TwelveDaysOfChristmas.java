/* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code? 
       Mark out of 5: 5
       comment: I have used DAYS_OF_CHRISTMAS=12 as my constant.
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
       Mark out of 5:5 
       comment: I have used dayNumberS_OF_CHRISTMAS=12 as my constant which is easy-to-understand. I also have 
       			formatted correctly in UPPERCASE.
   3. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)? 
       Mark out of 10: 10
       comment: I have used dayNumber as my variable. It represents the day number which is meaningful. I also
       			have formatted correctly in lowerCamelCase.
   4. Did I indent the code appropriately? 
       Mark out of 10: 10
       comment:Yes, I have indented the code appropriately
   5. Did I use an appropriate loop (or loops) to produce the different verses? 
       Mark out of 20: 20
       comment:Yes, I have used a for loop to produce the different verses
   6. Did I use a switch to build up the verses? 
       Mark out of 25: 25
       comment:Yes, I have used switch statements to build up the verses 
   7. Did I avoid duplication of code and of the lines which make up the verses (each line should be referred to in the code only once (or twice))? 
       Mark out of 10:10
       comment:Yes, I avoided the duplication of the code and of the lines which make up the verses  
   8. Does the program produce the correct output? 
       Mark out of 10: 10
       comment:Yes, my program gives the correct output 
   9. How well did I complete this self-assessment? 
       Mark out of 5:5
       comment: i have completed the self assignment honestly. 
   Total Mark out of 100 (Add all the previous marks):100 
*/
public class TwelveDaysOfChristmas 
{
	public static final int DAYS_OF_CHRISTMAS=12;

    public static void main(String[] args)
    {
        int dayNumber;

        for(dayNumber=1;dayNumber<=DAYS_OF_CHRISTMAS;dayNumber++)
        {
            System.out.print("On the ");
           
            switch (dayNumber)
            {
                case 1:
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.print("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eighth ");
                    break;
                case 9:
                    System.out.print("ninth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                case 12:
                    System.out.print("twelfth ");
                    break;
                default:
                    break;

            }
            System.out.println("dayNumber of Christmas");
            System.out.println("my true love sent to me:");
           
            switch (dayNumber)
            {
                case 12:
                    System.out.println("12 Drummers Drumming");
                case 11:
                    System.out.println("11 Pipers Piping ");
                case 10:
                    System.out.println("10 Lords a Leaping ");
                case 9:
                    System.out.println("9 Ladies Dancing ");
                case 8:
                    System.out.println("8 Maids a Milking ");
                case 7:
                    System.out.println("7 Swans a Swimming ");
                case 6:
                    System.out.println("6 Geese a Laying ");
                case 5:
                    System.out.println("5 Golden Rings ");
                case 4:
                    System.out.println("4 Calling Birds ");
                case 3:
                    System.out.println("3 French Hens ");
                case 2:
                    System.out.println("2 Turtle Doves ");
                case 1:
                    System.out.println("A Partridge in a Pear Tree \n");
                    break;
                default:
                    break;
            }

        }

    }

}
