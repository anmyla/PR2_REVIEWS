package A_Exercise_Comparator_Kindergarten;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Kind> {

    @Override
    public int compare(Kind k1, Kind k2) {
        int basis = k1.getLname().compareTo(k2.getLname());
        if (basis != 0) {
            return basis;
        }
        return k1.getFname().compareTo(k2.getFname());
    }
}
