package Flower.src;

public class Test1 {
    // Will the Test class compile and run? If not, will it fail to compile or
    // fail to run and why? Failed to compile
    // If it does compile and run, what will it print? What type of polymorphism
    // is it using? Overriding

    public static void main(String[] args) {
        Flower flower1 = new Rose("pink", "Damask", true);
        flower1.smell();
    }

}