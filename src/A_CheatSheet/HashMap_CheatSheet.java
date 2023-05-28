package A_CheatSheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_CheatSheet{

    // CREATION: Declaration in a class (didn't initialize it but it works)---------------------------
    HashMap<Integer, String> newHashMap; // <String, Integer>, <String, String>, etc

    //DUMMY CONSTRUCTOR
    public HashMap_CheatSheet(HashMap<Integer, String> newHashMap) {
        this.newHashMap = newHashMap;
    }

    // REMOVING AN ENTRY FROM HASHMAP WITHOUT USING ITERATOR
    public void removeEntry(HashMap<Integer, String> hashMap, Integer keyToRemove) { //2 parameters: map and key
        hashMap.remove(keyToRemove);
    }

    // ADDING KEY-VALUE PAIRS TO HASHMAP------------------------------------------
    public void addKeyValuePair(Integer key, String value) { //ex. (String name, Integer number)
        newHashMap.put(key, value);
    }

    // PRINTING THE CONTENTS OF A HASHMAP--------------------------------
    public static void printHashmap2(HashMap<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // FINDING THE ENTRY IN A HASHMAP WITH THE LOWEST KEY-------
    public Map.Entry<Integer, String> findEntryWithLowestKey(HashMap<Integer, String> newHashMap) {
        Map.Entry<Integer, String> entryWithLowestKey = null;
        Integer lowestKey = null;
        Integer tempKey = 0;

        for (Map.Entry<Integer, String> entry : newHashMap.entrySet()) {
            tempKey = entry.getKey();
            if (lowestKey == null || tempKey < lowestKey) {
                lowestKey = tempKey;
                entryWithLowestKey = entry;
            }
        }
        return entryWithLowestKey;
    }

    // FINDING THE ENTRY IN A HASHMAP WITH THE HIGHEST KEY-------
    public Map.Entry<Integer, String>  findEntryWithHighestKey(HashMap<Integer, String> newHashMap) {
        Map.Entry<Integer, String>  entryWithHighestKey = null;
        Integer highestKey = null;
        Integer tempKey = null;
        for (Map.Entry<Integer, String> entry : newHashMap.entrySet()) {
            tempKey = entry.getKey();
            if (highestKey == null || tempKey > highestKey) {
                highestKey = tempKey;
                entryWithHighestKey = entry;
            }
        }
        return entryWithHighestKey;
    }

    //CREATE A HASHMAP FROM AN ARRAYLIST---------------------
    //Objects in the list must follow <Integer, String> attributes
    public HashMap<Integer, String> createdHashMapFromAnArrayList(ArrayList<MyObject> arrayList) {
        HashMap<Integer, String> createdHashMap = new HashMap<>();
        for (MyObject item : arrayList) {
            Integer key = item.getoKey(); //retrieve/extract the Integer value
            String value = item.getoValue(); //retrieve/extract the String value
            createdHashMap.put(key, value); //save the retrieved values to a Hashmap entry
        }
        return createdHashMap;
    }

    // PRINTING A HASHMAP USING ITERATOR
    public void printHashMapUsingIterator(HashMap<Integer, String> hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    // USING ITERATOR: FIND A HASHMAP ENTRY WITH THE HIGHEST KEY
    public Map.Entry<Integer, String> findEntryWithHighestKeyUsingIterator(HashMap<Integer, String> hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        Map.Entry<Integer, String> entryWithHighestKey = null;
        Integer highestKey = null;

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();

            if (highestKey == null || key > highestKey) {
                highestKey = key;
                entryWithHighestKey = entry;
            }
        }
        return entryWithHighestKey;
    }

    // REMOVING AN ENTRY FROM HASHMAP USING ITERATOR
    public void removeEntryUsingIterator(HashMap<Integer, String> hashMap, Integer keyToRemove) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();

            if (key.equals(keyToRemove)) {
                iterator.remove();
                break; // Stop iterating after the first matching key is removed
            }
        }
    }
}