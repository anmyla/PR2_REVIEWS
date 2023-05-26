package Inheritance_Iterator_Casting.Inheritance_Iterator;

public class ChristmasRabbit extends Rabbit {

    public ChristmasRabbit(String name) {
        super(name);
    }

    public void bringsGifts() {
        System.out.println(getName() + " brings Christmas gifts!");
    }
}
