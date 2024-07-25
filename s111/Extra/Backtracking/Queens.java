public class Queens
{
    private boolean[][] board;
    private boolean[] colEmpty;
    private boolean[] upDiagEmpty;
    private boolean[] downDiagEmpty;
    private int dim;

    public Queens(int dim)
    {
        this.dim = dim;
        this.board = new boolean[dim][dim];
        this.colEmpty = new boolean[dim];
        this.upDiagEmpty = new boolean[dim];
        this.downDiagEmpty = new boolean[dim];
    }

    private void placeQueen(int r, int c)
    {
        this.board[r][c] = true;
        update(r, c, false);
    }

    private void removeQueen(int r, int c)
    {
        this.board[r][c] = false;
        update(r, c, true);
    }

    public void update(int r, int c, boolean expr)
    {
        this.colEmpty[c] = expr;
        this.upDiagEmpty[r + c] = expr;
        this.downDiagEmpty[(this.board.length - 1) + r - c] = expr;
    }

    private boolean isSafe(int r, int c)
    {
        return (this.colEmpty[c]
                && this.upDiagEmpty[r + c]
                && this.downDiagEmpty[dim - 1 + r - c]);
    }

    private void printBoard()
    {
        for (int r = 0; r < dim; r++)
        {
            for (int c = 0; c < dim; c++)
            {
                if (this.board[r][c])
                {
                    System.out.println("Q");
                }
                else
                {
                    System.out.println("_");
                }
            }
            System.out.println();
        }
    }

    private boolean findSolution(int r)
    {
        if (r == this.dim)
        {
            this.printBoard();
            return true;
        }

        for (int c = 0; c < dim; c++)
        {
            if (this.isSafe(r, c))
            {
                this.placeQueen(r, c);
                if (this.findSolution(r + 1))
                {
                    return true;
                }
                this.removeQueen(r, c);
            }
        }
        return false;
    }

    public void findSolution()
    {
        findSolution(0);
    }
}