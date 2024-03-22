public class DailyAssignment {
    public static void main(String[] args) {

        /*
         * Assignment Instructions:
         * Today we learned about while loops, do-while loops, break, and continue. Now
         * it's time to apply what you've learned by predicting what each loop will
         * print out. Be careful and look out for infinite loops and loops that never
         * run. For example, given the loop:
         */
        
        // Loop 1:
        // Prediction: prints 10,11,12,13,14... "infinite" loop
        int count = 10;

        while (count > 0) {
            System.out.println(count);
            count += 1;
        }
        //////////////////
        // Loop 2:
        // Prediction: prints the integer 3 because it searches the array and looks for the index value of the string "Waldo"
        String[] people = { "Bob", "Sue", "Wendy", "Waldo", "Santa", "Nemo" };

        int wheresWaldo = -1;
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Waldo"))
                wheresWaldo = i;
        }

        System.out.println(wheresWaldo);

        //////////////////
        // Loop 3:
        // Prediction:  Prints bool false because none of the chars in team are == i so iInTeam is not assigned a new value
        boolean iInTeam = false;

        for (char c : "team".toCharArray()) {
            if (c == 'i')
                iInTeam = true;
        }

        System.out.println(iInTeam);

        //////////////////
        // Loop 4:
        // Prediction: Prints odd numbers 1 through 9 because when if statement finds an even number the loop resets.  print line only executes on odd numbers
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }

        //////////////////
        // Loop 5:
        // Prediction: prints 0 through 8 in increments of 2.  10 is not printed because the operate is less than and not less than or equal to
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);

        }

        //////////////////
        // Loop 6:
        // Prediction: The for loop never runs because the first condition is never true
        for (int i = 100; i < 0; i--) {
            System.out.println(i);

        }

        //////////////////
        // Loop 7:
        // Prediction: Prints the int 1 because countOfDucks++ is outside the scope of the for loop, for loop runs until it gets to goose then ends, countOfDucks++ runs one time then the print statement 
        String[] birds = {"duck", "duck", "duck", "goose", "duck", "duck"};
        int countOfDucks = 0;

        for (String bird : birds) {
            if (bird.equals("goose")) {
                break;
            }
            countOfDucks++;
        }

        System.out.println("There are " + countOfDucks + " ducks.");
    }

}
