import java.util.Scanner;

public class E_Test 
{
	 public static double average(int[] values)
     {
         double sum = 0;
         double averageValue = 0;
         if(values!=null)
         {
             for (int index = 1; index < values.length; index++)
             {
                 sum = sum + values[index];
                 averageValue = (sum) / ((double) values.length - 1);
             }
         }
         else
             averageValue=0;

         return averageValue;

     }

     public static boolean increasingValues(int currentValue, int previousValue)
     {
             if(previousValue<currentValue)
             {
                 return true;
             }
             else
                 return false;
     }

     public static void main(String[] args)
     {
         boolean quit= false;
         while (!quit)
         {
             Scanner input = new Scanner(System.in);

             System.out.print("Enter an integer to add to the array (or 'quit' to finish):");
             int[] values = new int[1];
             for(int index=0; index<values.length;index++)
             {
                 System.out.println(((index==0)?"": "Enter an integer to add to the array (or 'quit' to finish):"));
                 if (input.hasNextInt()) 
                 {
                     int userInput = input.nextInt();

                     int[] tempArray = new int[values.length + 1];
                     System.arraycopy(values, 0, tempArray, 0, values.length);
                     tempArray[tempArray.length - 1] = userInput;
                     values = tempArray;

                     System.out.print("The average value is " + average(values)+ ", and ");

                     int currentValue=userInput;
                     int previousValue=values[(index==0)? 0:values[index-1]];
                     
                    if(increasingValues(currentValue,previousValue)==true)
                     {
                         System.out.println("all values are increasing.");
                     }
                     else
                         System.out.println("not all values are increasing.");

                 }
                 else if (input.hasNext("quit"))
                 {
                     quit = true;
                 }
                 else
                     System.out.println("Enter a valid number or 'quit'");

             }
         }
     }
}
