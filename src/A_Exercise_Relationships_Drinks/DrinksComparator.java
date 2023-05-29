package A_Exercise_Relationships_Drinks;

import java.util.Comparator;

public class DrinksComparator implements Comparator<Drink> {

    @Override
    public int compare(Drink d1, Drink d2) {
        int keyComparison = Integer.compare(d1.getNumberOfIngredients(), d2.getNumberOfIngredients());
        if (keyComparison != 0) {
            return keyComparison;
        }
        return 0;
    }
}
