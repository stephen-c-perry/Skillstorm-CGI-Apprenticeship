public class Circle {

    /*
     * Step 1. Create a class, Circle, that describes the properties and
     * calculations for working with circles. These circles should store pertinent
     * data and be able to perform operations such as calculating the diameter,
     * circumference, and area.
     */

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getCircumference() {
        return 2 * Math.Pi * radius;
    }



    /* Step 2. In a separate class, create a main method. Instantiate 2 circle
     * 
     * Requirements:
     * 
     * Contains useful methods calculating a circle's diameter, circumference, and
     * area.
     * Be able to create a Circle object by either providing a radius, or, if none
     * is provided, creates a circle with some default radius instead.
     * Have the ability to create multiple Circle objects and have their data be
     * independent of one another.
     * Fully encapsulate the class
     * Bonus Challenge:
     * 
     * Create a method that compares one Circle object with another and determine
     * whether they're equal or not.
     * Push your code to GitHub and provide a link instead of uploading your .java
     * file.
     */

}
