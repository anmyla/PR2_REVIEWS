package Interface_Inheritance_Rabbits;

public class Rabbit implements GoesToParty{
    protected String name;

    protected Rabbit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println(name+ " sleeps.");
    }
    public void hop(){
        System.out.println(name+ " hops.");
    }
    public void eat(String food){
        System.out.println(name + " eats " + food);
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(getClass().getSimpleName() +" " + name + " goes to the party and eats " + cake+ " and drinks " + drink);
    }
}
