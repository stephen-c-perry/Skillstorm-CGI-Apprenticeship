package com.skillstorm;

public class Cat {

    //static properties
    private static String species = "feline";

    //instance properties
    private String name;
    private int weight;


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Cat.species = species;
    }


    // Constructors
    public Cat(){
        this.name = "Fluffy";
        this.weight = 10;
    }

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    //Other methods
    
    // Override methods
    @Override
    public String toString(){
        return "Cat named " + this.name + " weighs " + this.weight + " pounds";

    }

    //version 1
    @Override
    public boolean equals(Object obj) {
        if (obj == this) // if the address is the same then save time and don't run content comparison
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Cat)) // or use obj,getClass() == this.getClass()
            return false;
        Cat other = (Cat) obj;
        if (!this.name.equals(other.name))
            return false;
        if (this.weight != other.weight)
            return false;
        return true;

    }

    //Java compiler
    // - checks semicolons and curly braces
    // - checks data taypes - are all values stored in the correct variable type
    // - checks methods exist on the referecne type they are called with
    // - 



}
