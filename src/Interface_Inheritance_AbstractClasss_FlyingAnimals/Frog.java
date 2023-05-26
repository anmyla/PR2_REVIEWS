package Interface_Inheritance_AbstractClasss_FlyingAnimals;

public class Frog extends Animal1 {
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
