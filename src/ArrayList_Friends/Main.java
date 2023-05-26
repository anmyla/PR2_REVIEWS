package ArrayList_Friends;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Friend adam = new Friend("Adam", 30, "Graz", "Austria", 2016);
        Friend eve = new Friend("Eve", 29, "Vienna", "Austria", 2010);
        Friend mary = new Friend("Mary", 27, "Linz", "Austria", 2019);
        Friend rose = new Friend("Rose", 32, "Linz", "Austria", 2014);
        Friend liza = new Friend("Liza", 40, "Baguio", "Philippines", 1998);

        FriendsList friendsList = new FriendsList();

        friendsList.addFriend(adam);
        friendsList.addFriend(eve);
        friendsList.addFriend(mary);
        friendsList.addFriend(rose);
        friendsList.addFriend(liza);

        friendsList.print();

        System.out.println('\n' +"ArrayList friendsFrom()" );
//  this part can be written as a method overload of the print()
//        ----------------------------------------------------------
//        solution 1:
//        ArrayList<Friend> from = friendsList.friendsFrom("Linz");
//        for (Friend f: from) {
//            System.out.println(f);
//        }
//        ------------------------------------------------------------
        ArrayList<Friend> linzFriends = friendsList.friendsFrom("Linz");
        friendsList.print(linzFriends);

        System.out.println('\n' + "Find Oldest Friend Method" );
        System.out.println(friendsList.findOldestFriend());

        System.out.println('\n' + "Remove Friend Method" );
        friendsList.removeFriend(mary);
        friendsList.print();

        System.out.println('\n' + "Friends Abroad" );
        System.out.println(friendsList.friendsAbroad("Austria"));
    }
}
