/*
 ***** THIS FILE IS FOR TESTING PURPOSES ONLY. *****
 * 
 * Put the final versions of your methods for problem 2 
 * in your ps6_partI file.
 * 
 * Do NOT submit them in this file.
 */

import java.util.*;    // for access to the Arrays class

public class Problem2Test {
    /*** Put your methods for problems 2a and 2b below ***/
    
    
    
 
    /*
     * This main method includes several tests for your methods.
     * 
     * It will not compile until you have added correct definitions
     * for both of the methods.
     * 
     * We encourage you to add additional tests as well.
     */ 
    public static void main(String[] args) {
        int[] values = {0, 2, 4, 6, 8, 10};
        System.out.println("values array before shifting:");
        System.out.println(Arrays.toString(values));
        shiftRight(values);
        System.out.println("values array after shifting:");
        System.out.println(Arrays.toString(values));
        System.out.println();

        int[] list1 = {1, 3, 6};
        int[] list2 = {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6};
        int index = indexOf(list1, list2);
        System.out.println("indexOf(list1, list2) returns " + index);
    }
}