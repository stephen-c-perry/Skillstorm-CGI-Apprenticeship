package week_1.day5.BooleansAndReview.src;

import java.util.Scanner;
import java.util.Random;

public class DiceRoll {

    public static void main(String[] args) throws InterruptedException {
        // Step 1: Write a program that prompts the user to enter a number between 1 and 6. Use Math.random() to “roll” the dice. 
        // And let the user know if they guessed correctly or not. Test your code to make sure it is working and then move on to the next step. 

        //new instance of Scanner
        Scanner in = new Scanner(System.in);

        //Greeting
        System.out.println("Hello, let's roll a dice.  Are you feeling lucky?\n");

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
        Thread.sleep(3000); //anticipation builds
        if (guess == roll) {
            System.out.println("Congratulations! You won!");
        }
            else {
                System.out.println("Sorry, try again.");

            }

    }

}
