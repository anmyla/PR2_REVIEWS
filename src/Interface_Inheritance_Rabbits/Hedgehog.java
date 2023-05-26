package Interface_Inheritance_Rabbits;

public class Hedgehog implements GoesToParty{

    String name;

    public Hedgehog(String name) {
        this.name = name;
    }

    public void bringsGifts() {
        System.out.println(getClass().getSimpleName()+ name + " brings Christmas gifts!");
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(getClass().getSimpleName() +" " + name + " just went to the party and chilled!");
    }
}
