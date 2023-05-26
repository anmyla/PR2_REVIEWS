package Inheritance_AbstractClass_MusicInstruments;

public class Flute extends Instrument {
    public Flute(int volume) {
        super(volume);
    }

    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being blown!");
        return vol;
    }
}
