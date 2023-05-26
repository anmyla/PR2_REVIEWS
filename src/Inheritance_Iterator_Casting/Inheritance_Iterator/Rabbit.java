package Inheritance_Iterator_Casting.Inheritance_Iterator;

public class Rabbit {
    private String name;

    public Rabbit(String name) {
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
}
