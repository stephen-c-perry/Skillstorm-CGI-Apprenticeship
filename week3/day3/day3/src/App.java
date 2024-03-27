import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Write a class called App.java to test your code by creating a TreasureBox
        // object and some Treasure objects. Add the Treasure objects to the
        // TreasureBox's contents array. Print out the TreasureBox using the toString
        // and using the .getContents() methods.
        
        //instantiating objects
        Treasure treasure1 = new Treasure("gold", "coin", 100);
        Treasure treasure2 = new Treasure("jewel", "ruby", 80);

        TreasureChest chest1 = new TreasureChest("wooden", true);
        Treasure[] contents = {treasure1, treasure2};
        
        chest1.setContents(contents);

        
        System.out.println(chest1.toString());
        System.out.println(Arrays.toString(chest1.getContents()));

    }
}
