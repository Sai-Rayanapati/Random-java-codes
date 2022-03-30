import java.util.Random;
import java.util.Scanner;

public class HiLo
{
    public static final int OFFSET_NUMBER = 2;
    public static final int CORRECT_ANSWERS_TO_WIN = 4;
    public static final int WRONG_ANSWERS_TO_LOSE = 1;
    public static final int MAX_COMPUTER_OUTPUTS=13;

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        int correctAnswerScore=0;
        int wrongAnswerScore=0;
        int gameCount=1;

        while(gameCount<=4)
        {
            Random number=new Random();
            int computerNumber=number.nextInt(MAX_COMPUTER_OUTPUTS+OFFSET_NUMBER);


        }

    }
}
