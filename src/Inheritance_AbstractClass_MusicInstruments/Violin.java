package Inheritance_AbstractClass_MusicInstruments;

public class Violin extends Instrument {
    public Violin(int volume) {
        super(volume);
    }

    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being bowed!");
        return vol;
    }
}
