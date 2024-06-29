public class DiamondScale
{
    public static final int SCALE_FACTOR = 2;
    public static void main(String[] args)
    {
        for (int line = 1; line <= 2*SCALE_FACTOR + 3; line++) // 5, 7 
        {
            for (int i = 0; i < -1*line + (2*SCALE_FACTOR + 3); i++)
            {
                System.out.print(" ");
            }
            for (int i = 0; i < 2*line - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int line = 1; line <= 2*SCALE_FACTOR + 2; line++) // 4, 6
        {
            for (int i = 0; i < line; i++)
            {
                System.out.print(" ");
            }
            for (int i = 0; i < - 2*line; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}