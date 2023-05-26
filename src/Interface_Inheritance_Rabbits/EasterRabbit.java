package Interface_Inheritance_Rabbits;

public class EasterRabbit extends Rabbit {

    public EasterRabbit(String name) {
        super(name);
    }

    public void bringsEasterEggs() {
        System.out.println(getName() + " brings Easter eggs!");
    }
    public void hidesEsterEggs() {
        System.out.println(getName() + " hides easter eggs!");
    }

    @Override
    public void hop() {
        System.out.println(getName() + " hops through the forest!");
    }
}
