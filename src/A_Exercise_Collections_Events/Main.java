package A_Exercise_Collections_Events;


public class Main {
    public static void main(String[] args) {
        Event event1 = new Event("Ladies Night", "Graz", 150);
        Event event2 = new Event("Easter Holiday","Porec", 4000);
        Event event3 = new Event("David's Birthday", "Graz", 25);
        Event event4 = new Event("Poker Night", "Graz", 50);
        Event event5 = new Event("Date Night", "Graz", 200);
        Event event6 = new Event("Philippine Holiday", "Palawan", 7000);

        EventCalendar myEvents = new EventCalendar();

        myEvents.addEvent(event1);
        myEvents.addEvent(event2);
        myEvents.addEvent(event3);
        myEvents.addEvent(event4);
        myEvents.addEvent(event5);
        myEvents.addEvent(event6);

        myEvents.printEventCalendar();

        System.out.println('\n' + "Find events by title:" );
        System.out.println(myEvents.getByTitle("David's Birthday"));


        System.out.println('\n' + "Find events by location:" );
        System.out.println(myEvents.getByOrt("Graz"));

        System.out.println('\n' + "Find most expensive event in a given Location:" );
        System.out.println(myEvents.getTheMostExpensiveByOrt("Graz"));

        System.out.println('\n' + "Find average price of events in a give location:" );
        System.out.println(myEvents.getAvgPriceByOrt("Graz"));

        System.out.println('\n' + "Find events that have ticket price/cost between given range" );
        myEvents.printList(myEvents.getByTicket(20,800));
    }
}
