package A_CheatSheet;

//DONT FORGET TO IMPORT NECESSARY LIBRARY

import Comparable_Comparator_Rabbits.RabbitNameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;


//DONT FORGET THE KEYWORD "IMPLEMENTS" COMPARATOR<CLASS/OBJECT NAME>
public class Comparator_CheatSheet implements Comparator<Comparable_CheatSheet> { //You have to decide with to use to compare your objects so you knw what to implement.

    @Override
    public int compare(Comparable_CheatSheet o1, Comparable_CheatSheet o2) {
        // Compare based on the int value
        int keyComparison = o1.getoKey2().compareTo(o2.getoKey2());
        if (keyComparison != 0) {
            return keyComparison;
        }

        // If first values are the same, sort based on the 2nd value
        return o1.getoValue2().compareTo(o2.getoValue2());
    }


    /* ------------ANOTHER SAMPLE OF THE COMPARE METHOD FOR COMPARATOR------------------------------------
        @Override
        public int compare(Rabbit o1, Rabbit o2) {
        return o1.name.compareTo(o2.name);

        // if first criteria is the same and you have to sort further

        if (o1.name.compareTo(o2.name) == 0) {
        } else {
            return o1.name.compareTo(o2.name);
        }
    }
     */

}