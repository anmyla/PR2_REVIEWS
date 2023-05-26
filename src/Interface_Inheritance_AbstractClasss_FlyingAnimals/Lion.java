package Interface_Inheritance_AbstractClasss_FlyingAnimals;

public class Lion extends Animal1 {
    public Lion(String name, int numberOfLegs, String eyeColor) {
        super(name, numberOfLegs, eyeColor);
    }


    @Override
    public void move(int meters) {
        System.out.println(getClass().getSimpleName() + " creeps!");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println(getClass().getSimpleName()+ " " + name + " " + withComment);
    }
}
