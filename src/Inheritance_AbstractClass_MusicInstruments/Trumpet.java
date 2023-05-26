package Inheritance_AbstractClass_MusicInstruments;

public class Trumpet extends Instrument {
    public Trumpet(int volume) {
        super(volume);
    }
    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being blown!");
        return vol;
    }
}
