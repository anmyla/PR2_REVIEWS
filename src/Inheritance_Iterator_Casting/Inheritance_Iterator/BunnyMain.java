package Inheritance_Iterator_Casting.Inheritance_Iterator;

public class BunnyMain {
    public static void main(String[] args) {


        ChristmasRabbit pong = new ChristmasRabbit("Pong");
        pong.bringsGifts();

        pong.hop();
        pong.sleep();
        pong.eat("apples");

        System.out.println("------------------------------------------------");

        EasterRabbit ping = new EasterRabbit("Ping");
        ping.bringsEasterEggs();

        ping.hop();
        ping.sleep();
        ping.eat("carrots");
        ping.hidesEsterEggs();


        System.out.println("------------------------------------------------");


        BunnyStall rabbitStall = new BunnyStall();
        rabbitStall.addRabbit(pong);
        rabbitStall.addRabbit(ping);

        System.out.println("Using ArrayList");
        rabbitStall.allBunnyHops();

        System.out.println("------------------------------------------------");
        System.out.println("Using Iterator");
        rabbitStall.allBunnyHops2();


    }
}
