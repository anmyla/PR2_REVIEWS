package Inehritance_AbstractClass_AnimalWorld;

public class Dog extends Animal{
    public Dog(String name, int numberOfLegs, String eyeColor) {
        super(name, numberOfLegs, eyeColor);
    }
    @Override

    public void move(int meters) {
        System.out.println(getClass().getSimpleName() + " runs really fast!");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println(getClass().getSimpleName()+ " " + name + " " + withComment);
    }
}
