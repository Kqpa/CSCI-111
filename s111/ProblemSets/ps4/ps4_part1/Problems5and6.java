/*
 * Problems5and6.java
 *
 * Computer Science S-111, Harvard University
 * 
 * A class that contains methods from problems 5 and 6 of PS 4.
 */

public class Problems5and6
{
    public static void printSomething(int n)
    {
        if (n <= 0)
        {
            return;
        }
        
        System.out.println(n * n);
        printSomething(n - 1);
    }
    
    public static int mystery(int a, int b)
    {
        if (a < 0)
        {
            return 1;
        } 
        else
        {
            int myst_rest = mystery(a - b, b);
            return 2 + myst_rest;
        }
    }
    
    public static void main(String[] args)
    {
        printSomething(4);
        System.out.println();
        System.out.println(mystery(20, 6)); // 20, 0 -> infinite recursion; stack overflow
    }
}
