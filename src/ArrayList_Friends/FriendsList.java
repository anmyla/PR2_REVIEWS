package ArrayList_Friends;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class FriendsList {
    private List<Friend> friends = new ArrayList<>();

    public List<Friend> getFriends() {
        return friends;
    }

    public void print(ArrayList<Friend> friends) {
        friends.forEach((f) -> System.out.println(f));
    }

    public void print() {

        //solution 1:
        friends.forEach((f) -> System.out.println(f));

        //solution 2:
//        for (Friend f: friends) {
//            System.out.println(f);
//        }

        //solution 3:    size() instead of length() (array)
//        for (int i = 0; i < friends.size() ; i++) {
//            System.out.println(friends.get(i));
//        }
    }

    public void addFriend(Friend f) {
        friends.add(f);
    }

    public ArrayList<Friend> friendsFrom(String city) {
        ArrayList<Friend> result = new ArrayList<>();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCity().equals(city)) {
                result.add(friends.get(i));
            }
        }
        return result;
    }

    public Friend findOldestFriend() {
        int year = Year.now().getValue();
        Friend oldestFriend = friends.get(0);
        int howLong = year - friends.get(0).getKnownSince();

        for (int i = 0; i < friends.size(); i++) {
            if ((year - friends.get(i).getKnownSince()) > howLong) {
                howLong = year - friends.get(i).getKnownSince();
                oldestFriend = friends.get(i);
            }

        }
        return oldestFriend;
    }

//    public ArrayList<Friend> removeFriend(Friend f){
//        ArrayList<Friend> delete = new ArrayList<>();
//        for (int i = 0; i < friends.size(); i++) {
//            if (friends.get(i).equals(f)){
//                delete.remove(friends.get(i));
//            }
//        }
//        return delete;
//    }

    public void removeFriend(Friend f) {
        friends.remove(f);
    }

    public ArrayList<Friend> friendsAbroad(String homeCountry) {
        ArrayList<Friend> overseasFriends = new ArrayList<>();
        for (int i = 0; i < friends.size(); i++) {
            if (!friends.get(i).getCountry().equals(homeCountry)) {
                overseasFriends.add(friends.get(i));
            }
        }
        return overseasFriends;
    }

}

