import java.text.DecimalFormat;
import java.util.Scanner;

public class TestResizableCircle
{
    public static DecimalFormat decimalFormat=new DecimalFormat("0.00");
    public static void main(String args[])
    {
        boolean quit=false;
        while (!quit)
        {
            System.out.println("Enter the radius of the circle or 'quit'");
            Scanner input= new Scanner(System.in);
            if(input.hasNextDouble())
            {
                double radius = input.nextDouble();
                ResizableCircle testResizableCircle = new ResizableCircle(radius);
                int percentReduction=0;
                boolean end=false;
                while (!end)
                {
                    System.out.println("Enter the percentage of reduction of radius");
                    Scanner input1 = new Scanner(System.in);
                    if(input1.hasNextDouble())
                    {
                        percentReduction = input1.nextInt();
                        end=true;
                    }
                    else
                        System.out.println("Invalid entry!!");
                }
                testResizableCircle.resize(percentReduction);
                System.out.println("New radius is "+testResizableCircle.radius);
                System.out.print("Perimeter of the resized circle is ");
                System.out.println(decimalFormat.format(testResizableCircle.getPerimeter()));
                System.out.print("Area of the resized circle is ");
                System.out.println(decimalFormat.format(testResizableCircle.getArea())+"\n");
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

