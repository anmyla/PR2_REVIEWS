package Hashmap_Review_Rabbits;

import Comparable_Comparator_Rabbits.Rabbit;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        //wir moechten alle hasen mit einer steuernummer speichern um
        //sie schnell zu finden
        HashMap<String, Rabbit> mapRabbit = new HashMap<>();

        Rabbit r7 = new Rabbit("ping", 7, 7);
        Rabbit r8 = new Rabbit("pong", 12, 5);
        Rabbit r9 = new Rabbit("king", 2, 9);
        Rabbit r10 = new Rabbit("kong", 6, 6);
        Rabbit r11 = new Rabbit("tim", 7, 1);
        Rabbit r12 = new Rabbit("tom", 9, 0);

        mapRabbit.put("1245", r7);
        mapRabbit.put("1246", r8);
        mapRabbit.put("1247", r9);
        mapRabbit.put("1249", r10);
        mapRabbit.put("1250", r11);
        mapRabbit.put("1251", r12);

        //wert auslesen durch anagben des schlüssels
        mapRabbit.get("1245");


        //this will return a null when hashmap cannot find the value
        System.out.println(mapRabbit.get("sample")); // not found null

        System.out.println(mapRabbit.containsKey("1250")); //true

        //achtung nur notfalls machen. IS IST LANGSAM!!!!!
        //better to look for the key than the value. it is faster
        System.out.println(mapRabbit.containsValue(r7));




        //wenn wir eine int int Hashmap wollen musse wir INTEGER, INTEGER verwenden
        HashMap<Integer, Integer> sample = new HashMap<Integer, Integer>();




    }
}
