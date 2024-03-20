import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayPractice {
    

    //Part 1 Step 1
    public static void main(String[] args) {
        //initial array
        String[] favoriteFoods = {"pizza", "burgers", "bbq"};
        System.out.println("\nMy favorite foods are: " + Arrays.toString(favoriteFoods));

        //Part 1 Step 2 replace items in first array
        favoriteFoods[1] = "chicken";
        favoriteFoods[2] = "sushi";
        System.out.println("\nMy new favorite foods are: " + Arrays.toString(favoriteFoods));

        //Part 1 Step 3 new array all the foods and some additional ones
        // String[] favoriteFoods2 = Arrays.copyOf(favoriteFoods, favoriteFoods.length + 3);
        String[] newFoods = {"tacos", "cookies", "pasta", "burgers", "bbq"}; //new array of foods I want to add
        String[] allFoods = Stream.of(favoriteFoods, newFoods).flatMap(Stream::of).toArray(String[]::new);
            // found here: https://www.benchresources.net/java-8-how-to-merge-or-concatenate-2-arrays-using-stream-api/        //

        System.out.println("\nHere's all of my favorite foods: " + Arrays.toString(allFoods));   

        //Part 1 Step 1 method testing
        int[] test1 = {1, 2, 3};
        int[] test2 = {1};
        System.out.println("The last element is: " + getLastElement(test1));
        System.out.println("The last element is: " + getLastElement(test2));

        //Bonus
        int[] test3 = {};
        int[] test4 = null;
        System.out.println("The last element is: " + getLastElement(test3));
        System.out.println("The last element is: " + getLastElement(test4));
    }


    //Part 2 Step 1 create new method that takes in an array and returns the last element


    public static int getLastElement(int[] array){
        if (array == null || array.length == 0){
            System.out.println("The array you passed is invalid.  Try again.");
            return -1;
        }
            
            else if (array.length == 1){
                return array[0];
            }
            
            else {
                return array[array.length - 1];}
            //test in main method with provided arrays
            
    
            }
}