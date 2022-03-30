import java.util.Scanner;

public class C4HumanPlayer extends ConnectPlayer
{
    char playerPiece;
    public C4HumanPlayer(char playerPiece)
    {
        this.playerPiece = playerPiece;
    }

    @Override
    public char getPlayerPiece()
    {
        return playerPiece;
    }

    @Override
    public int columnToDrop()
    {
        int column=0;
        boolean validColumn=false;
        while(!validColumn)
        {
            System.out.println("Enter a column to drop for "+getPlayerPiece()+" :");
            Scanner input=new Scanner(System.in);
            if(input.hasNextInt())
            {
                int columnInput=input.nextInt();
                if (columnInput >= 0 && columnInput <= 6)
                {
                    column = columnInput;
                    validColumn = true;
                } else
                    System.out.println("Its an invalid entry. Please enter a column between 0 and 6");
            }
            else if(input.hasNextInt()==false)
                System.out.println("Its an invalid entry. Please enter a column between 0 and 6");
        }
        return column;
    }
}
