package variables; // reverse domain name for packages

public class Declarations {// capitalize class name
    
    // I can store data and methods in my class
    static int x; //static keyword means it belongs to the class
                  // default acccess is only classes inside the same package can use this
    public static char[] y;

    //methods

    /*
     * public - means anyone can use this
     * static - means this belongs to the class
     * void - no data returned
     * main - name
     * String[] - data type of input
     * args - name of parameter
    */

    public static void main(String[] args) { // parameters must have data type and name just like variable declarations
        System.out.println("Good morning");
        System.out.println("Today is awesome!");
        System.out.println(x);

        // 3 Ways to Declare and Initialize variables
        // Declaration

        int z;
        z = 3;

        // Declare and initialize in one step
        int a = 123;

        // Mulitiple variables of the same type
        int b, c, d;
        b = 2;
        c = 3;
        d = 10000;

        // Multiple variables of same types
        int e= 5, f = 6;

    // public static void doStuff(){
    //     System.out.println("x is " + x)

    // }
    // Integer declarations
    // Printing out the smalles and largest int use the Integer class
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int someValue = Integer.MIN_VALUE + Integer.MAX_VALUE;
        System.out.println(someValue);

        //Integer overflow
        int overflowresult = Integer.MAX_VALUE + 1;
        System.out.println(overflowresult);

        int tooSmallOverflow = Integer.MIN_VALUE - 1;
        System.out.println(tooSmallOverflow);
    }
}
