 /*
  * PostOffice.java
  * Bora Evinç (bevinc26@my.aci.k12.tr)
  * 
  * Computes the postage given the type, size and weight of the item
  */

import java.util.Scanner;

public class PostOffice
{
    /*
     * Asks the user for the type of item
     */
    public static int askOption(Scanner csl)
    {
        System.out.println("Welcome to the Post Office!");
        System.out.println("Supported item types:");
        System.out.println("  1) postcard");
        System.out.println("  2) letter");
        System.out.println("  3) flat");
        System.out.println("  4) Parcel\n");
        System.out.print("Enter the type of item (1-4): ");
        return csl.nextInt();
    }

    /*
     * Asks for the size
     */
    public static String askSize(Scanner csl)
    {
        System.out.print("Enter the box size (small, medium, large): ");
        return csl.next();
    }
    
    /*
     * Asks for the weight given the type of item is not a postcard
     */
    public static int askWeight(Scanner csl)
    {
        System.out.print("Enter its weight in ounces: ");
        return csl.nextInt();
    }

    /*
     * Computes price for letter
     */
    public static int compluteLetter(int weight)
    {
        if (weight < 4)
        {
            return 68 + (weight - 1)*24;
        }
        else
        {
            return computeFlat(weight);
        }

    }

    /*
     * Computes price for flat
     */
    public static int computeFlat(int weight)
    {
        if (weight < 14)
        {
           return 139 + (weight - 1)*24; 
        }
        else
        {
            return 985;
        }
    }

    /*
     * Computes price for parcel
     */
    public static int computeParcel(int weight, Scanner csl)
    {
        if (weight <= 4)
        {
            return 500;
        }
        else if (weight<= 8)
        {
            return 570;
        }
        else if (weight <= 12)
        {
            return 650;
        }
        else if (weight <= 15)
        {
            return 800;
        }
        else
        {
            String size = askSize(csl);
            if (size.equals("small"))
            {
                return 1040;
            }
            else if (size.equals("medium"))
            {
                return 1840;
            }
            else
            {
                return 2475;
            }
        }
    }

    /*
     * Converts an integer of cents into a 
     * formatted string of $d.cc
     */
    public static String convertCents(int n)
    {
        return "$" + n/100 + "." + n % 100;
    }

    public static void main(String[] args)
    {
        Scanner csl = new Scanner(System.in);
        int option = askOption(csl);
        int price;

        if (option == 1)
        {
            /*
             * Assigns the fixed price for postcards
             */
            price = 53;
        }
        else
        {
            int weight = askWeight(csl);
            if (option == 2) // Handles letters
            {
                price = compluteLetter(weight);
            }
            else if (option == 3) // Handles flats
            {
                price = computeFlat(weight);
            }
            else // Handles parcels
            {
                price = computeParcel(weight, csl);
            }
        }
        System.out.println("Required postage: " + convertCents(price));
    }
}
