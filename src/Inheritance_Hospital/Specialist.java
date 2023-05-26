package Inheritance_Hospital;

public class Specialist extends Doctor {
    private double surcharge;

    public Specialist(String name, double salary, double surcharge) {
        super(name, salary);
        this.surcharge = surcharge;
    }
    @Override
    public double getSalary(){
        return super.getSalary() + surcharge;
    }

}


