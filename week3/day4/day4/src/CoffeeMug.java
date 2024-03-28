public class CoffeeMug implements Fillable {

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

    @Override
    public void fill() {
        //
        throw new UnsupportedOperationException("Unimplemented method 'fill'");
    }

    @Override
    public void empty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'empty'");
    }

    @Override
    public void fill(double quantity) {
        this.coffee = quantity;
        throw new UnsupportedOperationException("Unimplemented method 'fill'");
    }

    @Override
    public void empty(double quantity) {
        this.coffee = quantity;
        throw new UnsupportedOperationException("Unimplemented method 'empty'");
    }

}