package Comparable_Comparator_Orchestra;

public class Guitar2 extends Instrument2 {


    public Guitar2(int volume, double value, String nickname) {
        super(volume, value, nickname);
    }

    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being strummed!");
        return vol;
    }
}
