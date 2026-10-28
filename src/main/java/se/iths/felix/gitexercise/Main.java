package se.iths.felix.gitexercise;

import se.iths.felix.gitexercise.model.Book;
import se.iths.felix.gitexercise.model.Game;
import se.iths.felix.gitexercise.model.Movie;

public class Main {
    static void main() {
        Book dougdoug = new Book("DOUG: A DougDoug story", "Doug Doug");
        Book kebabBook = new Book("Kebab: A story of love", "Felix");

        Game coolGame = new Game("Amazing shooter game", 18);
        Game theBestGame = new Game("Baldurs Gate 3", 18);

        Movie projectHailMary = new Movie("Project Hail Mary", 2026);
        Movie shrekMovie = new Movie("Shrek", 2001);

        // Books
        IO.println("""
                
                Books
                """ + dougdoug + "\n" + kebabBook);
        IO.readln("Press enter to continue");
        IO.println("""
                
                Games
                """ + coolGame + "\n" + theBestGame);
        IO.readln("Press enter to continue");

        IO.println("""
                
                Movies
                """ + projectHailMary + "\n" + shrekMovie);
        IO.readln("Press enter to continue");


    }
}
