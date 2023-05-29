package A_Exercise_HashMap_BlackJack;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {
    private HashMap<Player, Integer> players;

    public Blackjack() {
        this.players = new HashMap<>();
    }

    public boolean add(Player p) {
        boolean isAdded = false;
        if (players.containsKey(p)) {
            isAdded = false;
        } else {
            players.put(p, 0);
            isAdded = true;
        }
        return isAdded;
    }


    public boolean addCard(Player p, Integer cardValue) {
        boolean cardRaised = false;
        Integer currentValue;

        if (players.containsKey(p)) {
            currentValue = players.get(p) + cardValue;
            players.put(p, currentValue);
            cardRaised = true;
        } else {
            cardRaised = false;
        }
        return cardRaised;
    }

    public Integer getValue(Player p) {
        if (players.containsKey(p)) {
            return players.get(p);
        } else {
            return null;
        }
    }

    public Player getWinner() {
        Player winner = null;
        int highestScore = 0;

        for (Map.Entry<Player, Integer> entry : players.entrySet()) {
            Player player = entry.getKey();
            int score = entry.getValue();

            if (score <= 21 && score > highestScore) {
                highestScore = score;
                winner = player;
            }
        }
        return winner;
    }

    @Override
    public String toString() {
        return "Blackjack{" +
                "players=" + players +
                '}';
    }
}
