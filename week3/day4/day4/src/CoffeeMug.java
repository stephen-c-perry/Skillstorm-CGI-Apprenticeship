public class CoffeeMug {

    private final double OUNCES;

    private double coffee;

    public CoffeeMug(double ounces) {
        this.OUNCES = ounces;
    }

    public double getOUNCES() {
        return OUNCES;
    }

    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public CoffeeMug(double oUNCES, double coffee) {
        OUNCES = oUNCES;
        this.coffee = coffee;
    }

    @Override
    public String toString() {
        return "CoffeeMug [OUNCES=" + OUNCES + ", coffee=" + coffee + "]";
    }

}