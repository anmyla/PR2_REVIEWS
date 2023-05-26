package Inehritance_AbstractClass_AnimalWorld;

public class Giraffe extends Animal{

    protected int numbersOfSpots;

    public Giraffe(String name, int numberOfLegs, String eyeColor) {
        super(name, numberOfLegs, eyeColor);
        numbersOfSpots = 40;
    }

    public Giraffe(String name, int numberOfLegs, String eyeColor, int numbersOfSpots) {
        super(name, numberOfLegs, eyeColor);
        this.numbersOfSpots = numbersOfSpots;
    }

    public void showSpots() {
        System.out.println(getClass().getSimpleName()+ " " + name + " " + numbersOfSpots + " spots!");
    }

    @Override
    public void move(int meters) {
        System.out.println(getClass().getSimpleName()+ " " + name + " walked " + meters + " meters long.");

    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println(getClass().getSimpleName()+ " " + name + " " + withComment);
    }
}
