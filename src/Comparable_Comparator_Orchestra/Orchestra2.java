package Comparable_Comparator_Orchestra;

import java.util.ArrayList;

public class Orchestra2 {
    ArrayList<Instrument2> orchestra = new ArrayList<>();

    public void addInstrument(Instrument2 instrument) {
        orchestra.add(instrument);
    }

    public void playAll() {
        for (Instrument2 a : orchestra) {
            a.play();
        }
    }

    public int totalVolume() {
        int total = 0;
        for (Instrument2 a : orchestra
        ) {
            total = total + a.getVolume();
        }
        return total;
    }

    //Alternative Solution

    public int playAll2() {
        int totalVolume = 0;
        for (Instrument2 i: orchestra
             ) {
            i.play();
            totalVolume += i.getVolume();
        }
        return totalVolume;
    }


}
