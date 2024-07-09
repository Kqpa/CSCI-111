import java.util.Scanner;

public class StringManipulation
{
    public static int countOccurance(String str, char ch)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
            {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String str)
    {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String insertSpace(String str)
    {
        String inserted = "";
        for (int i = 0; i < str.length(); i++)
        {
            inserted += str.charAt(i) + " ";
        }
        return inserted;
    }

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = console.nextLine();
        System.out.print("Enter a char: ");
        char ch = console.nextLine().charAt(0);
        System.out.println();
        
        System.out.println("Occurances of " + ch + ": " + countOccurance(str, ch));
        System.out.println("Reverse of " + str + ": " + reverseString(str));
        System.out.println("Spaced version of " + str + " is: " + insertSpace(str));

        console.close();
    }
}