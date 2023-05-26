package Comparable_Comparator_Orchestra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


 //write a method to print the results properly
public class Main2 {
    public static void main(String[] args) {
        Guitar2 g1 = new Guitar2(8, 5.6, "ping");
        Piano2 p1 = new Piano2(11, 8.7, "pong");
        Trumpet2 t1 = new Trumpet2(5, 5.8,"king");
        Violin2 v1 = new Violin2(8, 8.4, "kong");

/*
        Orchestra2 orchestra = new Orchestra2();
        orchestra.addInstrument(g1);
        orchestra.addInstrument(p1);
        orchestra.addInstrument(t1);
        orchestra.addInstrument(v1);
*/
        //Sortieren
        //für Arrays: Arrays.sort
        //für Collection

        List<Instrument2> instrument2List = new ArrayList<>();
        instrument2List.add(g1);
        instrument2List.add(p1);
        instrument2List.add(t1);
        instrument2List.add(v1);



/*      System.out.println("---NOT SORTED---");
        System.out.println(orchestra);
        System.out.println("---SORTED---");
        Collections.sort(orchestra);
        System.out.println(orchestra);
*/
        System.out.println("---NOT SORTED---");
        printArrayList(instrument2List);
        System.out.println("---SORTED WITH COMPARABLE---");
        Collections.sort(instrument2List);
        printArrayList(instrument2List);


    //Compare with Comparator

     Violin2 v2 = new Violin2(12, 100.4, "king");
     Violin2 v3 = new Violin2(4, 89.4, "kong");
     Violin2 v4 = new Violin2(7, 40.4, "ping");
     Violin2 v5 = new Violin2(19, 80.4, "pong");

        List<Instrument2> instrumentList = new ArrayList<>();
        instrumentList.add(v2);
        instrumentList.add(v3);
        instrumentList.add(v4);
        instrumentList.add(v5);

        System.out.println("---SORTED WITH COMPARATOR---");
        Collections.sort(instrumentList, new InstrumentComparator());
        printArrayList(instrumentList);
    }

     public static void printArrayList(List y) {
        for (Object item : y) {
            System.out.println(item);
        }
    }
}
