/*
 * RestaurantPrice.java
 * 
 * Program for computing the price of a person eating from a buffet.
 */

 import java.util.*;

 public class RestaurantPrice {
     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);     // always do this first!
 
         System.out.println("Types of guest:");
         System.out.println("   1. child");
         System.out.println("   2. adult");
         System.out.println("   3. senior");
         System.out.println();
         System.out.print("Enter the type of guest (1-3): ");
         int type = console.nextInt();
         int price;

         if (type == 1)
         {
            System.out.print("Enter the child's age: ");
            int age = console.nextInt();
            // compute price, equate it to `price`
         }
         else
         {
            System.out.print("Do you have a discount coupon (0=no, 1=yes)? ");
            int couponStatus = console.nextInt();
            if (type == 2)
            {
                // compute price, check coupon status as well
            }
            else if (type == 3)
            {
                // 
            }
         }
 
         if (type == 1) {
             System.out.print("Enter the child's age: ");
             int age = console.nextInt();
 
             int price;
             if (age <= 5) {
                 price = 0;
             } else {
                 price = 15;
             }
 
             System.out.println();
             System.out.println("The price is $" + price + ".00");
         } else if (type == 2) {
             System.out.print("Do you have a discount coupon (0=no, 1=yes)? ");
             int couponStatus = console.nextInt();
 
             int price;
             if (couponStatus == 1) {
                 price = 20;
             } else {
                 price = 30;
             }
 
             System.out.println();
             System.out.println("The price is $" + price + ".00");
         } else {
             System.out.print("Do you have a discount coupon (0=no, 1=yes)? ");
             int couponStatus = console.nextInt();
 
             int price;
             if (couponStatus == 1) {
                 price = 10;
             } else {
                 price = 18;
             }
 
             System.out.println();
             System.out.println("The price is $" + price + ".00");
         }
     }
 }