package se.iths.felix.gitexercise.model;

public class Movie {
    String title;
    int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return title + " release year: " + releaseYear;
    }
}
