/* SELF ASSESSMENT

Connect4Game class (35 marks)
My class creates references to the Connect 4 Grid and two Connect 4 Players. It asks the user whether he/she would like to play/quit inside a loop. If the user decides to play then: 1. Connect4Grid2DArray is created using the Connect4Grid interface, 2. the two players are initialised - must specify the type to be ConnectPlayer, and 3. the game starts. In the game, I ask the user where he/she would like to drop the piece. I perform checks by calling methods in the Connect4Grid interface. Finally a check is performed to determine a win.
Comment:Yes, my program does all the tasks specified above.

Connect4Grid interface (10 marks)
I define all 7 methods within this interface.
Comment:Yes, I defined all 7 methods within this interface

Connect4Grid2DArray class (25 marks)
My class implements the Connect4Grid interface. It creates a grid using a 2D array Implementation of the method to check whether the column to drop the piece is valid. It provides as implementation of the method to check whether the column to drop the piece is full. It provides as implementation of the method to drop the piece.  It provides as implementation of the method to check whether there is a win.
Comment:Yes, my program does all the tasks specified above

ConnectPlayer abstract class (10 marks)
My class provides at lest one non-abstract method and at least one abstract method.
Comment:

C4HumanPlayer class (10 marks)
My class extends the ConnectPlayer claas and overrides the abstract method(s). It provides the Human player functionality.
Comment:

C4RandomAIPlayer class (10 marks)
My class extends the ConnectPlayer claas and overrides the abstract method(s). It provides AI player functionality.
Comment:

Total Marks out of 100:

*/
import java.util.Scanner;
public class Connect4Game {
    public static final char PLAYER1_PIECE = '1';
    public static final char PLAYER2_PIECE = '2';
    public static void main(String[] args)
    {
        Connect4Grid2DArray board = new Connect4Grid2DArray();
        Scanner input = new Scanner(System.in);
        ConnectPlayer playerOne = null;
        ConnectPlayer playerTwo = null;
        boolean finished = false;
        while(!finished)
        {
            board.emptyGrid();
            String playerOneString = "";
            String playerTwoString = "";
            String instruction;
            while(!playerOneString.equals("Human")&&!playerOneString.equals("human")&&!playerOneString.equals("AI")&&!playerOneString.equals("ai")
                    &&!playerOneString.equals("Quit")&&!playerOneString.equals("quit"))
            {
                instruction = "Please enter would you like Player One to be a 'Human' or 'AI' player or you can 'Quit':";
                playerOneString = getString(input,instruction);
                if(!playerOneString.equals("Human")&&!playerOneString.equals("human")&&!playerOneString.equals("AI")&&!playerOneString.equals("ai")
                        &!playerOneString.equals("Quit")&&!playerOneString.equals("quit"))
                {
                    System.out.println("Invalid input. Please enter either 'Human or 'AI' or 'Quit'.\n");
                }
                if(playerOneString.equals("Human")||playerOneString.equals("human"))
                {
                    playerOne = new C4HumanPlayer(PLAYER1_PIECE);
                }
                else if(playerOneString.equals("AI")||playerOneString.equals("ai"))
                {
                    playerOne = new C4RandomAIPlayer(PLAYER1_PIECE);
                }
                else if(playerOneString.equals("Quit")||playerOneString.equals("quit"))
                {
                    finished = true;
                }
            }
            while(!playerTwoString.equals("Human")&!playerTwoString.equals("human")&!playerTwoString.equals("AI")&!playerTwoString.equals("ai")
                    &!playerTwoString.equals("Quit")&&!playerTwoString.equals("quit")&!finished)
            {
                instruction = "Please enter would you like Player Two to be a 'Human' or 'AI' player or you can'Quit' :";
                playerTwoString = getString(input,instruction);
                if(!playerTwoString.equals("Human")&!playerTwoString.equals("human")&!playerTwoString.equals("AI")&!playerTwoString.equals("ai"))
                {
                    System.out.println("Invalid input. Please enter either 'Human or 'AI' or 'Quit'.\n");
                }
                if(playerTwoString.equals("Human")||playerTwoString.equals("human"))
                {
                    playerTwo = new C4HumanPlayer(PLAYER2_PIECE);
                }
                else if(playerTwoString.equals("AI")||playerTwoString.equals("ai"))
                {
                    playerTwo = new C4RandomAIPlayer(PLAYER2_PIECE);
                }
                else if(playerTwoString.equals("Quit")||playerTwoString.equals("quit"))
                {
                    finished = true;
                }
            }
            if(!finished)
            {
                System.out.print(""+board.toString());
                while(!board.didLastPieceConnect4()&&!board.isGridFull())
                {
                    boolean validColumn=false;
                    while(!validColumn)
                    {
                        int playerOneColumn = playerOne.columnToPlay();
                        if(board.isValidColumn(playerOneColumn))
                        {
                            validColumn = true;
                            board.dropPiece(playerOne, playerOneColumn);
                            playerOneColumn++;
                            System.out.print("\nPlayer One placing piece "+playerOne.getPiece()+" in column "+(playerOneColumn)+".");
                        }
                        else
                        {
                            System.out.print("Invalid column, please try again.");
                        }
                    }
                    System.out.print(""+board.toString());
                    validColumn = false;
                    if(!board.didLastPieceConnect4())
                    {
                        while(!validColumn)
                        {
                            int playerTwoColumn = playerTwo.columnToPlay();
                            if(board.isValidColumn(playerTwoColumn))
                            {
                                validColumn = true;
                                board.dropPiece(playerTwo, playerTwoColumn);
                                playerTwoColumn++;
                                System.out.print("\nPlayer Two placing piece "+playerTwo.getPiece()+" in column "+(playerTwoColumn)+".");
                                if(board.didLastPieceConnect4())
                                {
                                    System.out.print("\nPlayer Two has WON!\n");
                                }
                            }
                        }
                        System.out.print(""+board.toString());
                    }
                    else
                    {
                        System.out.print("\nPlayer One has WON!\n");
                    }
                    if(board.isGridFull()&!board.didLastPieceConnect4())
                    {
                        System.out.print("\nThe game was a draw!");
                    }
                }
            }
            else if(finished)
            {
                System.out.print("\n Goodbye, thanks for playing!");
            }
        }
    }

    public static String getString(Scanner scanner,String instruction) {
        boolean finishedGettingName = false;
        while(!finishedGettingName)
        {
            System.out.println(""+instruction);
            String inputtedPlainText = scanner.nextLine();
            boolean validName = inputtedPlainText.matches("[a-zA-Z]+");
            if (validName)
            {
                finishedGettingName = true;
                return inputtedPlainText;
            }
            else if (!validName)
            {
                System.out.println("Invalid input.");
            }
        }
        return null;
    }
}