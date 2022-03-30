public class Connect4Grid2DArray implements Connect4Grid
{
    char[][] grid;
    Connect4Grid2DArray()
    {
        grid =  new char[6][7];//creating a Connect4 grid with 6 rows and 7 columns
        emptyGrid();// initialising the grid
    }
    @Override
    public void emptyGrid()
    {
        {
            for(int row=0; row<grid.length;row++)
            {
                for(int column= 0; column<grid[0].length;column++)
                {
                    grid[row][column]='0';
                }
            }

        }
    }

    @Override
    public String toString()
    {
        String toString="0  1  2  3  4  5  6\n--------------------\n";
        for(int row = 0;row<grid.length;row++)
        {
            for(int column = 0;(column<grid[0].length); column++)
            {
                toString=toString+(grid[row][column])+"  ";
            }
            toString=toString+"\n";
        }
        toString=toString+"--------------------\n0  1  2  3  4  5  6";
        return toString;
    }

    @Override
    public boolean isValidColumn(int column)
    {
        boolean validColumn=false;
        if((column>=0)&&(column<grid[0].length))
        {
            if(!isColumnFull(column))
            {
                validColumn=true;
            }
        }
        return validColumn;
    }

    @Override
    public boolean isColumnFull(int column)
    {
        boolean columnFull=true;
        for(int row = 0; row<grid.length;row++)
        {
            if(grid[row][column]=='0')
            {
                columnFull=false;
            }
        }
        return columnFull;
    }

    @Override
    public void dropPiece(ConnectPlayer player, int column)
    {
        for(int row=0;row<grid.length;row++)
        {
            if (grid[row][column] != '0')
            {
                grid[row-1][column] = player.getPlayerPiece();//Drops the piece in row above the filled row
                return;
            }
        }
        grid[5][column] = player.getPlayerPiece();// To drop initial piece
        return;
    }

    @Override
    public boolean didLastPieceConnect4()
    {
        boolean connect4= false;
        for (int row = 0; row < grid.length; row++)
        {
            for (int column = 0; column < grid[0].length; column++)
            {
                char check = grid[row][column];
                if (check == '0')
                {
                    continue;
                }
                else if (column + 3 < grid[0].length &&
                        check == grid[row][column + 1] &&
                        check == grid[row][column + 2] &&
                        check == grid[row][column + 3])
                //Horizontal "-"
                {
                    connect4=true;
                }
                else if (row + 3 < grid.length)
                {
                    if (check == grid[row + 1][column] &&
                            check == grid[row + 2][column] &&
                            check == grid[row + 3][column])
                    //Vertical "|"
                    {
                        connect4=true;
                    }
                    else if (column + 3 < grid[0].length &&
                            check == grid[row + 1][column + 1] &&
                            check == grid[row + 2][column + 2] &&
                            check == grid[row + 3][column + 3])
                    //Diagonal  "\"
                    {
                        connect4=true;
                    }
                    else if (column - 3 >= 0 &&
                            check == grid[row + 1][column - 1] &&
                            check == grid[row + 2][column - 2] &&
                            check == grid[row + 3][column - 3])
                    //Diagonal  "/"
                    {
                        connect4=true;
                    }
                }
            }
        }
        return connect4;
    }

    @Override
    public boolean isGridFull()
    {
        boolean gridFull=true;
        for(int column = 0; column<grid[0].length;column++)
        {
            if(grid[0][column]=='0')//Checks for any empty('0') column in the first row
            {
                gridFull=false;
            }
        }
        return gridFull;
    }
}
