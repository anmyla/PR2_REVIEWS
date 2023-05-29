package A_Exercise_Comparator_Kindergarten;

import java.util.Comparator;

public class AgeComparator implements Comparator<Kind> {
    @Override
    public int compare(Kind k1, Kind k2) {
        int keyComparison = Integer.compare(k1.getAge(), k2.getAge());
        if (keyComparison != 0) {
            return keyComparison;
        }
        return 0;
    }
}
