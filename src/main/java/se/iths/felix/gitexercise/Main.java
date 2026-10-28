package se.iths.felix.gitexercise;

import se.iths.felix.gitexercise.model.Animal;
import se.iths.felix.gitexercise.model.Car;
import se.iths.felix.gitexercise.model.City;

public class Main {
    static void main() {

        Animal animal1 = new Animal("Python regius", "Ball Python");
        Animal animal2 = new Animal("Lampropeltis getula", "King Snake");

        Car car1 = new Car("Honda", "Civic");
        Car car2 = new Car("Ford", "Mustang");

        City city1 = new City("Burlington", 44000);
        City city2 = new City("Burlington", 84000);

    }
}
