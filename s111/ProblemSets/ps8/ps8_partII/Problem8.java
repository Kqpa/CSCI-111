/*
 * Problem8.java
 * Bora Evinç
 * bevinc26@my.aci.k12.tr
 * Checks if given string s is a palindrome, meaning read the same 
 * left to right and right to left
 */

public class Problem8 {
    public static boolean isPal(String s) {
        if (s == null)
        {
            throw new IllegalArgumentException();
        }
        else if (s.length() <= 1)
        {
            return true;
        }
        LLQueue<Character> queue = new LLQueue<Character>();
        LLStack<Character> stack = new LLStack<Character>();
        for (int i = 0; i < s.length(); i++)
        {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch >= 97 && ch <= 122)
            {
                queue.insert(ch);
                stack.push(ch);
            }
        }
        System.out.println(queue);
        System.out.println(stack);
        while (!stack.isEmpty() && !queue.isEmpty())
        {
            char queueChar = queue.remove();
            char stackChar = stack.pop();
            if (queueChar != stackChar)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(0) Testing on \"A man, a plan, a canal, Panama!\"");
        try {
            boolean results = isPal("A man, a plan, a canal, Panama!");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("true");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    // include a blank line between tests
        
        /*
         * We encourage you to add more unit tests below that test a variety 
         * of different cases, although doing so is not required.
         */
    }
}