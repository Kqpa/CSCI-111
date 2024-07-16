/*
 * CensusDatabaseExtended.java
 * 
 * Computer Science S-111, Harvard University
 *
 * This program performs computations on census data stored in a text file.
 * It uses arrays in several ways, including for storage of the results of
 * the computations.
 * 
 * modified by: Bora Evinç, bevinc@my.aci.k12.tr
 *        date: 14 July 2024
 */

import java.util.*;
import java.io.*;

public class CensusDatabaseExtended
{
  /*
   * A class-constant array of Strings containing the names of the states
   * in the data file.
   * 
   * The index of a given state name in the array is the
   * same as the numeric code of the state in the data file.
   * For example, Alaska has a state code of 1 in the data file,
   * so its name is at position 1 in this array.
   */
  public static final String[] STATE_NAMES = { "Alabama", "Alaska",
      "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
      "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois",
      "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
      "Maryland", "Massachusetts", "Michigan", "Minnesota",
      "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada",
      "New Hampshire", "New Jersey", "New Mexico", "New York",
      "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
      "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
      "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
      "West Virginia", "Wisconsin", "Wyoming", "District of Columbia" };

  /*
   * A class-constant array of Strings containing the names of
   * the nine divisions used by the Census Bureau.
   * 
   * The Census Bureau also numbers the divisions, and we have
   * used a division's number as its index in this array.
   * For example, New England is Division 1, so its name is at
   * position 1 in this array.
   * 
   * Note that there is no division 0, so we have put the name
   * "none" in position 0 of the array.
   */
  public static final String[] DIVISION_NAMES = {
      "none", "New England", "Mid-Atlantic", "East North Central", "West North Central",
      "South Atlantic", "East South Central", "West South Central",
      "Mountain", "Pacific" };

  /*
   * A class-constant array of integers that allows you to
   * determine the number of the division to which each
   * state belongs.
   * 
   * For example, Alaska has a state code of 1.
   * Element 1 of this array is the integer 9, which indicates
   * that Alaska is in division 9 (Pacific).
   */
  public static final int[] DIVISION_FOR_STATE = { 6, 9,
      8, 7, 9, 8, 1, 5, 5, 5, 9, 8, 3, 3, 4, 4, 6, 7, 1, 5,
      1, 3, 4, 6, 4, 8, 4, 8, 1, 2, 8, 2, 5, 4, 3, 7, 9, 2,
      1, 5, 4, 6, 7, 8, 1, 5, 9, 5, 3, 8, 5 };

  public static void main(String[] args) throws FileNotFoundException
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to the Census Calculator!");
    System.out.print("NAME OF DATA FILE: ");
    String filename = console.nextLine();
    System.out.println();

    while (true)
    {
      System.out.print("STATE OR DIVISION NAME (or q to quit): ");
      String stateDivisionNames = console.nextLine();
      
      if (stateDivisionNames.equals("q"))
      {
        break;
      }

      /*
       * Add code here to process the state entered by the user.
       * Remember that you should use the getStateCode() method
       * that you will implement below, along with at least two
       * other methods that you will write. At least one of your
       * other methods must take an array as a parameter.
       */

      Scanner reader = new Scanner(new File(filename));
      String[] years = reader.nextLine().split(",");
      int[] yearValues = new int[years.length];

      if (isValidState(stateDivisionNames))
      {
        System.out.println();
        printDivison(stateDivisionNames);
        processLineState(reader, stateDivisionNames, yearValues);
        printPopulationTotals(years, yearValues);
        System.out.println();
      } 
      else if (isValidDivision(stateDivisionNames))
      {
        processLineDivision(reader, stateDivisionNames, yearValues);
        printPopulationTotals(years, yearValues);
        System.out.println();
      }
      else
      {
        System.out.println("\n" + stateDivisionNames + " is not a valid state or division name.\n");
      }
    }
    console.close();
  }

  /*
   * getStateCode - finds and returns the state code for
   * the specified state name, and -1 if the specified
   * state name is not found.
   * 
   * You will complete this method so that it searches
   * through the STATE_NAMES array and returns the index
   * of stateDivisionNames in that array, or -1 is stateDivisionNames
   * is not found in that array.
   */
  public static int getStateCode(String stateDivisionNames)
  {
    for (int i = 0; i < STATE_NAMES.length; i++)
    {
      if (stateDivisionNames.equals(STATE_NAMES[i]))
      {
        return i;
      }
    }
    return -1;
  }

  /*
   * Prints the population in the format of:
   * "`years[i]`: `yearValues[i]`"
   */
  public static void printPopulationTotals(String years[], int yearValues[])
  {
    System.out.println("\npopulation totals:");
    for (int i = 0; i < yearValues.length; i++)
    {
      System.out.print("  " + years[i] + ": ");
      System.out.printf("%,d\n", yearValues[i]);  
    }

  }

  /*
   * Prints the division in which the `stateDivisionNames` is in.
   */
  public static void printDivison(String stateDivisionNames)
  {
    System.out.println(stateDivisionNames + " is in the " +
                       DIVISION_NAMES[DIVISION_FOR_STATE[getStateCode(stateDivisionNames)]] +
                       " division.\n");
  }

  /*
   * Processes the `fileName` with the states in mind, searching for the lines
   * with data belonging to the stateDivisionNames and prints the counties
   * and calculates the total population.
   */
  public static void processLineState(Scanner reader, String stateDivisionNames, int[] yearValues)
  {
    System.out.println("counties:");
    while (reader.hasNextLine())
    {
      String[] fields = reader.nextLine().split(",");
      if (Integer.parseInt(fields[2]) == getStateCode(stateDivisionNames))
      {
        System.out.println("  " + fields[0]);
        for (int i = 0; i < yearValues.length; i++)
        {
          yearValues[i] += Integer.parseInt(fields[3 + i]);
        }
      }
    }
  }

  /*
   * Processes the `fileName` with the division in mind, searching
   * for lines with data belonging to the stateDivisionNames and 
   * calculates the total population.
   */
  public static void processLineDivision(Scanner reader, String stateDivisonNames, int[] yearValues)
  {
    while (reader.hasNextLine())
    {
      String[] fields = reader.nextLine().split(",");
      if (DIVISION_NAMES[DIVISION_FOR_STATE[Integer.parseInt(fields[2])]].equals(stateDivisonNames))
      {
        for (int i = 0; i < yearValues.length; i++)
        {
          yearValues[i] += Integer.parseInt(fields[3 + i]);
        }
      }
    }
  }
  
  /*
   * Checks whether or not a given `stateDivisionNames`
   * is found in `STATE_NAMES`
   */
  public static boolean isValidState(String stateDivisionNames)
  {
    if (getStateCode(stateDivisionNames) == -1)
    {
      return false;
    }
    return true;
  }

  /*
   * Checks whether or not a given `stateDivisionNames`
   * is found in `DIVISION_NAMES`
   */
  public static boolean isValidDivision(String stateDivisionName)
  {
    for(int i = 0; i < DIVISION_NAMES.length; i++)
    {
      if (stateDivisionName.equals(DIVISION_NAMES[i]))
      {
        return true;
      }
    }
    return false;
  }
}