public class GasTank {

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
    public String toString() {
        return "GasTank [GALLONS=" + GALLONS + ", gas=" + gas + "]";
    }
}