 /*
  * StringMethods.java
  * Bora Evinç (bevinc26@my.aci.k12.tr)
  * 
  * Collection of string methods
  */

public class StringMethods
{
    /*
     * Inserts spaces in between characters of a string
     */
    public static void printWithSpaces(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (i != s.length() - 1)
            {
                System.out.print(s.charAt(i) + " ");
            }
            else
            {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }
    
    /*
     * Returns the middle character of a string
     */
    public static char middleChar(String s)
    {
        return s.charAt((s.length() - 1) / 2);
    }

    /*
     * Moves the first n characters of string s to the end
     */
    public static String moveToEnd(String s, int n)
    {
        if (s.length() <= n)
        {
            return s;
        }
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args)
    {
        System.out.println("** part 1 **");
        StringMethods.printWithSpaces("method");
        System.out.println();
        
        System.out.println("** part 2, example 1 **");
        char mid1 = StringMethods.middleChar("clock");
        System.out.println(mid1);
        System.out.println();      
                
        System.out.println("** part 2, example 2 **");
        char mid2 = StringMethods.middleChar("Boston");
        System.out.println(mid2);
        System.out.println();
        
        System.out.println("** part 3, example 1 **");
        String str1 = StringMethods.moveToEnd("Boston", 4);
        System.out.println(str1);
        System.out.println();
        
        System.out.println("** part 3, example 2 **");
        String str2 = StringMethods.moveToEnd("Harvard", 2);
        System.out.println(str2);
        System.out.println();

        System.out.println("** part 3, example 3 **");
        String str3 = StringMethods.moveToEnd("Harvard", 8);
        System.out.println(str3);
        System.out.println();
    }
}