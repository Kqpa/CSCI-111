public class Recursion
{
    public static void printWithSpaces(String s)
    {
        if (s == null || s.equals(""))
        {
            System.out.println();
            return;
        }
        System.out.print(s.charAt(0) + " ");
        printWithSpaces(s.substring(1));
    }

    public static void printDecreaString(String s)
    {
        if (s == null || s.equals(""))
        {
            return;
        }
        System.out.println(s);
        printDecreaString(s.substring(0, s.length() - 1));
    }

    public static String reflect(String s)
    {
        if (s == null || s.equals(""))
        {
            return "";
        }

        return s.charAt(0) +
               reflect(s.substring(1)) +
               s.charAt(0);
    }

    public static int numDiff(String s1, String s2)
    {
        if (s1 == null || s2 == null)
        {
            return 0;
        }
        if (s1.equals("") && !s2.equals(""))
        {
            return s2.length();
        }
        if (!s1.equals("") && s2.equals(""))
        {
            return s1.length();
        }
        if (s1.equals("") && s2.equals(""))
        {
            return 0;
        }
        if (s1.charAt(0) != s2.charAt(0))
        {
            return 1 + numDiff(s1.substring(1), s2.substring(1));
        }
        return numDiff(s1.substring(1), s2.substring(1));
    }

    public static void main(String[] args)
    {
        printWithSpaces("apple");
        System.out.println();
        printDecreaString("apple");
        System.out.println();
        System.out.println(reflect("apple"));
        System.out.println();
        System.out.println(numDiff("some", "sameness"));
    } 
}
