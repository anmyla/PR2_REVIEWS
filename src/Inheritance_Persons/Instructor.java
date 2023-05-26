package Inheritance_Persons;

public class Instructor extends Employer{
    private String subject;

    public Instructor(String name, int age, String company, String subject) {
        super(name, age, company);
        this.subject = subject;
    }


//If it doesn't have its own method, the parent method will be used.
//in this case, the hallo method will be taken from the parent class "employer"
//    public void hallo(){
//        System.out.println("I love " + subject + "!");
//    }


}
