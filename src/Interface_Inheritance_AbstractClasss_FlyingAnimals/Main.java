package Interface_Inheritance_AbstractClasss_FlyingAnimals;

public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal(); //No instance of the class can be created from an ABSTRACT class


        System.out.println("----------------Upcasting/Down casting---------------------");
        Frog quaxi = new Frog("quaxi", 4,"green");
        Animal1 quaxiAsAnimal = quaxi; // upcast frog quaxi to animal
        quaxiAsAnimal = new Frog("quaxi" , 4, "green"); //downcast Animal quaxiAsAnimal to frog

        quaxi.makeNoise("croaks!");
        quaxi.move(7);



        Nature animals = new Nature();
        System.out.println("------------------------------------------");

        Giraffe georg = new Giraffe("Georg", 4, "brown", 20);
        Parrot paulie = new Parrot("Paulie", 2, "blue");
        Eagle aldous = new Eagle("Aldous", 2, "brown");

        georg.showSpots();

        //upcast georg to Animal object
        Animal1 g1 = georg;

        //add animals to an ArrayList
        Nature nature = new Nature();
        nature.add(g1);
        nature.add(paulie);
        System.out.println("--------------------Animal Override Move Method----------------------");
        nature.animalsMove();

        System.out.println();
        System.out.println("--------------------INTERFACES----------------------");

        //ArrayList for FlyingAnimals
        Nature flyingAnimals = new Nature();

        //add birds to the flying animals' ArrayList
        flyingAnimals.addFlyingAnimal(paulie);
        flyingAnimals.addFlyingAnimal(aldous);

        flyingAnimals.animalsFly();
    }
}
