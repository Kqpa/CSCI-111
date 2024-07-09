public class Pattern
{
    public static void printPattern(char ch, int numRows, int numCols)
    {
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numCols; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        printPattern('@', 4, 3);
    }
}
