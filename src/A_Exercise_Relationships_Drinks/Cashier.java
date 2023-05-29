package A_Exercise_Relationships_Drinks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cashier {
    private ArrayList<Drink> drinkList;
    private static int soldDrinks;


    public Cashier() {
        this.drinkList = new ArrayList<Drink>();
        soldDrinks++;
    }

    public int getSoldDrinks() {
        return soldDrinks;
    }

    public void sold(Drink d) {
        drinkList.add(d); soldDrinks++;
    }



    public void printList() {
        for (Drink d : drinkList) {
            System.out.println(d);
        }
    }

    public void printDrinksBasedOnNumOfIngredients() {
        Collections.sort(drinkList, new DrinksComparator());
        printList();
    }

    public void printDrinksBasedOnAmount() {
        Collections.sort(drinkList, new AmountComparator());
        printList();
    }
    public HashMap<Integer, ArrayList<Drink>> getDrinksCategorizedByIngredients() {
        HashMap<Integer, ArrayList<Drink>> createdHashMap = new HashMap<>();
        ArrayList<Drink> drinkArrayList1 = new ArrayList<>();
        ArrayList<Drink> drinkArrayList2 = new ArrayList<>();
        ArrayList<Drink> drinkArrayList3 = new ArrayList<>();
        Drink temp;

        for (Drink item : drinkList) {
            temp = item;
            if (item.getNumberOfIngredients() == 1) {
                drinkArrayList1.add(temp);
                createdHashMap.put(1, drinkArrayList1);
            } else if (item.getNumberOfIngredients() == 2)  {
                drinkArrayList2.add(temp);
                createdHashMap.put(2, drinkArrayList2);
            } else if (item.getNumberOfIngredients() > 2) {
                drinkArrayList3.add(temp);
                createdHashMap.put(3, drinkArrayList3);
            }
        }
        return createdHashMap;
    }

    public void printCreatedHashMap() {
        HashMap<Integer, ArrayList<Drink>> printThis = getDrinksCategorizedByIngredients();
        for (Map.Entry<Integer, ArrayList<Drink>> entry : printThis.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
