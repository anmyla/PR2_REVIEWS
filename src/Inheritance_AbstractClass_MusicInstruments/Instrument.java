package Inheritance_AbstractClass_MusicInstruments;

public abstract class Instrument {

    private int volume;

    public Instrument(int volume) {
        this.volume = volume;
    }

    public abstract int play();

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}

