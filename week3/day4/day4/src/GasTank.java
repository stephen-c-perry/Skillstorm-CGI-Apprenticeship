public class GasTank implements Fillable {

    private final double GALLONS;

    private double gas;

    public GasTank(double gallons) {
        this.GALLONS = gallons;
    }

    public double getGALLONS() {
        return GALLONS;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public GasTank(double gALLONS, double gas) {
        GALLONS = gALLONS;
        this.gas = gas;
    }

    @Override
    public void fill() {
        gas = GALLONS;
        throw new UnsupportedOperationException("Unimplemented method 'fill'");
    }

    @Override
    public void empty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'empty'");
    }

    @Override
    public void fill(double quantity) {
        this.gas = quantity;
        throw new UnsupportedOperationException("Unimplemented method 'fill'");
    }

    @Override
    public void empty(double quantity) {
        this.gas = quantity;
        throw new UnsupportedOperationException("Unimplemented method 'empty'");
    }

    @Override
    public String toString() {
        return "GasTank [GALLONS=" + GALLONS + ", gas=" + gas + "]";
    }
}