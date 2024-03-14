package week_1.day4;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
      /*
     * Create a second file called CompoundInterest.java with a main method containing code that calculates compound interest from user input 
     * (Hint: Create a Scanner that reads from System.in). Your application needs to ask the user for:
     * The initial principal
     * The interest rate (as a percent)
     * The number of times per year the interest is compounded
     * The time in years that the money has been invested.
     * Then, calculate the interest and print out the results with 2 decimal places. 
     * (Hint: use System.out.format() or System.out.printf()).
     * 
     */    

    //new Scanner instance    
    Scanner scanner = new Scanner(System.in);
    
        //Declare variables
        double principal, rate, numCompounded, time;

        //initial principal
        System.out.println("\nWhat is the original amount of your loan? ");
        principal = scanner.nextDouble();

        //interest rate (as percentage)
        System.out.println("What is your interest rate percentage?");
        rate = (scanner.nextDouble())/100;

        System.out.println("How many times per year is your interest compounded?");
        numCompounded = scanner.nextDouble();

        //time in years
        System.out.println("What is the length of your loan in years? ");
        time = scanner.nextDouble();

    //close Scanner
    scanner.close();

    //calculation
    double totalPaid, totalInterest;

    totalPaid = principal * Math.pow(1 + (rate/numCompounded), time * numCompounded);
    totalInterest = totalPaid - principal;

    //print result

    // %$.2f is a placeholder with the formatting you want and is replaced by the arguments you pass

    System.out.printf("\nYour total paid is $%.2f and your total interest is $%.2f%n", totalPaid, totalInterest);

    }
    
}
