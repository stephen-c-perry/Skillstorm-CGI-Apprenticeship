package week_1.day5.BooleansAndReview.src;

import java.util.Scanner;
import java.util.Random;

public class DiceRollStep2 {


/*
 * Make a class named DiceRoll that contains a main method
 * Use a Scanner to read in user input
 * Use a double to store the dollar amount
 * Use String.format to print out the final earnings/losings
 */

    public static void main(String[] args) throws InterruptedException {
        // Step 1: Write a program that prompts the user to enter a number between 1 and 6. Use Math.random() to “roll” the dice. 
        // And let the user know if they guessed correctly or not. Test your code to make sure it is working and then move on to the next step. 

        //new instance of Scanner
        Scanner in = new Scanner(System.in);

        //Greeting
        System.out.println("Hello, let's roll a dice.  Are you feeling lucky?\n");

        //Enter starting bankroll
        System.out.println("Enter your starting bankroll:");
        double bankroll = in.nextDouble();

        //Enter wager
        System.out.println("Enter your wager:");
        double wager = in.nextDouble();

        //Prompt user and store selection
        System.out.println("Enter a number between 1 and 6: ");
        int guess = in.nextInt();
        
        // close Scanner
        in.close();

        // "roll dice" with rng 1-6
        Random rng = new Random();
        int roll = rng.nextInt(6) + 1;

        System.out.println("Rolling...");

        //compare roll to guess, if equal win, if not equal try again
        //Thread.sleep(3000); //anticipation builds
        if (guess == roll) {

            //calculate payout 3/1 odds
            double winnings = wager * 3;

            // from docs:
                // The format specifiers for general, character, and numeric types have the following syntax:
                        // %[argument_index$][flags][width][.precision]conversion

            System.out.printf("Congratulations! You won $%.2f%n", winnings);
        }
            else {
                System.out.printf("Sorry, you lost $%.2f%n", wager);
                System.out.printf("You have $%.2f left %n", (bankroll - wager));

                // stretch goal, keep a running balance for the bankroll
            }

    }

}
