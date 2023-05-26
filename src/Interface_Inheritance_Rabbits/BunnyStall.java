package Interface_Inheritance_Rabbits;

import java.util.ArrayList;
import java.util.Iterator;

public class BunnyStall {
    ArrayList<Rabbit> stall = new ArrayList<>();

    ArrayList<GoesToParty> party = new ArrayList<>();

    public void addRabbit(Rabbit hase) {
        stall.add(hase);
    }

    public void addRabbitToParty(GoesToParty a) {
        party.add(a);
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

    public void allBunnyPary() {
        for (GoesToParty a : party
        ) {
            a.party("coke", "cheese cake");
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
