package A_Exercise_Comparator_Kindergarten;

import java.sql.SQLOutput;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Kind k1 = new Kind("Ping", "Pong", 2);
        Kind k2 = new Kind("Ding", "Dong", 4);
        Kind k3 = new Kind("Sing", "Song", 5);
        Kind k4 = new Kind("Ting", "Tong", 3);
        Kind k5 = new Kind("Ming", "Mong", 5);
        Kind k6 = new Kind("Ring", "Rong", 3);
        Kind k7 = new Kind("Bing", "Bong", 6);

        Kindergarten kiga1 = new Kindergarten("Orange");

        kiga1.addKidToList(k1);
        kiga1.addKidToList(k2);
        kiga1.addKidToList(k3);
        kiga1.addKidToList(k4);
        kiga1.addKidToList(k5);
        kiga1.addKidToList(k6);
        kiga1.addKidToList(k7);

        System.out.println("Sort by name: ");
        kiga1.sortAlphabetical();
        kiga1.printList();

        System.out.println("Sort by age:");
        kiga1.sortAge();
        kiga1.printList();
    }
}
