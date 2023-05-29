package A_Exercise_Relationships_Drinks;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Liquid water = new Liquid("water", 250, 0);
        Liquid gin = new Liquid("gin", 20, 70);
        Liquid vodka = new Liquid("vodka", 50, 50);
        Liquid juice = new Liquid("water", 500, 0);
        Liquid beer = new Liquid("beer", 500, 20);
        Liquid rum = new Liquid("rum", 200, 50);
        Liquid cola = new Liquid("cola", 300, 0);

        SimpleDrink s1 = new SimpleDrink("Juice", water);
        SimpleDrink s2 = new SimpleDrink("shandy", beer);

        LongDrink l1 = new LongDrink("rum cola", rum, cola );
        LongDrink l2 = new LongDrink("easy drink", juice, vodka );

        Cocktail c1 = new Cocktail("metro");
        Cocktail c2 = new Cocktail("sob");

        Cashier register1 = new Cashier();
        register1.sold(c2);
        register1.sold(c1);
        register1.sold(l1);
        register1.sold(l2);
        register1.sold(s1);
        register1.sold(s2);

        System.out.println("Total Sold Drinks: ");
        System.out.println(register1.getSoldDrinks());

        System.out.println("\nPrint Sold Drinks: ");
        register1.printList();

        System.out.println("\nPrint Sold Drinks based on number of ingredients");
        register1.printDrinksBasedOnNumOfIngredients();

        System.out.println("\nPrint Sold Drinks based on amount");
        register1.printDrinksBasedOnAmount();

        System.out.println("\nPrint Sold Drinks categorized based on number of Ingredients:");
        register1.printCreatedHashMap();


    }
}
