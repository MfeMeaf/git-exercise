package se.iths.felix.gitexercise;

import se.iths.felix.gitexercise.model.Animal;
import se.iths.felix.gitexercise.model.Car;
import se.iths.felix.gitexercise.model.City;
import se.iths.felix.gitexercise.model.Book;
import se.iths.felix.gitexercise.model.Game;
import se.iths.felix.gitexercise.model.Movie;


public class Main {
    static void main() {

        Animal animal1 = new Animal("Python regius", "Ball Python");
        Animal animal2 = new Animal("Lampropeltis getula", "King Snake");

        Car car1 = new Car("Honda", "Civic");
        Car car2 = new Car("Ford", "Mustang");

        City city1 = new City("Burlington", 44000);
        City city2 = new City("Burlington", 84000);

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
                   
        IO.println("""
                
                Animals
                """ + animal1 + "\n" + animal2);
        IO.readln("Press enter to continue");
                                      
        IO.println("""
                
                Cars
                """ + car1 + "\n" + car2);
                   
        IO.readln("Press enter to continue");
        IO.println("""
                
                Cities
                """ + city1 + "\n" + city2);
        IO.readln("Press enter to continue");


    }
}
