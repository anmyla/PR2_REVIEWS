package Inheritance_AbstractClass_MusicInstruments;

public class Main {
    public static void main(String[] args) {

        Bass b1 = new Bass(7);
        Cello c1 = new Cello(6);
        Cymbals cy1 = new Cymbals( 8);
        Drum d1 = new Drum(9);
        Flute f1 = new Flute(6);
        Guitar g1 = new Guitar(8);
        Piano p1 = new Piano(11);
        Trumpet t1 = new Trumpet(5);
        Violin v1 = new Violin(8);

        Orchestra orchestra = new Orchestra();
        orchestra.addInstrument(b1);
        orchestra.addInstrument(c1);
        orchestra.addInstrument(cy1);
        orchestra.addInstrument(d1);
        orchestra.addInstrument(f1);
        orchestra.addInstrument(g1);
        orchestra.addInstrument(p1);
        orchestra.addInstrument(t1);
        orchestra.addInstrument(v1);

        System.out.println("-------------My Solution--------------");

//        Instrument i1 = new Instrument(8);  //Cannot make an instance of an abstract Class
//        i1.play();
        System.out.println("-------------------------------------");

        orchestra.playAll();
        System.out.println("Total volume: " + orchestra.totalVolume());

        System.out.println("---------Alternative Solution------------");
        System.out.println("Total Volume: " + orchestra.playAll2());


    }
}
