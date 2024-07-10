package main;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public void AddAnimal(Animal animal) {
        animals.add(new Animal(animal.species, animal.name, animal.age));
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.species + ": " + animal.name + ", " + animal.age + " vuotta");
        }
    }

    public void runAnimals(int laps) {
        int lapsAtStart = laps;
        for (Animal animal : animals) {
            while (laps-- > 0){
                System.out.println(animal.name + " juoksee kovaa vauhtia!");
            }
            laps = lapsAtStart;
        }
    }
    
}
