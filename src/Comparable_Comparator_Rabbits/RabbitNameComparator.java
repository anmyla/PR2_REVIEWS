package Comparable_Comparator_Rabbits;

import java.util.Comparator;

public class RabbitNameComparator implements Comparator<Rabbit> {
    @Override
    public int compare(Rabbit o1, Rabbit o2) {
        return o1.name.compareTo(o2.name);

// if we have two criteria
//        if (o1.name.compareTo(o2.name) == 0) {
//            //if name is same, should be sorted next by age
//        } else {
//            return o1.name.compareTo(o2.name);
//        }

    }
}
