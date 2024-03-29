package com.skillstorm;

public class EqualsExamples {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new BigCat();
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat1.equals(cat2));

        // Object cat3 = new Cat();
        // System.out.println(cat3 instanceof Object);
        // System.err.println(cat3 instanceof Cat);
        // System.err.println(cat3.getClass() == cat1.getClass());

    }




}
