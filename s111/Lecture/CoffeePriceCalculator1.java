
/**
 * CoffeePriceCalculator1.java
 *
 * Computer Science S-111
 * 
 * An unstructured solution to the coffee-price problem.
 * Determines the base price, tax, and total price for a
 * coffee purchase, based on inputs from the user about
 * the type and size of the drink and other relevant details.
 * 
 * See CoffeePriceCalculator2.java and CoffeePriceCalculator3.java
 * for structural improvements on this version.
 */

import java.util.*;

public class CoffeePriceCalculator1 {
    /* Class constants */
    public static final double TAX_RATE = 0.0625; // sales tax

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // only create this once!

        System.out.println("Welcome to Javabucks!");
        System.out.println();
        System.out.println("What type of drink would you like?");
        System.out.println("1) brewed coffee");
        System.out.println("2) latte");
        System.out.print("Enter your choice (1-2): ");
        int choice = console.nextInt();
        System.out.print("What size (tiny, medio, gigundo)? ");
        String size = console.next();

        if (choice == 1) {

            double price;
            if (size.equals("tiny")) {
                price = 1.60;
            } else if (size.equals("medio")) {
                price = 1.80;
            } else { // must be gigundo
                price = 2.00;
            }

            double tax;
            System.out.print("Are you a student (yes or no)? ");
            String reply = console.next();
            if (reply.equals("no")) {
                tax = price * TAX_RATE;
            } else {
                tax = 0.0;
            }

            System.out.println();
            System.out.printf(" base price: $%.2f\n", price);
            System.out.printf("        tax: $%.2f\n", tax);
            System.out.printf("total price: $%.2f\n", price + tax);
        } else if (choice == 2) {
            System.out.print("What size (tiny, medio, gigundo)? ");
            String size = console.next();

            double price;
            if (size.equals("tiny")) {
                price = 2.80;
            } else if (size.equals("medio")) {
                price = 3.20;
            } else { // must be gigundo
                price = 3.60;
            }

            System.out.print("Flavored syrup (yes or no)? ");
            String reply = console.next();
            if (reply.equals("yes")) {
                price += 0.50;
            }

            double tax;
            System.out.print("Are you a student (yes or no)? ");
            String reply2 = console.next();
            if (reply2.equals("no")) {
                tax = price * TAX_RATE;
            } else {
                tax = 0.0;
            }

            System.out.println();
            System.out.printf(" base price: $%.2f\n", price);
            System.out.printf("        tax: $%.2f\n", tax);
            System.out.printf("total price: $%.2f\n", price + tax);
        }
    }
}