package Iteration_ArrayList_Enum_TeamPlayers;

public class Player {
    private static int counter = 0;
    private static int id;
    private String name;
    private int points;
    private Team team;

    public Player(String name, int points) {
        this.name = name;
        this.id = counter++;
        this.points = points;
    }

    public Player(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Player.counter = counter;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Player.id = id;
    }

    @Override
    public String toString() {
        return "Player { " +
                "name: " + name  +
                ", points: " + points +
                ", team: " + team +
                '}';
    }

}
