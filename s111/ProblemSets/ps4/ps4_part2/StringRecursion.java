/**
 * StringRecursion.java
 *
 * starter code by: Computer Science S-111
 * 
 * modified by: Bora Evinç
 * email: bevinc26@my.aci.k12.tr
 *
 * A class that contains recursive methods that operate on strings.
 */

public class StringRecursion {
    /* 
     * You may want to add test code for your methods to this
     * main method, although doing so is not required. 
     * See the section of the assignment entitled
     * "Testing your methods".
     * 
     * IMPORTANT: If your method does not return anything
     * (i.e., it is a void method), you should NOT try
     * to call it from within a println command. Instead,
     * you should call it on its own line -- for example:
     *     printSeries(3, 8);
     */
    public static void main(String[] args) {
        System.out.println("test 1 gives: " + numOccur('s', "Mississippi"));
        System.out.println("test 2 gives: " + numOccur('e', "Mississippi"));
        printWithSpaces("apple");
        System.out.println();
        printDecreasing("apple");
        System.out.println();
        System.out.println(reflect("apple"));
        System.out.println();
        System.out.println(numDiff("some", "sameness"));       
    }
    
    /*
     * numOccur - a recursive method that returns the number of times 
     * that the character ch occurs in the String str.
     * 
     * The main method includes two examples of using this method.
     *
     * You can also test this method by entering
     * StringRecursion.numOccur(ch, str) -- where ch is replaced 
     * by a char and str is replaced by a string -- in the 
     * Interactions Pane.
     */
    public static int numOccur(char ch, String str) {
        // base case
        if (str == null || str.equals("")) {
            return 0;
        }
    
        // recursive case
        int numOccurInRest = numOccur(ch, str.substring(1));
        if (ch == str.charAt(0)) {
            return 1 + numOccurInRest;
        } else {
            return numOccurInRest;
        }
    }

    /*
     * ****** ADD YOUR METHODS BELOW **********
     *
     * Make sure to use the exact method headers
     * given in the assignment.
     */
    
     /*
      * Inserts spaces in between the characters of string `s`
      * and prints it.
      */
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
 
     /*
      * Prints the substrings of string `s` in a
      * "decreasing" order, erasing characters from the end
      * line by line.
      */
     public static void printDecreasing(String s)
     {
         if (s == null || s.equals(""))
         {
             return;
         }
         System.out.println(s);
         printDecreasing(s.substring(0, s.length() - 1));
     }
 
     /*
      * Prints the original and symetry of the string `s`
      */
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
 
     /*
      * Returns the amount of different characters
      * between Strings `s1` and `s2`
      */
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
}
