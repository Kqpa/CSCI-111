/*
 * Problem8.java
 */

public class Problem8_old {
    public static boolean isPal(String s) {
        if (s == null)
        {
            throw new IllegalArgumentException();
        }
        else if (s.length() <= 1)
        {
            return true;
        }
        String parsedS = "";
        /*
         * Add characters to parsedS if they are alphabetic lowercase letters
         */
        for (int i = 0; i < s.length(); i++)
        {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch >= 97 && ch <= 122)
            {
                parsedS += ch;
            }
        }
        String leftSide;
        String rightSide;
        /*
         * abba; l = 4
         * 0, l/2 -> ab
         * 2 -> ba
         * 
         * racecar; l = 7
         * 0, l/2 -> 0, 3 -> rac
         * l/2 + 1 -> 4 -> car
         */
        int len = parsedS.length();
        if (len % 2 == 0)
        {
            leftSide = parsedS.substring(0, len / 2);
            rightSide = parsedS.substring(len / 2);
        }
        else
        {
            leftSide = parsedS.substring(0, len / 2);
            rightSide = parsedS.substring(len / 2 + 1);
        }
        /*
         * leftString = rac
         * rightString = car
         * left (queue) -> car
         * right (stack) -> car
         */
        LLQueue<Character> left = new LLQueue<Character>();
        LLStack<Character> right = new LLStack<Character>();
        for (int i = 0; i < leftSide.length(); i++)
        {
            left.insert(leftSide.charAt(i));
        }
        for (int i = 0; i < rightSide.length(); i++)
        {
            right.push(rightSide.charAt(i));
        }
        while (!left.isEmpty() && !right.isEmpty())
        {
            char leftRemove = left.remove();
            char rightPop = right.pop();
            if (leftRemove != rightPop)
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