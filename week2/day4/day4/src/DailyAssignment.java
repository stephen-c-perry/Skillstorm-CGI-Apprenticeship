import java.util.ArrayList;

public class DailyAssignment {
    public static void main(String[] args) {
        /*
         * A main method where you call findMax with
         * null instead of an array
         * An empty array
         * An array with one element
         * An array with more than one element
         */

        int[] multi = { 10, 50, 20, 40, 100 };
        int[] single = { 77 };
        int[] empty = {};
        int[] nulls = null;

        int multiMax = findMax(multi);
        int singleMax = findMax(single);
        int emptyMax = findMax(empty);
        int nullsMax = findMax(nulls);

    }

    // Find Max method
    public static int findMax(int[] arr) {
        int maxValue = 0;

        if (arr == null || arr.length == 0) {
            System.out.println("Array is null or empty.  Try again.");
        } else
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxValue) {
                    maxValue = arr[i];
                    // System.out.println("The max value is: " + maxValue);
                    // Had a bug here where each element was printing
                    // moved sysout two levels outside
                    // return maxValue;
                }

            }
        System.out.println("The max value is: " + maxValue);
        return maxValue;

    }

}
