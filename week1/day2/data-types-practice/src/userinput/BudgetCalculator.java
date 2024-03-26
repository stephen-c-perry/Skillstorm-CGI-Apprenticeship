package userinput;

import java.util.Scanner;

public class BudgetCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
/*
Welcome to the Budget Calculator!
How much do you make a month? 1000000 [input prompt store as monthlyIncome]
*/

    System.out.print("\nWelcome to the Budget Calculator!\n");
    System.out.println("How much do you make per month?");
    float monthlyIncome = in.nextFloat();
    

// Now let's look at your expenses. [print statement]
    System.out.println("\nNow let's look at your expenses.\n");

// How much is your rent? 5000 [input prompt store as rent]
    System.out.print("How much is your rent?\n");
    float rent = in.nextFloat();

// How much is utilities? 500 [input prompt store as utilities]
    System.out.println("How much are utilities?");
    float utilities = in.nextFloat();

// How much is your car insurance? 50 [input prompt store as carInsurance]
    System.out.println("How much is your car insurance?");
    float carInsurance = in.nextFloat();

// [create expenses variable totaling expenses]
    float totalExpenses = rent + utilities + carInsurance;

// [create net income variable for monthly income - expenses]
    float netIncome = monthlyIncome - totalExpenses;

// [What percentage would you like to save? input prompt store as percentSave] 
    System.out.println("What percentage would you like to save? (Enter Whole Number Only)");
    float percentSave = in.nextFloat();

// You should save (your calculation here). [print netIncome * percentSave]
    System.out.printf("You should save: \n$%.2f\n", netIncome * (percentSave/100));

    in.close(); //release the memory resource that Java opened
    
    }
}
