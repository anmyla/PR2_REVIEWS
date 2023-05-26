package Inheritance_AbstractClass_MusicInstruments;

public class Cymbals extends Instrument {
    public Cymbals(int volume) {
        super(volume);
    }

    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being struck!");
        return vol;
    }
}
