package Inehritance_AbstractClass_AnimalWorld;

public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal(); //No instance of the class can be created from an ABSTRACT class


        System.out.println("----------------Upcasting/Down casting---------------------");
        Frog quaxi = new Frog("quaxi", 4,"green");
        Animal quaxiAsAnimal = quaxi; // upcast frog quaxi to animal
        quaxiAsAnimal = new Frog("quaxi" , 4, "green"); //downcast Animal quaxiAsAnimal to frog

        quaxi.makeNoise("croaks!");
        quaxi.move(7);



        Nature animals = new Nature();
        System.out.println("------------------------------------------");

        Giraffe georg = new Giraffe("Georg", 4, "brown", 20);
        Parrot paulie = new Parrot("Paulie", 2, "blue");

        georg.showSpots();

        //upcast georg to Animal object
        Animal g1 = georg;

        //add animals to an ArrayList
        Nature nature = new Nature();

        nature.add(g1);
        nature.add(paulie);

        nature.animalsMove();

    }
}
