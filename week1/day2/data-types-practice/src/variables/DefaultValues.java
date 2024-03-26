package variables;

public class DefaultValues {

        // variables inside methods only exist in the class (inside the curly braces)
        // local variables - do not get default values, you MUST assign value before using them
        // these class variables are known as fields and 

        static byte b;
        static short s;
        static int i;
        static long l;
        static float f; // less accurate, only has 7 decimal places
        static double d;
        static char c;

        public static void main(String[] args) {
            //print default values
            System.out.println("b = " + b); // string concatenation = chain together
            System.out.println("s = " + s); // string concatenation = chain together
            System.out.println("i = " + i); // string concatenation = chain together
            System.out.println("l = " + l); // string concatenation = chain together
            System.out.println("f = " + f); // string concatenation = chain together
            System.out.println("d = " + d); // string concatenation = chain together
            System.out.println("c = " + c); // string concatenation = chain together

        }
}

