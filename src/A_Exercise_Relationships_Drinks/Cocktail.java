package A_Exercise_Relationships_Drinks;

import java.util.ArrayList;

public class Cocktail extends Drink implements Combustible {
    static ArrayList<Liquid> ingredients;

    public Cocktail(String name) {
        super(name);
        this.ingredients = new ArrayList<>();
    }

    public ArrayList<Liquid> getIngredients() {
        Liquid gin = new Liquid("gin", 20, 70);
        Liquid vodka = new Liquid("vodka", 50, 50);
        Liquid juice = new Liquid("water", 500, 0);

        if (getName().equals("metro")) {
            ingredients.add(gin);
            ingredients.add(juice);
            ingredients.add(juice);
        } else if (getName().equals("sob")) {
            ingredients.add(vodka);
            ingredients.add(juice);
        }

        return ingredients;
    }

    public void setIngredients(ArrayList<Liquid> emptyList) {
        ingredients = emptyList;
    }

    public int getNumberOfIngredients() {
        ArrayList<Liquid> cocktailIng = getIngredients();
        ArrayList<Liquid> emptyList = new ArrayList<>();
        int numOfIngredients = 0;
        for (Liquid item : cocktailIng) {
            numOfIngredients += 1;
        }

        setIngredients(emptyList);
        return numOfIngredients;
    }

    public boolean containsAlcohol() {
        return true;
    }

    public double amountInML() {
        return 200;
    }

    public boolean combustible() {
        double sum = 0;
        for (Liquid item : ingredients) {
            sum = sum + item.getAlcoholPercent();
        }
        if (sum >= 30) {
            return true;
        } else return false;
    }
}
