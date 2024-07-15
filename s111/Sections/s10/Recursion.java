public class Recursion
{
    public static int numUpperCase(String s)
    {
        if (s == null || s.equals(""))
        {
            return 0;
        }
        else
        {
            char c = s.charAt(0);
            if (c >= 'A' && c <= 'Z')
            {
                return 1 + numUpperCase(s.substring(1));
            }
            else
            {
                return numUpperCase(s.substring(1));
            }
        }
    }

    public static void printTriangular(String s, int h)
    {
        if (h <= 0)
        {
            return;
        }
        else
        {
            repeat(s, h);
            printTriangular(s, h - 1);
        }
    }

    public static void repeat(String s, int n)
    {
        if (n == 0)
        {
            System.out.println();
            return;
        }
        System.out.print(s + " ");
        repeat(s, n - 1);
    }

    public static int length(String s)
    {
        if (s == null || s.equals(""))
        {
            return 0;
        }
        int lengthRest = length(s.substring(1));
        return 1 + lengthRest;
    }
    public static void main(String[] args)
    {
        System.out.println(length("Hello"));
        repeat("hello", 3);
        System.out.println();
        printTriangular("hello", 3);
    }
}