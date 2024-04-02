import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome, enter a radius for the circle: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        Circle circle = new Circle(radius);
        System.out.println(circle);
        scanner.close();
    }

}