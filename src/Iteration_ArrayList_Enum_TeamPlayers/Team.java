package Iteration_ArrayList_Enum_TeamPlayers;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players = new ArrayList<>();
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void print() {
        players.forEach((p) -> System.out.println(p));
        System.out.println();
    }

    public int getPointsPerTeam() {
        int pointsPerTeam = 0;
        for (Player p : players) {
            pointsPerTeam += p.getPoints();
        }
        return pointsPerTeam;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players){
        this.players = players;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPunkte(int punkte) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Team {" +
                " name:  " + name +
                ",   points: " + getPointsPerTeam() +
                '}';
    }

}
