package Comparable_Comparator_Rabbits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainRabbit {

    public static void main(String[] args) {


        Rabbit r1 = new Rabbit("ping", 7, 7);
        Rabbit r2 = new Rabbit("pong", 12, 5);
        Rabbit r3 = new Rabbit("king", 2, 9);
        Rabbit r4 = new Rabbit("kong", 6, 6);
        Rabbit r5 = new Rabbit("tim", 7, 1);
        Rabbit r6 = new Rabbit("tom", 9, 0);

        List<Rabbit> rabbitStall = new ArrayList<>();
        rabbitStall.add(r1);
        rabbitStall.add(r2);
        rabbitStall.add(r3);
        rabbitStall.add(r4);
        rabbitStall.add(r5);
        rabbitStall.add(r6);

        System.out.println("\n-----UNSORTED LIST -----");
        System.out.println(rabbitStall);

        System.out.println("\n-----USING COMPARABLE : SORTED LIST ACCORDING TO AGE then to number of carrots when Rabbits have the same age -----");
        Collections.sort(rabbitStall);
        System.out.println(rabbitStall);


        System.out.println("\n-----SORTED LIST USING COMPARATOR-----");
        Collections.sort(rabbitStall, new RabbitNameComparator()); //call the comparator class
        System.out.println(rabbitStall);
    }
}
