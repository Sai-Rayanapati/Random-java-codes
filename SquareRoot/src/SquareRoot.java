import java.util.Scanner;

public class SquareRoot 
{
    

    public static void main(String[] args) 
    {
       
        boolean quit = false;

        while(!quit) 
        {
        	 Scanner input = new Scanner(System.in);
        	 System.out.print("Enter the coefficients of your second order polynomial separated by spaces (or enter quit):");
            
        	if (input.hasNext("jsnsj"))
            {
                quit = true;
            } 
            
            else if(input.hasNextDouble())
            {
                double coeff1 = input.nextDouble();
                double coeff2 = input.nextDouble();
                double coeff3 = input.nextDouble();
                double determinant =(coeff2 * coeff2 - 4.0D * coeff1 * coeff3);
                double squareRoot= Math.sqrt(determinant);
    
                if (coeff1 == 0.0D) 
                {
                    System.out.println("It is not a second order equation. Please enter a valid equation.");
                    
                }
                
                else if (determinant < 0.0D) 
                {
                    System.out.println("It has imaginary roots");
                    
                }
                
                else 
                {
                	double root1 = (-coeff2 + squareRoot) / 2.0D * coeff1;
                    double root2 = (-coeff2 - squareRoot) / 2.0D * coeff1;
                    System.out.println("The roots of the equations are x=" + root1 + " and x=" + root2);                    
                }
            }
            
            else
            {
                System.out.println("Invalid input");
            }
         
        }
    }
}
