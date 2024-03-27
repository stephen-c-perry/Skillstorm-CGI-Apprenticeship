public class Shape {

    // properties
    int sides;
    double area;
    String color;

    // getters and setters
    public int getSides() {
        return sides;
    }
    public void setSides(int sides) {
        this.sides = sides;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // methods
    @Override
    public String toString() {
        return "Shape [sides=" + sides + ", area=" + area + ", color=" + color + "]";
    }

    // constructor
    public Shape(int sides, double area, String color){
        this.sides = sides;
        this.area = area;
        this.color = color;
    }
        



}
