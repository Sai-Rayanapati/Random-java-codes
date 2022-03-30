import java.util.Scanner;

public class ForFun 
{
    public static void main(String[] args)
    {
        boolean notquit=true;
        while(notquit)
        {
            Scanner input=new Scanner(System.in);
            int userinput = input.nextInt();
            if(input.hasNext("exit"))
            {
                notquit=false;
            }
            else
            {
                System.out.println("For Fun!!!!!");
            }
        }
    }
}
