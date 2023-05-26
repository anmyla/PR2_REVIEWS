package Inheritance_AbstractClass_MusicInstruments;

public class Piano extends Instrument {
    public Piano(int volume) {
        super(volume);
    }

    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being keyed!");
        return vol;
    }

}
