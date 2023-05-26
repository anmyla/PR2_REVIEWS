package Comparable_Comparator_Rabbits;

public class Rabbit implements Comparable<Rabbit> {
    protected String name;
    protected int age;
    protected int nrCarrots;


    public Rabbit(String name, int age, int carrots) {
        this.name = name;
        this.age = age;
        this.nrCarrots = carrots;
    }

    public Rabbit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Rabbit(String name) {
        this.name = name;
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rabbit(int age, int carrots) {
        this.age = age;
        this.nrCarrots = carrots;
    }


    @Override
    public String toString() {
        return " " + name + " " + age + " " + nrCarrots;
    }

    //sort ascending according to age
    @Override
    public int compareTo(Rabbit o) {
        if (this.age < o.age) {
            return -1;
        }
        if (this.age > o.age) {
            return 1;
        }

        //if Rabbits have the same age, sort by nrCarrots
        if (this.nrCarrots < o.nrCarrots) {
            return -1;
        }
        if (this.nrCarrots > o.nrCarrots) {
            return 1;
        }
        return 0;

        //for int comparison sue:
        //Integer.compare (2,4);
        //return Integer.compare(this.age, o.age)
        //for Strings:
        //String s = "Hansi"
        //return s.compareTO("Hansi");
    }

}
