package Comparable_Comparator_Orchestra;

public abstract class Instrument2 implements Comparable<Instrument2> {

    private int volume;
    private double value;
    private String nickname;

    public Instrument2(int volume, double value, String nickname) {
        this.volume = volume;
        this.value = value;
        this.nickname = nickname;
    }

    public abstract int play();

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getValue() {
        return value;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public int compareTo(Instrument2 o) {
        if (volume < o.volume) {
            return -1;
        }

        if (volume > o.volume) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Instrument: " + getClass().getName()+ "  " + getVolume() + " " + getValue()+ "  "+ getNickname() +
                " : ";
    }
}


