package Inehritance_AbstractClass_AnimalWorld;

public abstract class Animal {  //dont forget to put abstract here whenever we have an abstract method within the class
    protected String name;
    protected int numberOfLegs;
    protected String eyeColor;

    public Animal(String name, int numberOfLegs, String eyeColor) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.eyeColor = eyeColor;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void printAnimalDescription(){
        System.out.println(name + " has " + numberOfLegs + " legs and " + eyeColor + " as an eye color.");
    }

    public abstract void move(int meters);

    public abstract void makeNoise(String withComment);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
