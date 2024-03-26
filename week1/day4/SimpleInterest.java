package week_1.day4;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        
/*
 * Create a SimpleInterest.java file with a main method that calculates simple interest from user input 
 * 
 * (Hint: Create a Scanner that reads from System.in). Your application needs to ask the user for:
 *          The initial principal
 *          The interest rate (as a percentage)
 *          The time in years.
 * 
 * After receiving those values it should then print out the the results with 2 decimal places. 
 * (Hint: Use System.out.format() or System.out.printf(). 
 */

    //new Scanner instance    
    Scanner scanner = new Scanner(System.in);
    
        //Declare variables
        double principal, rate, time;

        //initial principal
        System.out.println("\nWhat is the original amount of your loan? ");
        principal = scanner.nextDouble();

        //interest rate (as percentage)
        System.out.println("What is your interest rate percentage? ");
        rate = (scanner.nextDouble())/100;

        //time in years
        System.out.println("What is the length of your loan in years? ");
        time = scanner.nextDouble();

    //close Scanner
    scanner.close();

    //calculation
    double totalPaid, totalInterest;

    totalPaid = principal * (1 + (rate * time));
    totalInterest = totalPaid - principal;

    //print result

    // %$.2f is a placeholder with the formatting you want and is replaced by the arguments you pass

    System.out.printf("\nYour total paid is $%.2f and your total interest is $%.2f%n", totalPaid, totalInterest);

    }
}
