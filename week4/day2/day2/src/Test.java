import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Welcome, enter a radius for the circle: ");
            double radius = in.nextDouble();
            in.nextLine();
            Circle circle = new Circle(radius);
            System.out.println(circle);
            in.close();
        } catch (InvalidSizeException e) {
            System.out.println("radius must be greater than zero");
            System.out.println("Here is an alternative circle");
            Circle alternativeCircle = new Circle(1.0);
            System.out.println(alternativeCircle);
        } catch (InputMismatchException c) {
            System.out.println("Enter a number greater than zero");

        }
    }

}