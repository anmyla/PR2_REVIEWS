package ArrayListWithEnum_Games;

public class Player1 {
    static int id;
    private String name;
    private int points;
    private Team playingTeam;

    public Player1(String name, int points, Team playingTeam) {
        this.name = name;
        this.points = points;
        this.playingTeam = playingTeam;
        this.id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Player1.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Team getPlayingTeam() {
        return playingTeam;
    }

    public void setPlayingTeam(Team playingTeam) {
        this.playingTeam = playingTeam;
    }

    @Override
    public String toString() {
        return "Player { " +
                "name: '" + name + '\'' +
                ", points: " + points +
                ", playingTeam: " + playingTeam +
                " }";
    }
}
