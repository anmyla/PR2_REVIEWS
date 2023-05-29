package A_Exercise_Relationships_Drinks;

import java.util.Comparator;

public class AmountComparator implements Comparator<Drink> {

    @Override
    public int compare(Drink d1, Drink d2) {
        int keyComparison = Double.compare(d1.amountInML(), d2.amountInML());
        if (keyComparison != 0) {
            return keyComparison;
        }
        return 0;
    }
}
