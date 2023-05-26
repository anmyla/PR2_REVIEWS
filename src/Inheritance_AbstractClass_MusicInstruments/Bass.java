package Inheritance_AbstractClass_MusicInstruments;

public class Bass extends Instrument {
    public Bass(int volume) {
        super(volume);
    }

    @Override
    public int play() {
        int vol = getVolume();
        System.out.println(getClass().getSimpleName() + " is being plucked!");
        return vol;
    }

}
