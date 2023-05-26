package Inehritance_AbstractClass_AnimalWorld;

import java.util.ArrayList;

public class Nature {
    ArrayList<Animal> animals = new ArrayList<>();

    public void add(Animal animal) {
        animals.add(animal);
    }


    public void animalsMove() {
        for (Animal a : animals) {
            a.move(100);
        }
    }

}
