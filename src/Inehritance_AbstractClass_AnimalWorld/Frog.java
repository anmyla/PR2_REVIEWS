package Inehritance_AbstractClass_AnimalWorld;

public class Frog extends Animal{
    public Frog(String name, int numberOfLegs, String eyeColor) {
        super(name, numberOfLegs, eyeColor);
    }


    @Override
    public void move(int meters) {
        System.out.println(getClass().getSimpleName() + " jumps!");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println(getClass().getSimpleName()+ " " + name + " " + withComment);
    }
}
