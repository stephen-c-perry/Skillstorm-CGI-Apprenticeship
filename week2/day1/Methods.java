package week2.day1;

public class Methods {
    
       /*
       For the each problems read the method declarations and write whether the method 
       is valid. If it is invalid, specify what is wrong with the method declaration. 
       
       Method 1:
       public static void main(String args[]) {
            System.out.println("Hello World");
        }
        Answer: Valid
        */
       
    public static void main(String[] args) { //Method 1
        System.out.print("Hello World");
    }

        /*
        Method 2:
        public String myMethod() {
            return "Something";
        }
        Answer: Valid
        */

    public String myMethod() { 
        return "Something";
    }

  
        /*
        Method 3:
        public static int addNumbers(int x, int y) {
           System.out.println(x + y);
        }
        Answer: Invalid, it's asking to return an int value but only prints the result
        */

    public static int addNumbers(int x, int y) { 
           return x + y;
    }

        /*
        Method 4:
        public double subtractNums(double x, double y, double z) {
            return "The answer is : " + (x + y + z);
        }
        Answer: Invalid, returning a string when it's expecting a double
        */
    
    public double subtractNums(double x, double y, double z) { 
        return x - y - z;
    }

        /* 
        Method 5:
        public static printMessage(String message) {
            System.out.println(message);
        }
        Answer: Invalid, expecting to return a String but only prints a string
        */

    public static String printMessage(String message) {
        return message; 
    }

        /* 
        Method 6:
        public static int() {
            return 5 + 5;
        }
        Answer: Invalid, no method name given
        */
    
    public static int fivePlusfive() {
        return 5 + 5;
    }

        /*
        Method 7:
        public static int value(short num1, short num2) {
            int answer = num1 * num2;
            return answer;
        }
        Answer: Valid
        */
    
    public static int value(short num1, short num2) {
        int answer = num1 * num2;
        return answer;
    }

        /*
        Bonus
        Copy the 7 methods into a file named Methods.java and fix all the methods to 
        make the code compile successfully. Submit your Methods.java file.
        */
    }

    
