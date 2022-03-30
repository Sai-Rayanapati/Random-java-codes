import java.util.Scanner;

public class Frequencies
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {

            int[] numbers = new int[10];
            System.out.println("Enter a number>");
            int numberEntered = input.nextInt();
            countDigitFrequencies(numberEntered, numbers);
            printDigitFrequencies(numbers);
        }

    }
    public static void countDigitFrequencies( int number, int[ ] frequencies )
    {
        int remainingNUmber=number;
        while (remainingNUmber>0)
        {
            int digit = remainingNUmber % 10;
            remainingNUmber=remainingNUmber/10;
            frequencies[digit]++;
        }

    }
    public static void printDigitFrequencies( int[ ] frequencies )
    {
        for(int index=0;index<frequencies.length;index++)
        {
            if(frequencies[index]>0)
            System.out.println(index+"("+frequencies[index]+")");
        }
    }
}
