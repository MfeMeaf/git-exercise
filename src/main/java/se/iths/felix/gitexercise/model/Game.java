package se.iths.felix.gitexercise.model;

public class Game {
    String title;
    int age;

    public Game(String title, int age) {
        this.title = title;
        this.age = age;
    }

    @Override
    public String toString() {
        return title + " rated for ages of " + age + " and above";
    }
}
