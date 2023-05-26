package Inheritance_Persons;

import java.util.ArrayList;

public class Community {
    private Address address;
    private ArrayList<Person> persons = new ArrayList<>();

    public Community(Address address) {
        this.address = address;
        this.persons = persons;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person){
        persons.add(person);
    }
}
