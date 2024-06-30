/**
 * AreaCalculator.java
 * Computer Science S-111, Harvard University
 * 
 * base code provided by the course staff
 * 
 * algorithm implemented by: <put your name and email here> 
 * 
 * This program computes the area of a circular plot of land
 * and displays it in different units.
 */

 import java.util.*;

 public class AreaCalculator {
     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
 
         int diameter;      // the diameter of the plot in feet
         
         // Read the necessary values from the user.
         System.out.print("Input the diameter, measured to the nearest foot: ");
         diameter = console.nextInt();
         console.close();
            
         /*
          * The lines above read the diameter from the user
          * and store it in the variable diameter.
          * Fill in the rest of the program below, using that 
          * variable to compute and print the values mentioned
          * in the assignment.
          */
        
        double radius = diameter / 2.0;
        
        int area_sqf = (int)(Math.PI * radius * radius);
        double area_sqy = (double)area_sqf / 9;
        System.out.println("The area is: ");
        System.out.println("\t" + area_sqf + " square feet");
        System.out.println("\t" + area_sqy + " square yards");
        System.out.println("\t" + (int)area_sqy + " square yards and " + (int)((area_sqy * 10) % 10) + " square feet"); 
     }
 }
 