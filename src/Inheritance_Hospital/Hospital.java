package Inheritance_Hospital;

import java.util.ArrayList;

public class Hospital {
    ArrayList<Doctor> doctors = new ArrayList<>();


    public void add(Doctor d){
        doctors.add(d);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void print(){
        for (Doctor d : doctors) {
            System.out.println("Dr. " + d.getName() + " earns " + d.getSalary() + " per month");
        }
    }
}
