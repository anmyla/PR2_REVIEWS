package Inheritance_Iterator_Casting.Inheritance_Casting_Animals;

public class Main {
    public static void main(String[] args) {
        //** Start -Does not have anything to do with Inheritance -Excurs static//
        //static attribute can be used without object or instance
        //call static method from another class is possible even without generating an instance of the object first
//          System.out.println(Dog.latinName);
//          Dog.printLatinName();
        //** End -Does not have anything to do with Inheritance -Excurs static//

        Beagle snoopy = new Beagle("Snoopy", 30, "Lasagna");
        snoopy.eatsLovedFood();

        //using an override method : Beagles has a bark() that override Dog's bark()
        snoopy.bark("auuuuu");

        //using a normal (not override) Dog's bark()
        Dog d = new Dog("Baxter", 27);
        d.bark("wuff wuff");

        //downcasting and upcasting
        Beagle freddie = new Beagle("Freddie", 5, "gulasch");
        //upcasting
        Dog doggo = freddie;


        //freddie will bark like a Beagle because he is and instance of a Beagle
        // and Beagle Object has an overrride of the method bark() from the Dog Object.
        freddie.bark("auuuu");

        //downcasting (Warning!!!!)
        Dog doggo2 = new Beagle("Hubert", 4, "Spaghetti");
        //we want to know what his favorite food is.
        Beagle b1 = (Beagle) doggo2; // casting only because we know that doggo us really a Beagle

        ((Beagle) doggo2).eatsLovedFood();
        b1.eatsLovedFood();

        // _________________________________________________________ DAY 3_______________________________________________________________________

        Dog d1 = new Beagle("text1", 5, "spaghetti");

        d1.bark("wuff");

        KommissarRex kr = new KommissarRex(5);

//upcasting
        Dog d2 = kr;
        d2.bark("wuff wuff");

//downcasting: referenzen einer BasisKlasse auf kindklasse casten
        Beagle beagle1 = (Beagle) d1;
        beagle1.eatsLovedFood();

//It won't work because the KommisarX instance cannot be casted to beagle
//        Beagle beagle2 = (Beagle) d2;
//        beagle2.eatsLovedFood();



        if(d1 instanceof Dog) {
            System.out.println("yayy ist ein Hund");
        }

        if (d1 instanceof Beagle) {
            System.out.println("yaay ist ein Beagle");

            Beagle b2 = (Beagle) d1;
        }

        //nicht so schön - überprüfen ob Instanz genaue einer konkreten Klasse entspricht (nicht durch abgeleitete Instanz ersetzbar)
        if(d1.getClass().equals(Beagle.class)){
            System.out.println("yaay auf d1 ist wirklivh ein Beagle und kein Hund.");
        }

        if(d1.getClass().equals(Dog.class)){
            System.out.println("Hier solten wir nicht reinkommen sonst pass das nicht");
        } else {
            System.out.println("Beagle ist kein Hund - sondern ein Beagle");
        }


    }
}
