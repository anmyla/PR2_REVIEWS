package Interface_Inheritance_Rabbits;

public class ChristmasRabbit extends Rabbit {

    public ChristmasRabbit(String name) {
        super(name);
    }

    public void bringsGifts() {
        System.out.println(getName() + " brings Christmas gifts!");
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(getClass().getSimpleName() +" " + name + " and brings plenty of gifts to the party!");
    }
}
