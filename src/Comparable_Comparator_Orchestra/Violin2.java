package Comparable_Comparator_Orchestra;


public class Violin2 extends Instrument2 {
    public Violin2(int volume, double value, String nickname) {
        super(volume, value, nickname);
    }

    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being bowed!");
        return vol;
    }
}
