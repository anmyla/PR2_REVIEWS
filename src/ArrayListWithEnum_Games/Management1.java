package ArrayListWithEnum_Games;

import java.util.ArrayList;

public class Management1 {
    private ArrayList<Player1> teams = new ArrayList<>();

    public void add(Player1 t) {
        teams.add(t);
    }

    public void remove(Player1 t) {
        teams.remove(t);
    }

    public void print(ArrayList<Player1> events) {
        for (Player1 t : teams) {
            System.out.println(t);
        }
        System.out.println();
    }

    public void print() {
        for (Player1 t :this.teams) {
            System.out.println(t);
        }
        System.out.println();
    }

    public Player1 getPlayerById(int id){
        Player1 playerWithId = null;
        for ( Player1 t: teams) {
            int playerID = t.getId();
            if (playerWithId.equals(id)){
                playerWithId = t;
                break;
            }
        }
        return playerWithId;
    }

    public int getPointsPerTeam(Player1 team){
        int totalPoints = 0;

        return totalPoints;
    }

    public Player1 getWinner(){
        Player1 withMostPoints = teams.get(0);
        int storesPoints = 0;

        for (int i = 0; i < teams.size(); i++) {
            if ((teams.get(i).getPoints()) > storesPoints) {
                storesPoints = teams.get(i).getPoints();
                withMostPoints = teams.get(i);
            }
        }
        return withMostPoints;
    }
}
