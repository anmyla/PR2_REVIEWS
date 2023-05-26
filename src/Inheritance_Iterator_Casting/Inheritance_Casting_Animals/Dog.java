package Inheritance_Iterator_Casting.Inheritance_Casting_Animals;

public class Dog {

//** Start -Does not have anything to do with Inheritance -Excurs static
    //Static attribute is a constant attribute: it doesn't change no matter how often the Dog Object is generated
    public static String latinName= "Canis lups familiaris";
    public static void printLatinName() {
        String hansi = "Hansi Lieb Hunde";
        System.out.println(hansi);
        System.out.println(latinName);
//        System.out.println(age);
    }
//** End -Does not have anything to do with Inheritance -Excurs static


    //private attributes CANNOT be accessed by instances
    private String name; //name of the dog

    //protected attributes can be accessed by instances
    protected int age; // age of the dog

    //Constructor method
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //constructor without parameters
    public Dog(){
        name = "newborn";
        age = 0;
    }


    public void bark(String wuff) {
        System.out.println(name + " barks " + wuff);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
