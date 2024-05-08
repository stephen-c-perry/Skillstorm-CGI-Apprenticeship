package com.skillstorm.demo.models;

public class Country {

    private int id;

    private long population;

    private String name;

    private Continent continent;

    public Country() {

    }

    public Country(long population, String name, Continent continent) {
        this.population = population;
        this.name = name;
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

}
