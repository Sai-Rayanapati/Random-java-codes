import java.text.DecimalFormat;
import java.util.Scanner;

public class TestCircle
{
    public static DecimalFormat decimalFormat = new DecimalFormat("0.00");
    public static void main(String[] args)
    {
        boolean quit=false;
        while (!quit)
        {
            System.out.println("Enter the radius of the Circle or 'quit'");
            Scanner input = new Scanner(System.in);
            if(input.hasNextDouble())
            {
                double radius = input.nextDouble();
                Circle testCircle = new Circle(radius);
                System.out.print("Perimeter of the circle is ");
                System.out.println(decimalFormat.format(testCircle.getPerimeter()));
                System.out.print("Area of the circle is ");
                System.out.println(decimalFormat.format(testCircle.getArea())+"\n");
            }
            else
            {
                String stringInput=input.next();
                if(stringInput.equalsIgnoreCase("quit"))
                {
                    quit = true;
                }
                else
                    System.out.println("Invalid entry!!");
            }
        }
    }
}
