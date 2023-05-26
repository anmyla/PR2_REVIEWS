package Inheritance_Hospital;

public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Kata", 12000);
        Doctor d2 = new Doctor("Sophie", 10000);
        Specialist sp1 = new Specialist("Myla", 15000, 5000);
        Specialist sp2 = new Specialist("Nora", 13000, 2000);
        Specialist sp3 = new Specialist("Vici", 17000, 1000);

        Hospital lkh = new Hospital();
        lkh.add(d1);
        lkh.add(d2);
        lkh.add(sp1);
        lkh.add(sp2);
        lkh.add(sp3);

        lkh.print();

    }

}
