package A_Exercise_HashMap_BlackJack;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Ping Pong", 21);
        Player p2 = new Player("King Kong", 34);
        Player p3 = new Player("Ding Dong", 26);
        Player p4 = new Player("Bing Bong", 47);
        Player p5 = new Player("Sing Song", 41);
        Player p6 = new Player("Ting Tong", 32);

        Blackjack game1 = new Blackjack();
        game1.add(p1);
        game1.add(p2);
        game1.add(p3);
        game1.add(p4);
        game1.add(p5);
        game1.add(p6);

        game1.addCard(p5, 3);
        game1.addCard(p1, 11);
        game1.addCard(p2, 10);
        game1.addCard(p3, 8);
        game1.addCard(p4, 5);
        game1.addCard(p6, 7);

        game1.addCard(p5, 9);
        game1.addCard(p1, 4);
        game1.addCard(p2, 8);
        game1.addCard(p3, 9);
        game1.addCard(p4, 11);
        game1.addCard(p6, 11);

        System.out.println("Winner: ");
        System.out.println(game1.getWinner());

    }
}
