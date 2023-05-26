package ArrayListWithEnum_Events;

import java.util.ArrayList;

public class EventCalendar {
    private ArrayList<Event> events = new ArrayList<>();

    public void add(Event e) {
        events.add(e);
    }

    public void print(ArrayList<Event> events) {
        for (Event e : events) {
            System.out.println(e);
        }
//        events.forEach((e) -> System.out.println(e));
        System.out.println();
    }

    public void print() {
        for (Event e : events) {
            System.out.println(e);
        }
//        events.forEach((e) -> System.out.println(e));
        System.out.println();
    }

//    public Event getByTitle(String title) {
//        Event byTitle = new Event(title);
//        for (int i = 0; i < events.size(); i++) {
//            if (events.get(i).getTitle().equals(title)) {
////                byTitle.add(events.get(i));
//            }
//        }
//        return byTitle;
//    }

    public Event getByTitle(String title){
        Event result = null;
        for ( Event e: events) {
            String eventTitle = e.getTitle();
            if (eventTitle.equals(title)){
                result = e;
                break;
            }
        }
        return result;
    }

    public ArrayList<Event> getByType(EventType type) {
        ArrayList<Event> thisEventType = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getType().equals(type)) {
                thisEventType.add(events.get(i));
            }
        }
        return thisEventType;
    }

    public ArrayList<Event> getByLocation(String location) {
        ArrayList<Event> thisEventLocation = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getLocation().equals(location)) {
                thisEventLocation.add(events.get(i));
            }
        }
        return thisEventLocation;
    }

    public Event getMostExpensiveEvent() {
        Event mostExpensive = events.get(0);
        double storesPrice = 0;

        for (int i = 0; i < events.size(); i++) {
            if ((events.get(i).getPrice()) > storesPrice) {
                storesPrice = events.get(i).getPrice();
                mostExpensive = events.get(i);
            }
        }
        return mostExpensive;
    }

}
