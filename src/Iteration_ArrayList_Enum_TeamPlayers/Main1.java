package Iteration_ArrayList_Enum_TeamPlayers;

public class Main1 {
    public static void main(String[] args) {


        Team t1 = new Team("Team A");

        Player p1 = new Player("player1A",  25);
        Player p2 = new Player("player1A",  50);
        Player p3 = new Player("player1A",  55);
        Player p4 = new Player("player1A",  5);
        Player p5 = new Player("player1A",  75);

        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);
        t1.addPlayer(p5);

        Team t2 = new Team( "Team B");
        Player p6 = new Player("player1B",  28);
        Player p7 = new Player("player2B", 25);
        Player p8 = new Player("player3B", 80);
        Player p9 = new Player("player4B",  15);
        Player p10 = new Player("player5B", 20);

        t2.addPlayer(p6);
        t2.addPlayer(p7);
        t2.addPlayer(p8);
        t2.addPlayer(p9);
        t2.addPlayer(p10);


        Team t3 = new Team( "Team C");
        Player p11 = new Player("player1C",  48);
        Player p12 = new Player("player2C", 52);
        Player p13 = new Player("player3C", 40);
        Player p14 = new Player("player4C",  35);
        Player p15 = new Player("player5C", 120);

        t3.addPlayer(p11);
        t3.addPlayer(p12);
        t3.addPlayer(p13);
        t3.addPlayer(p14);
        t3.addPlayer(p15);


        Management manage = new Management();
        manage.addTeam(t1);
        manage.addTeam(t2);
        manage.addTeam(t3);

        manage.print();

        System.out.println(manage.getWinnerTeam());
        System.out.println(manage.getBestPlayer());
        System.out.println(manage.getPlayerById(7));

    }
}
