/*
 * NumberGame.java
 *
 * A random number guessing game.
 *
 * Author:
 * Date:
 */

 import java.util.Scanner;

 public class NumberGame {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         System.out.println("Welcome to NumberGame!");
 
         System.out.println("Available levels of difficulty:");
         System.out.println("\t1. easy");
         System.out.println("\t2. normal");
         System.out.println("\t3. hard");
 
         System.out.print("your choice (1-3): ");
 
         /*
          * Write the code to handle getting the difficulty level here.
          */
         int difficulty = input.nextInt();
 
         int min;
         int max;
         int maxGuess;
 
         /*
          * Complete the conditional blocks below to set the lower
          * and upper bounds of the guessing range.
          */
         if (difficulty == 1) {
            min = 1;
            max = 10;
            maxGuess = 8;
         } else if (difficulty == 2) {
            min = 1;
            max = 50;
            maxGuess = 5;
         } else {
            min = 1;
            max = 500;
            maxGuess = 4;
         }
 
         int secretNumber = getRandom(min, max);
 
         /*
          * Now keep going from here!
          * Start by creating an unstructured solution, i.e. do
          * not break pieces into methods and do not try to
          * reduce duplicated code in conditional blocks. Do
          * this last, after you know the program works!
          */
          int guessAmount = 0;
          int currentGuess;
          boolean hasWon = false;
          
          do
          {
            System.out.print("Enter your guess: ");
            currentGuess = input.nextInt();
            guessAmount++;
            if (currentGuess > secretNumber)
            {
                System.out.println("Your guess is too high!");
            }
            else if (currentGuess < secretNumber)
            {
                System.out.println("Your guess is too low!");
            }
            else
            {
                hasWon = true;
                if (guessAmount != 1)
                {
                    System.out.println("You win! Good guessing!");
                }
                else
                {
                    System.out.println("Wow! Are you cheating?");
                }
                break;
            }
          } while (guessAmount < maxGuess);

          if (!hasWon)
          {
            System.out.println("Game over! The number was <" + secretNumber + ">" + "!");
          }
     }
 
     /*
      * Return a random integer between min and max.
      */
     public static int getRandom(int min, int max) {
         return (int)(Math.random() * (max - min + 1) + min);
     }
 }