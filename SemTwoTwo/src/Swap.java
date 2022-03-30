import java.util.Scanner;

public class Swap {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number 1");
        int x=input.nextInt();

        System.out.println("Enter number 2");
        int y=input.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping first number is "+x+" second is "+y);


    }
}
