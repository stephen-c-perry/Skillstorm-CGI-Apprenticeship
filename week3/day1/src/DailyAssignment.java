public class DailyAssignment {
    public static void main(String[] args) {
        printOdds();
        sum10();
        factorial(10);
        System.out.println(reverse("superman"));
        System.out.println(stickyCaps("TestingItOut"));
    }

    /*
     * Part 1: Warmup
     * Let's start easy with a variation on a previous example: Print out the
     * numbers 1 inclusive to 101 exclusive counting by 2's
     */

    public static void printOdds() {
        for (int n = 1; n < 101; n += 2)
            System.out.println(n);
    }

    // Now let's up the ante and start adding some functionality to the loop. Using
    // a for loop, add up the numbers 1 to 10.
    public static void sum10() {
        int total = 0;
        for (int n = 1; n < 11; n++)
            total += n;
        System.out.println(total);
    }

    // Using a for loop, find the factorial of the given number. (Hint: multiply the
    // numbers in the loop)

    // Factorial of 3 is 3 * 2 * 1

    // Factorial of 10 is 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 etc.

    public static void factorial(int n) {
        int total = 1;
        for (int j = n; j > 0; j--)
            total *= j;
        System.out.println(total);
    }

    /*
     * Part 2: Challenge Problems Using a loop reverse the letters in a String. Make
     * sure to return the new String.
     */

    public static String reverse(String s) {
        char[] letters = s.toCharArray();
        String reversed = "";

        for (int i = letters.length - 1; i >= 0; i--) {
            reversed += letters[i];
        }
        return reversed;
    }

    // Using a loop, capitalize every other letter in a String.

    public static String stickyCaps(String s) {
        char[] stringInArray = s.toCharArray();

        for (int i = 0; i < stringInArray.length; i += 2) {
                stringInArray[i] = Character.toUpperCase(stringInArray[i]);
        }
        return new String(stringInArray);
    }

}
