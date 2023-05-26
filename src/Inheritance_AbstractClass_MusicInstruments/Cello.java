package Inheritance_AbstractClass_MusicInstruments;

public class Cello extends Instrument {
    public Cello(int volume) {
        super(volume);
    }

    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being bowed!");
        return vol;
    }
}
