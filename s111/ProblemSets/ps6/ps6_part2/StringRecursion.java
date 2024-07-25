public class StringRecursion
{
    public static void printLetters(String str)
    {
        if (str == null || str.equals(""))
        {
            return;
        }
        if (str.length() == 1)
        {
            System.out.println(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(0) + ", ");
        printLetters(str.substring(1));
    }
    public static String replace(String str, char oldChar, char newChar)
    {
        if (str == null || str.equals(""))
        {
            return str;
        }
        if (str.charAt(0) == oldChar)
        {
            return newChar + replace(str.substring(1), oldChar, newChar);
        }
        return str.charAt(0) + replace(str.substring(1), oldChar, newChar);
    }
    public static int indexOf(char ch, String str)
    {
        if (str == null || str.equals(""))
        {
            return -1;
        }
        if (str.charAt(0) == ch)
        {
            return 0;
        }
        int result = indexOf(ch, str.substring(1));
        if (result == -1)
        {
            return -1;
        }
        else
        {
            return 1 + result;
        }
    }

    public static String trim(String str)
    {
        if (str == null)
        {
            return null;
        }
        if (str.equals(""))
        {
            return "";
        }
        if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ')
        {
            return trim(str.substring(1, str.length() - 1));
        }
        else if (str.charAt(0) == ' ')
        {
            return trim(str.substring(1));
        }
        else if (str.charAt(str.length() - 1) == ' ')
        {
            return trim(str.substring(0, str.length() - 1));
        }
       return str;
    }
    public static void main(String[] args)
    {
        printLetters("Rabbit");
        String s = replace(null, 'e', 'y');
        System.out.println(s);
        int n = indexOf('P', "Rabbit");
        System.out.println(n);
        String p = trim("hello ");
        System.out.println(p);
    }
}
