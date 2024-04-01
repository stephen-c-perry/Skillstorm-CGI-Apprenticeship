package Flower.src;

public class Test2 {
    // Will the Test class compile and run? If not, will it fail to compile or fail
    // to run and why? Will not compile.  Rose is a child of Flower, can not assign parent to child
    // If it does compile and run, what will it print? What type of polymorphism is
    // it using?

    public static void main(String[] args) {
        Rose flower2 = new Flower("yellow", "sunflower");
        flower2.smell();
    }
}
