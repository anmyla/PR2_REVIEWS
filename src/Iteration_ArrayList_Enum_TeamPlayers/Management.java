package Iteration_ArrayList_Enum_TeamPlayers;

import java.util.ArrayList;

public class Management {
    private ArrayList<Team> teams = new ArrayList<>();


    public void addTeam(Team t) {
        teams.add(t);
    }

    public void print() {
//        teams.forEach((element) -> System.out.println(element));
        for (Team t : teams) {
            System.out.println(t);
            t.print();
        }
        System.out.println();
    }

    public Team getWinnerTeam() {
        Team winnerTeam = null;
        int points = 0;
        for (Team t : teams) {
            if (t.getPointsPerTeam() > points) {
                winnerTeam = t;
                points = t.getPointsPerTeam();
            }
        }
        return winnerTeam;
    }
//
//            Iterator<Team> item = teams.iterator();
//            while(item.hasNext()){
//                Team teams = item.next();  // event is an element/value in the Event
//                if ( teams.getPrice() > limit) {
//                    item.remove();
//                }
//            }

    public Player getBestPlayer() {
        Player bestPlayer = null;
        int points = 0;
        for (Team t : teams) {
            for (Player p : t.getPlayers()) {
                if (p.getPoints() > points) {
                    bestPlayer = p;
                    points = p.getPoints();
                }
            }
        }
        return bestPlayer;
    }

    public Player getPlayerById(int id) {
        for (Team t : teams) {
            for (Player p : t.getPlayers()) {
                if (p.getId() == id) {
                    return p;
                }
            }
        }
        return null;
    }
}