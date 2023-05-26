package Interface_Inheritance_AbstractClasss_FlyingAnimals;

import java.util.ArrayList;

public class Nature {
    ArrayList<Animal1> animals = new ArrayList<>();
    ArrayList<FlyingAnimal> flyingAnimals = new ArrayList<>();

    public void add(Animal1 animal) {
        animals.add(animal);
    }

    public void addFlyingAnimal(FlyingAnimal flyingAnimal) {
        flyingAnimals.add(flyingAnimal);
    }

    public void animalsMove() {
        for (Animal1 a : animals) {
            a.move(100);
        }
    }

    public void animalsFly() {
        for (FlyingAnimal a : flyingAnimals) {
            a.fly(100);
        }
    }
}
