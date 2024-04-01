public class Flower {
    private String color;
    private String name;

    public Flower(String color, String name) { 
        this.color = color; 
        this.name = name; 
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }

    public void smell() { 
        System.out.printf("This %s %s flower smells good!%n", this.color, this.name);
    }

}

class Rose extends Flower {
    boolean thorny;

    public Rose(String color, String name, boolean thorny) { 
        super(color, name); 
        this.thorny = thorny; 
    }

    public void smell() { 
        System.out.printf("This %s %s rose smells good!%n", this.getColor(), this.getName());
    }

    public void smell(boolean bloomed) {
        if (!bloomed) {
            System.out.printf("This %s %s rose does not smell like anything%n", getColor(), getName());
        } else {
            smell();
        }
    }

}

/*
 * 
 * Answer the following questions about the Test1, Test2, and Test3 classes:

Will the Test class compile and run? If not, will it fail to compile or fail to run and why?
If it does compile and run, what will it print? What type of polymorphism is it using?


 */

//  public class Test1 {

//     public static void main(String[] args) {
//         Flower flower1 = new Rose("pink", "Damask", true); 
//         flower1.smell();
//     }

// }

// public class Test2 {

//     public static void main(String[] args) {
//         Rose flower2 = new Flower("yellow", "sunflower");
//         flower2.smell();
//     }
// }

// public class Test3 {

//     public static void main(String[] args) {
//         Rose flower3 = new Rose("pink", "heirloom", false); 
//         flower3.smell(false);
//     }

// }