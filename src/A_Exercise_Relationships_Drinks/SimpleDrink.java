package A_Exercise_Relationships_Drinks;

public class SimpleDrink extends Drink{
    protected Liquid ingredient;

    public SimpleDrink(String name, Liquid ingredient) {
        super(name);
        this.ingredient = ingredient;
    }


    public Liquid getIngredient() {
        return ingredient;
    }

    public void setIngredient(Liquid ingredient) {
        this.ingredient = ingredient;
    }

    public int getNumberOfIngredients() {
        return 1;
    }
    public boolean containsAlcohol() {
        return false;
    }

    public double amountInML(){
        return 350;
    }

    public boolean combustible() {
        return false;
    }

}
