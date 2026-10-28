package se.iths.felix.gitexercise.model;

public class Animal {
    private String name;
    private String species;

    @Override
    public String toString() {
        return name + "of" + species;
    }

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
