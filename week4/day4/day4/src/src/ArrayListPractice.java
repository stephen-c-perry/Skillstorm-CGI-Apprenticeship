package src;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> favoriteFoods = new ArrayList<>();

        //adding foods to new ArrayList
        favoriteFoods.add("Hamburger");
        favoriteFoods.add("Pizza");
        favoriteFoods.add("Mashed Potatoes");
        favoriteFoods.add("Grilled Cheese");
        favoriteFoods.add("Chicken Pot Pie");
        System.out.println(favoriteFoods);

        //changing some of the foods
        favoriteFoods.set(3, "Collards");
        favoriteFoods.set(2, "Fried Okra");
        System.out.println(favoriteFoods);

        //adding more foods, extending arraylist
        favoriteFoods.add("Pizza");
        favoriteFoods.add("Mashed Potatoes");
        favoriteFoods.add("Chopped Brisket");
        favoriteFoods.add("Tacos");
        System.out.println(favoriteFoods);

        //testing Programmer class
        Programmer programmer = new Programmer("Tom", "Java", "CGI");
        System.out.println(programmer.toString()); //Why is this printining memory address?



    }
}
