package Inheritance_Iterator_Casting.Inheritance_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BunnyStall {
    ArrayList<Rabbit> stall = new ArrayList<>();

    public void addRabbit(Rabbit hase) {
        stall.add(hase);
    }

    public ArrayList<Rabbit> getStall() {
        return stall;
    }

    public void allBunnyHops() {
        for (Rabbit a : stall
        ) {
            a.hop();
        }
    }

    public void allBunnyHops2() {
        Iterator<Rabbit> rabbitIterator = stall.iterator();
        for (int i = 0; i < stall.size(); ++i) {
            while (rabbitIterator.hasNext()) {
                Rabbit h = rabbitIterator.next();
                h.hop();
            }
        }
    }

}
