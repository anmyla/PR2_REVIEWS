package A_Exercise_Relationships_Drinks;

public abstract class Drink implements Combustible {
    protected String name;

    public Drink(String name) {
        this.name = name;
    }

    public boolean combustible(Drink d) {
        return d.combustible();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract int getNumberOfIngredients();
    public abstract boolean containsAlcohol();

    public abstract double amountInML();
    @Override
    public String toString() {
        return "Drink " +
                "name: " + name + "\t" +
                "ingredients: " + getNumberOfIngredients() + "\t"  +
                "amount in ml: " + amountInML() + "\t"  +
                "alcohol?: " + containsAlcohol();
    }


//    public int compareTo1(Drink d) {
//        return Integer.compare(this.getNumberOfIngredients(), d.getNumberOfIngredients());
//    }
//
//    public double compareTo2(Drink d)  {
//        return Double.compare(this.amountInML(), d.amountInML());
//    }



}