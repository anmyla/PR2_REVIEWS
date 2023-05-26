package Inheritance_Iterator_Casting.Inheritance_Casting_Animals;

public class Beagle extends Dog {
    public String favFood;

    //if we have a default constructor Dog(), this default constructor
    //will be automatically called  and if we don't have, we have to use super (....) to explicitly
    // use the constructor of our choice (in case there are more than one constructor).
    // Naming: name1 and age1 are intentionally named differently to illustrate
    // that we can name the variables differently from the Object.
    public Beagle(String name1, int age1, String favFood) {
        super(name1, age1);
        this.favFood = favFood;
    }

    public void eatsLovedFood(){
        System.out.println(getName() + " (" + age + ") isst gern " + favFood + ".");
    }

    //method overriding
    @Override
    public void bark(String wuff) {
        System.out.println(getName() + " barks and complains " +  wuff);
    }
}
