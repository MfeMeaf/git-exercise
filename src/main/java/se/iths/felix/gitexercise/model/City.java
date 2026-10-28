package se.iths.felix.gitexercise.model;

public class City {
    private String name;
    private int population;

    @Override
    public String toString() {
        return name + "with a population of" + population;
    }

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
