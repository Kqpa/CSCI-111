/**
 * ComputeBMI.java
 * Computer Science S-111, Harvard University
 * 
 * base code provided by the course staff
 * 
 * algorithm implemented by: Bora Evinç, bevinc26@my.aci.k12.tr 
 * 
 * This program computes a person's body mass index (BMI)
 * from the person's height and weight.
 */

 import java.util.*;

 public class ComputeBMI {
     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
 
         int weight;         // the person's weight in pounds
         int height;         // the person's height in inches
 
         // Read the necessary values from the user.
         System.out.print("Enter the person's weight (to the nearest pound): ");
         weight = console.nextInt();
         System.out.print("Enter the person's height (to the nearest inch): ");
         height = console.nextInt();
         console.close();
         
         /*
          * The lines above read the weight and height from the user
          * and store them in the variables weight and height.
          * Fill in the rest of the program below, using those
          * variables to compute and print the information
          * specified in the assignment.
          */
        
        double bmi = (720.0 * weight) / ((double)height * height);
        System.out.println("Your body mass index is: " + bmi);

        if (bmi > 25)
        {
            System.out.println("This value is above the recommended range.");
        }
        else if (bmi < 19)
        {
            System.out.println("This value is below the recommended range.");
        }
    }
 }
 