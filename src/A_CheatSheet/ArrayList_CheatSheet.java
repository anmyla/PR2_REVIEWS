package A_CheatSheet;

import A_SampleTest.main.java.at.campus02.iwi.devices.Device;

import java.util.ArrayList;

public class ArrayList_CheatSheet {

    //CREATION: Declaration in a class (didn't initialzed it but it works)---------------------------
    ArrayList<Object> newArrayList;

    //DUMMY CONSTRUCTOR
    public ArrayList_CheatSheet(ArrayList<Object> newArrayList) {
        this.newArrayList = newArrayList;
    }

    //ADDING OBJECTS TO ARRAYLIST------------------------------------------
    public void addObject(Object item) {
        newArrayList.add(item);
    }

    //REMOVING OBJECTS FROM AN ARRAYLIST-------------------------------------
    public void removeObject(Object item) {
        newArrayList.remove(item);
    }

    //REMOVING OBJECTS FROM A LIST USING LAMBDA
    public void removeObjectUsingLambda(Object item) {
        newArrayList.removeIf(obj -> obj.equals(item));
    }

    //REMOVING A PARTICULAR OBJECT FROM AN ARRAYLIST USING FOREACH-LOOP
    public void removeParticularObjectUsingForEach(Object item) {
        for (Object obj : newArrayList) {
            if (obj.equals(item)) {
                newArrayList.remove(obj);
                break;  // Exit the loop after removing the object
            }
        }
    }

    //PRINTING THE CONTENTS OF AN ARRAYLIST--------------------------------
        public void printList(ArrayList<Object> newArrayList) {
        for (Object item : newArrayList) {
            System.out.println(item);
        }
    }

    //FINDING THE OBJECT IN AN ARRAYLIST WITH THE LOWEST/CHEAPEST VALUE OF(X)-------
        public Object findObjectWithCheapestX(ArrayList<Object> newArrayList) { //this must return the Object you are looking for
        // ArrayList_CheatSheet<Object> newArrayList = new ArrayList_CheatSheet<>(); //create if not asked in the parameter or not existing anywhere in the program
        Object objectWithCheapestOrLowestX = null;
        double cheapestOrLowestX = 0;
        double temp = 0; // or some other temporary variable

        for (Object item : newArrayList) {
            temp = item.valueYouAreSearchingFor(); //you have to get this value somewhere
            if (objectWithCheapestOrLowestX  == null || temp < cheapestOrLowestX ) {
                objectWithCheapestOrLowestX  = item;
                cheapestOrLowestX  = temp;
            }
        }
        return objectWithCheapestOrLowestX;
    }

    //FINDING THE OBJECT IN AN ARRAYLIST WITH THE HIGHEST VALUE OF(X)-------
    public Object findObjectWithHighestX(ArrayList<Object> newArrayList) { //this must return the Object you are looking for
        // ArrayList_CheatSheet<Object> newArrayList = new ArrayList_CheatSheet<>(); //create if not asked in the parameter or not existing anywhere in the program
        Object objectWithHighestX = null;
        double highestX= 0;
        double temp = 0; // or some other temporary variable

        for (Object item : newArrayList) {
            temp = item.valueYouAreSearchingFor(); //you have to get this value somewhere (getter)
            if (temp > highestX ) {
                objectWithHighestX  = item;
                highestX = temp;
            }
        }
        return objectWithHighestX;
    }
}
