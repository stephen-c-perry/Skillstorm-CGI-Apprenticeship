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

        int[] multi = { 1, 2, 3, 4, 5 };
        int[] single = { 1 };
        int[] empty = {};
        int[] nulls = null;

    }

    // Find Max method
    public static int findMax(int[] arr) {
        int maxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxValue) {
                maxValue = arr[i];
                System.out.println("The max value is: " + maxValue);
            }

        }
        return maxValue;
    }

}
