package Inehritance_AbstractClass_AnimalWorld;

public class Parrot extends Animal {
    public Parrot(String name, int numberOfLegs, String eyeColor) {
        super(name, numberOfLegs, eyeColor);
    }

    @Override
    public void move(int meters) {
        System.out.println(getClass().getSimpleName()+ " " + name + " flew " + meters + " meters away.");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println(getClass().getSimpleName()+ " " + name + " " + withComment);
    }
}
