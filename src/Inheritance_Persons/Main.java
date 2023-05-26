package Inheritance_Persons;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("David", 19, "Bachelor in Computer Science", 2568741);

//Student can inherit attributes and functions from Person. It can use an inherited function or overrides it.
        student1.hallo();

        Instructor instructor1 = new Instructor("Hubert",56,"FH", "PR1");
        instructor1.hallo();

        Employer employer1 = new Employer("Franz", 58, "Magna");
        employer1.hallo();

        System.out.println(student1 instanceof Person);

        Community community = new Community(new Address("Street", 12, "Graz", 8010));
        community.addPerson(student1);
        community.addPerson(instructor1);
        community.addPerson(employer1);
        System.out.println(community.getPersons());
    }
}
