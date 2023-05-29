package A_Exercise_Comparator_Kindergarten;

import java.util.ArrayList;
import java.util.Collections;

public class Kindergarten {
    private String className;
    private ArrayList<Kind> listOfKids;

    public Kindergarten(String className) {
        this.className = className;
        this.listOfKids = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<Kind> getListOfKids() {
        return listOfKids;
    }

    public void setListOfKids(ArrayList<Kind> listOfKids) {
        this.listOfKids = listOfKids;
    }

    public void addKidToList(Kind k) {
        listOfKids.add(k);
    }

    public void sortAlphabetical() {
        AlphabeticalComparator comparator1 = new AlphabeticalComparator();
        Collections.sort(listOfKids, comparator1);
    }

    public void sortAge() {
        AgeComparator comparator2 = new AgeComparator();
        Collections.sort(listOfKids, comparator2);
    }

    public void printList() {
        for (Kind k : listOfKids) {
            System.out.println(k);
        }
    }

}
