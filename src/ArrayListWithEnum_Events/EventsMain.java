package ArrayListWithEnum_Events;

public class EventsMain {
    public static void main(String[] args) {
        Event event1 = new Event(EventType.LEISURE, "Ladies Night", "Graz", 150);
        Event event2 = new Event( EventType.TRAVEL, "Easter Holiday","Porec", 4000);
        Event event3 = new Event(EventType.LEISURE, "David's Birthday", "Graz", 25);
        Event event4 = new Event(EventType.LEISURE, "Poker Night", "Graz", 50);
        Event event5 = new Event(EventType.LEISURE, "Date Night", "Graz", 200);
        Event event6 = new Event(EventType.TRAVEL, "Philippine Holiday", "Palawan", 7000);

        EventCalendar myEvents = new EventCalendar();

        myEvents.add(event1);
        myEvents.add(event2);
        myEvents.add(event3);
        myEvents.add(event4);
        myEvents.add(event5);
        myEvents.add(event6);

        myEvents.print();

        System.out.println('\n' + "Find events by title------------------------------" );
        System.out.println(myEvents.getByTitle("David's Birthday"));


        System.out.println('\n' + "Find events by location---------------------------------" );
        myEvents.print(myEvents.getByLocation("Graz"));

        System.out.println('\n' + "Find events by type------------------------------" );
        myEvents.print(myEvents.getByType(EventType.LEISURE));

        System.out.println('\n' + "Find most expensive event-------------------" );
        System.out.println(myEvents.getMostExpensiveEvent());
//        myEvents.print(myEvents.getMostExpensiveEvent());

    }
}
