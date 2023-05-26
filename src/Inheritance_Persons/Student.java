package Inheritance_Persons;

public class Student extends Person {
    private String study;
    private int studentNr;


    public Student(String name, int age, String study, int studentNr) {
        super(name, age);
        this.study = study;
        this.studentNr = studentNr;
    }

    @Override
    public void hallo() {
        super.hallo();
        System.out.println("Ich bin eine Student");
    }
}
