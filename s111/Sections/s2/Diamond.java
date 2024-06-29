public class Diamond 
{
    public static void main(String[] args)
    {
        for (int line = 1; line <= 5; line++)
        {
            for (int i = 0; i < -1*line + 5; i++)
            {
                System.out.print(" ");
            }
            for (int i = 0; i < 2*line - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int line = 1; line <= 4; line++)
        {
            for (int i = 0; i < line; i++)
            {
                System.out.print(" ");
            }
            for (int i = 0; i < -2*line + 9; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
