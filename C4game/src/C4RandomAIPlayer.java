import java.util.Random;

public class C4RandomAIPlayer extends ConnectPlayer
{
    char playerPiece;
    public C4RandomAIPlayer(char playerPiece)
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
        Random number=new Random();
        column=number.nextInt(7);//generates a random number between 0-6
       return column;
    }
}
