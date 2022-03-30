import java.util.Scanner;
public class Connect4Game
{
    public static void main(String[] args)
    {
        Connect4Grid2DArray grid = new Connect4Grid2DArray();
        Scanner input = new Scanner(System.in);
        Scanner charInput = new Scanner(System.in);
        ConnectPlayer player1 = null;
        ConnectPlayer player2 = null;
        boolean quit=false;
        int player1Wins=0;
        int player2Wins=0;
        char player1Piece=' ';
        char player2Piece=' ';
        while (!quit)
        {
            grid.emptyGrid();
            boolean exit=false;
            while(!exit)
            {
                System.out.println("Please enter would you like Player One to be a 'Human' or 'Computer' player or you can 'Quit':");
                String player1Type = input.nextLine();
                if (player1Type.equalsIgnoreCase("quit"))
                {
                    quit = true;
                    exit=true;
                }
                else if (player1Type.equalsIgnoreCase("human"))
                {
                    System.out.println("Please enter a piece to set for player1");
                    player1Piece = charInput.next().charAt(0);
                    while (player1Piece=='0'|| player1Piece==' ')
                    {
                        System.out.println("Invalid Input. Please enter a piece which is not '0' or null");
                        System.out.println("Please enter a piece to set for player1");
                        player1Piece = charInput.next().charAt(0);
                    }
                    player1 = new C4HumanPlayer(player1Piece);
                    exit = true;
                }
                else if (player1Type.equalsIgnoreCase("computer"))
                {
                    System.out.println("Please enter a piece to set for player1");
                    player1Piece=charInput.next().charAt(0);
                    while (player1Piece=='0'||player1Piece==' ')
                    {
                        System.out.println("Invalid Input. Please enter a piece which is not '0' or null" );
                        System.out.println("Please enter a piece to set for player1");
                        player1Piece = charInput.next().charAt(0);
                    }
                    player1 = new C4RandomAIPlayer(player1Piece);
                    exit=true;
                }
                else
                        System.out.println("Invalid input. Please enter 'Human' or 'Computer' or you can 'Quit'");
            }
            exit=false;
            while (!exit&&!quit)
            {
                System.out.println("Please enter would you like Player two to be a 'Human' or 'Computer' player or you can 'Quit':");
                String player2Type = input.nextLine();
                if (player2Type.equalsIgnoreCase("human"))
                {
                    System.out.println("Please enter a piece to set for player2");
                    player2Piece=charInput.next().charAt(0);
                    while (player2Piece=='0'||player2Piece==player1Piece||player2Piece==' ')
                    {
                        System.out.println("Invalid Input. Please enter a piece which is not '0' or same as player1 piece or null");
                        System.out.println("Please enter a piece to set for player2");
                        player2Piece = charInput.next().charAt(0);
                    }
                    player2 = new C4HumanPlayer(player2Piece);
                    exit=true;
                }
                else if (player2Type.equalsIgnoreCase("computer"))
                {
                    System.out.println("Please enter a piece to set for player2");
                    player2Piece=charInput.next().charAt(0);
                    while (player2Piece=='0'||player2Piece==player1Piece||player1Piece==' ')
                    {
                        System.out.println("Invalid Input. Please enter a piece which is not '0' or same as player1 piece or null");
                        System.out.println("Please enter a piece to set for player2");
                        player2Piece = charInput.next().charAt(0);
                    }
                    player2 = new C4RandomAIPlayer(player2Piece);
                    exit=true;
                }
                else if (player2Type.equalsIgnoreCase("quit"))
                {
                    quit = true;
                    exit=true;
                }
                else
                    System.out.println("Invalid input. Please enter 'Human' or 'Computer' or you can 'Quit'");
            }
            if(!quit)
            {
                System.out.println(grid.toString());
                while (!grid.didLastPieceConnect4() && !grid.isGridFull())
                {
                    boolean emptyColumn = false;
                    while (!emptyColumn)
                    {
                        int player1Column = player1.columnToDrop();
                        if (grid.isValidColumn(player1Column))
                        {
                            emptyColumn = true;
                            grid.dropPiece(player1, player1Column);
                            System.out.println("Player One placing piece " + player1.getPlayerPiece() + " in column " + (player1Column) + ".");
                            //The column number showed in the
                            System.out.println(grid.toString());
                        }
                        else
                                System.out.println("Invalid column, please try again.");
                        if (grid.didLastPieceConnect4())
                        {
                            player1Wins++;
                            System.out.println("\nPlayer one has WON!\n");
                        }
                    }
                    emptyColumn = false;
                    if (!grid.didLastPieceConnect4())
                    {
                        while (!emptyColumn)
                        {
                            int player2Column = player2.columnToDrop();
                            if (grid.isValidColumn(player2Column))
                            {
                                emptyColumn = true;
                                grid.dropPiece(player2, player2Column);
                                System.out.println("Player Two placing piece " + player2.getPlayerPiece() + " in column " + (player2Column) + ".");
                                System.out.println(grid.toString());
                                if (grid.didLastPieceConnect4())
                                {
                                    player2Wins++;
                                    System.out.println("\nPlayer Two has WON!\n");
                                }
                            }
                        }
                    }
                    if (grid.isGridFull() & !grid.didLastPieceConnect4())
                    {
                        System.out.println("\nThe game was a draw!\n");
                    }
                }
            }
            else if(quit)
            {
                System.out.println("Player 1 wins: "+player1Wins+" Player 2 wins: "+player2Wins);
                System.out.println("Thank you for playing");
            }
        }
    }
}
