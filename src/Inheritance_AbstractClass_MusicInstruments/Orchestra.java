package Inheritance_AbstractClass_MusicInstruments;

import java.util.ArrayList;

public class Orchestra {
    ArrayList<Instrument> orchestra = new ArrayList<>();

    public void addInstrument(Instrument instrument) {
        orchestra.add(instrument);
    }

    public void playAll() {
        for (Instrument a : orchestra
        ) {
            a.play();
        }
    }

    public int totalVolume() {
        int total = 0;
        for (Instrument a : orchestra
        ) {
            total = total + a.getVolume();
        }
        return total;
    }

    //Alternative Solution

    public int playAll2() {
        int totalVolume = 0;
        for (Instrument i: orchestra
             ) {
            i.play();
            totalVolume += i.getVolume();
        }
        return totalVolume;
    }
}
