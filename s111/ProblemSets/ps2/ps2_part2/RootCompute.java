/**
 * RootCompute.java
 * Computer Science S-111, Harvard University
 * 
 * base code provided by the course staff
 * 
 * algorithm implemented by: Bora Evinç, bevinc26@my.aci.k12.tr 
 * 
 * This program computes gradually improving estimates
 * of the square root of a number using Newton's method.
 */

import java.util.*;

public class RootCompute {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int x;             // the number whose root we wish to find
        int n;             // the number of times to improve the guess

        // Read the necessary values from the user.
        System.out.print("input a positive integer (x): ");
        x = console.nextInt();
        System.out.print("number of times to improve the estimate: ");
        n = console.nextInt();
        console.close();
        
        /*
         * The lines above read the necessary values from the user
         * and store them in the variables declared above.
         * Fill in the rest of the program below, using those
         * variables to compute and print the values mentioned
         * in the assignment.
         */

        System.out.println("\nestimates the square root of " + x + ":");

         double est = x/2;
         
         for (int i = 0; i < n + 1; i++)
         {
            System.out.println(est);
            est = ((est) + (x/est))/(2);
         }
    }
}
