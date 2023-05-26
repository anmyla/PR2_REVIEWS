package Comparable_Comparator_Orchestra;

import java.util.Comparator;

public class InstrumentComparator implements Comparator<Instrument2> {

    @Override
    public int compare (Instrument2 o1, Instrument2 o2) {
        //Sorting Criteria
        int result = o1.getNickname().compareTo(o2.getNickname());
        if(result != 0) { //this means that nicknames are not the same
            return result;
        }
        //Nicknames are the same
        // we can use if clause to compare or use Double.compare() like this: (or Integer.compare() for integers
        return Double.compare(o1.getValue(),o2.getValue());
    }
}
