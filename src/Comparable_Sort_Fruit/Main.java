package Comparable_Sort_Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("mango", 350, true);
        Fruit f2 = new Fruit("banana", 120, false);
        Fruit f3 = new Fruit("pineapple", 700, true);
        Fruit f4 = new Fruit("guava", 300, true);

        Fruit [] fruitArray = {f1, f2, f3, f4};

        System.out.println("\n---------Unsorted array with ArrayList---------------");
        System.out.println(Arrays.toString(fruitArray));

        System.out.println("\n---------Sorted Array with Arrays.sort---------------");
        Arrays.sort(fruitArray);
        System.out.println(Arrays.toString(fruitArray));

        List<Fruit> fruitList = new ArrayList<>();  //Upcast List to ArrayList

        fruitList.add(f1);
        fruitList.add(f2);
        fruitList.add(f3);
        fruitList.add(f4);

        System.out.println("\n---------Unsorted array with List---------------");
        System.out.println(fruitList);

        System.out.println("\n---------Sorted Array with Collections.sort---------------");
        Collections.sort(fruitList);
        System.out.println(fruitList);
    }
}
