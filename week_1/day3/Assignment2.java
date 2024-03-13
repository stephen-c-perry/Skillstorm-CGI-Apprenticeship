public class Assignment2 {
    
    /*
     * After comparing results I can see that I do not fully understand how modulo works.
     * A lot of this code is commented out just to get it to run.  
     * Submitting incomplete because of time but I'll keep working on it.
     */



    public static void main(String[] args) {
    
        System.out.println("\nUsing Remainder Operator:");

        System.out.println("1: " + (int) 5 + 7 % 6);
        System.out.println("2: " + (int) 12 % 6);
        System.out.println("3: " + (int) 6 % 12);
        System.out.println("4: " + (int) 3 % 5);
        System.out.println("5: " + (int) 5 % 3);
        System.out.println("6: " + (int) 5 % 5);
        System.out.println("7: " + (int) -1 % 2);
        System.out.println("8: " + (int) 1 % -2);
        System.out.println("9: " + (int) -1 % -2);
        System.out.println("10: " + (int) 0 % 2);
        //System.out.println("11: " + (int) 2 % 0);
        System.out.println("12: " + (int) 6 * 2 % 6);
        System.out.println("13: " + (int) 12 % 4);
        System.out.println("14: " + (int) 7 % 3 % 2);

        System.out.println("\nOrder of Operations:");

        System.out.println("1: " + (int) 5 * (3 - 2));
        // System.out.println("2: " + (int) 10 - 12 * 2);
        // System.out.println("3: " + (int) 5 + 2 * 3);
        // System.out.println("4: " + (int) 7 + 2 * 3 / 5 - 1);
        // System.out.println("5: " + (int) 18 / 3 % 7 * (4 + 1));

        System.out.println("Integer Arithmetic:");

        System.out.println("1: " + (int) 15 / 3 / 5);
        System.out.println("2: " + (int) 1 / 2);
        System.out.println("3: " + (int) 3 / 4);
        System.out.println("4: " + (int) 4 / 3);
        System.out.println("5: " + (int) Integer.MAX_VALUE + 1);
        //System.out.println("6: " + (int) Integer.MIN_VALUE - 1);
        System.out.println("7: " + (int) Integer.MAX_VALUE + Integer.MIN_VALUE);
        System.out.println("8: " + (int) Short.MAX_VALUE + 1);
        //System.out.println("9: " + (int) Short.MIN_VALUE - 1);
        System.out.println("10: " + (int) Short.MAX_VALUE + Short.MIN_VALUE);

        System.out.println("Type Casting:");

        // System.out.println("1: " + (int) 7.9 - 3);
        // System.out.println("2: " + (int) 84.3 / (int) 2.8);
        // System.out.println("3: " + (byte) 1000 - 10);
        // System.out.println("4: " + (short) 100000);
        // System.out.println("5: " + (long) 10 + -10);


    }


}