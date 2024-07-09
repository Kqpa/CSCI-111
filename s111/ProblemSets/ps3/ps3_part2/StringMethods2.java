 /*
  * StringMethods2.java
  * Bora Evinç (bevinc26@my.aci.k12.tr)
  * 
  * Collection of string methods
  */

public class StringMethods2
{
    /*
     * Prints the string in a decreasing order
     */
    public static void printDecreasing(String s)
    {
        for (int i = s.length() ; i >= 0; i--)
        {
            if (i != 0)
            {
                System.out.println(s.substring(0, i));
            }
        }
    }
    
    /*
     * Prints the first and last characters of a string
     */
    public static String firstAndLast(String s)
    {
        if (s.length() == 1)
        {
            return s;
        }
        return s.charAt(0) + "" + s.charAt(s.length() - 1);
    }

    /*
     * Returns the latest index of the char ch's occurance
     */
    public static int lastIndexOf(String s, char ch)
    {
        int index = -1;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ch)
            {
                index = i;
            }
        }
        return index;
    }

    /*
     * Repeats the String s n times 
     */
    public static String repeat(String s, int n)
    {
        String str = "";
        for (int i = 0; i < n; i++)
        {
            str += s;
        }
        return str;
    } 

    public static void main(String[] args)
    {
        System.out.println("** part 1 **");
        StringMethods2.printDecreasing("method");
        System.out.println();
        
        System.out.println("** part 2, example 1 **");
        String str1 = StringMethods2.firstAndLast("Boston");
        System.out.println(str1);
        System.out.println();
 
        System.out.println("** part 2, example 2 **");
        String str2 = StringMethods2.firstAndLast("Harvard");
        System.out.println(str2);
        System.out.println();
        
        System.out.println("** part 2, example 3 **");
        String str3 = StringMethods2.firstAndLast("a");
        System.out.println(str3);
        System.out.println();

        System.out.println("** part 3, example 1 **");
        int index1 = StringMethods2.lastIndexOf("Boston", 'o');
        System.out.println(index1);
        System.out.println();

        System.out.println("** part 3, example 2 **");
        int index2 = StringMethods2.lastIndexOf("banana", 'a');
        System.out.println(index2);
        System.out.println();

        System.out.println("** part 3, example 3 **");
        int index3 = StringMethods2.lastIndexOf("banana", 'b');
        System.out.println(index3);
        System.out.println();

        System.out.println("** part 3, example 4 **");
        int index4 = StringMethods2.lastIndexOf("banana", 'x');
        System.out.println(index4);
        System.out.println();
        
        System.out.println("** part 4, example 1 **");
        String str_1 = StringMethods2.repeat("Java", 3);
        System.out.println(str_1);
        System.out.println();
        
        System.out.println("** part 4, example 2 **");
        String str_2 = StringMethods2.repeat("oh!", 7);
        System.out.println(str_2);
        System.out.println();
    }
}
