import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        // scanner for user to input start and end
        Scanner in = new Scanner(System.in);
        System.out.println("What number do you want to start with? ");
        int start = in.nextInt();

        System.out.println("What number do you want to end with? ");
        int end = in.nextInt();

        in.close();

        //logic to decide which method to call
        if (start < end) {
            countByTwosIncreasing(start, end);
            
        } else if (start > end) {
            countByTwosDecreasing(start, end);
            
        } else
            System.out.println(start);


    }

    public static void countByTwosIncreasing(int start, int end) {
        // start += 2
        // stop when start == end
        for (; start <= end; start += 2)
            System.out.println(start);
    }

    public static void countByTwosDecreasing(int start, int end) {
        // start -= 2
        // stop when start == end
        for (; start >= end; start -= 2)
            System.out.println(start);

    }
}
