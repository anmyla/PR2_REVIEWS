package A_CheatSheet;

import java.util.ArrayList;

public enum Day {//This a cheat sheet for enum

    //instead of "public class" like usual, we use "public enum"
    // The ENUM NAME must be meaningful, ex: Day(for the sample below)
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    //Just enumerate different categories/types here. they should be written in all caps
    //separated by a comma

    //Enums can be used as Attributes to Objects
    //Example, we want to sort the Objects in a List by its Day attribute

    public ArrayList<Object> getByDay(Day day) {
        ArrayList<Object> newArrayList = new ArrayList<>(); //an existing array declared somewhere
        // but else just re-declaring it here for the sake of this example.

        ArrayList<Object> objectWillBeAddedToTHisList = new ArrayList<>();
        for (int i = 0; i < newArrayList.size(); i++) {
            if (newArrayList.get(i).getDay().equals(day)) {
                objectWillBeAddedToTHisList.add(newArrayList.get(i));
            }
        }
        return objectWillBeAddedToTHisList;
    }
}

