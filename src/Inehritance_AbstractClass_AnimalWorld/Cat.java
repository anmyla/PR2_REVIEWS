package Inehritance_AbstractClass_AnimalWorld;

public class Cat extends Animal {
    public Cat(String name, int numberOfLegs, String eyeColor) {
        super(name, numberOfLegs, eyeColor);
    }


    @Override
    public void move(int meters) {

        System.out.println(getClass().getSimpleName() + " creeps slowly");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println(getClass().getSimpleName()+ " " + name + " " + withComment);
    }

}