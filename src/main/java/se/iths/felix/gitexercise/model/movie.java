package se.iths.felix.gitexercise.model;

public class movie {
    String title;
    int releaseYear;

    public movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return title + " release year: " + releaseYear;
    }
}
