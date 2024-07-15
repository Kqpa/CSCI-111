
/**
 * Problem4.java
 * 
 * Computer Science S-111
 * 
 * A class in which the code fragment from problem 4 of PS 4 has been
 * added to a main() method.
 * 
 * **** IMPORTANT: make sure to put elections.txt in the same folder as this file. ****
 */

import java.util.*;
import java.io.*;

public class Problem4
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("elections.txt"));

        while (input.hasNextLine())
        {
            String line = input.nextLine();
            String[] fields = line.split(",");

            int perc1 = Integer.parseInt(fields[2]);
            int perc2 = Integer.parseInt(fields[4]);

            if (perc1 > 50 || perc2 > 50)
            {
                System.out.print(fields[0] + ": ");
                if (perc1 > perc2)
                {
                    System.out.println(fields[1] + " (" + perc1 + ")");
                }
                else
                {
                    System.out.println(fields[3] + " (" + perc2 + ")");
                }
            }
        }
    }
}