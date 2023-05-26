package Inheritance_AbstractClass_MusicInstruments;

public class Drum extends Instrument {
    public Drum(int volume) {
        super(volume);
    }
    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being struck!");
        return vol;
    }
}
