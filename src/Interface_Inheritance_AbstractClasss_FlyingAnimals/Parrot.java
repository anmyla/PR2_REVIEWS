package Interface_Inheritance_AbstractClasss_FlyingAnimals;

public class Parrot extends Animal1
implements FlyingAnimal {
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

    @Override
    public void fly(int meters) {
        System.out.println(getClass().getSimpleName()+ " " + name + " flew " + meters + " meters away.");
    }
}
