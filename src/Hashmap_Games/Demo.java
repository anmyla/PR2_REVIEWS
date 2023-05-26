package Hashmap_Games;

public class Demo {
    public static void main(String[] args) {
        PlayerMap playerMap = new PlayerMap();
        Player p1 = new Player("Tim");
        Player p2 = new Player("Pit");
        Player p3 = new Player("Tom");

        playerMap.addOrUpdate(p1, 80);
        playerMap.addOrUpdate(p2, 50);
        playerMap.addOrUpdate(p3, 150);

        System.out.println(playerMap.getPlayer());
        playerMap.addOrUpdate(p1, 90);
        System.out.println(playerMap.getPlayer());

        System.out.println(playerMap.getPlayerWithPoints(85));
    }
}
