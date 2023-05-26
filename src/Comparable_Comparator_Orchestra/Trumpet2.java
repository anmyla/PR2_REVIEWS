package Comparable_Comparator_Orchestra;


public class Trumpet2 extends Instrument2 {
    public Trumpet2(int volume, double value, String nickname) {
        super(volume, value, nickname);
    }
    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being blown!");
        return vol;
    }
}
