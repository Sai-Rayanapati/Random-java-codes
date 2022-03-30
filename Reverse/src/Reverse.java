import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        int reversedNumber = 0;
        int remainingNumber = number;
        while (remainingNumber > 0)
        {
            reversedNumber = reversedNumber * 10+remainingNumber % 10;
            remainingNumber = remainingNumber / 10;
        }

        System.out.println(reversedNumber);
    }
    }

