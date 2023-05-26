package Inheritance_Persons;

public class Employer extends Person{
    private String company;

    public Employer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void hallo(){
        System.out.println("Ich arbeite bei " + company);
    }
}
