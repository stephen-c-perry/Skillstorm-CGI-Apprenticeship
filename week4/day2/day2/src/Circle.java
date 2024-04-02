public class Circle {

    double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new InvalidSizeException("radius must be greater than zero");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new InvalidSizeException("radius must be greater than zero");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "radius = " + radius;
    }

}