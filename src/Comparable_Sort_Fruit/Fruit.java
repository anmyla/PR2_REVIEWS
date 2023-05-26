package Comparable_Sort_Fruit;

public class Fruit  implements Comparable <Fruit>{
    protected String name;
    protected double weight;
    protected boolean isFresh;


    public Fruit(String name, double weight, boolean isFresh) {
        this.name = name;
        this.weight = weight;
        this.isFresh = isFresh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    //sort ascending according to weight
    @Override
    public int compareTo(Fruit o) {
        if(this.weight < o.weight){
            return -1;
        }
        if (this.weight > o.weight) {
            return 1;
        }
        return 0;
    }





    @Override
    public String toString() {
        return " " + name +" " +  weight + " " + isFresh;
    }
}
