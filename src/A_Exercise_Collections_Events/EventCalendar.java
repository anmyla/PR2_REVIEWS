package A_Exercise_Collections_Events;

import java.util.ArrayList;
import java.util.HashMap;

public class EventCalendar {
    ArrayList<Event> calendar;

    public EventCalendar() {
        this.calendar = new ArrayList<>();
    }

    public void addEvent(Event item) {
        calendar.add(item);
    }

    public void printEventCalendar() {
        for (Event item : calendar) {
            System.out.print(item);
        }
    }
    public Event getByTitle(String title) {
        Event eventsearched = calendar.get(0);
        for (Event item : calendar) {
            if (item.getTitle().equals(title)) {
                System.out.println("Event found!");
                eventsearched = item;
                break;  // Exit the loop after finding the object
            }
        }
        if (eventsearched == null) {
            System.out.println("No events found!");
        }
        return eventsearched;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> eventListByOrt = new ArrayList<>();

        for (Event item : calendar) {
            if (ort.equals(item.getOrt())) {
                eventListByOrt.add(item);
            }
        }
        return eventListByOrt;
    }

    public ArrayList<Event> getByTicket(double min, double max) {
        ArrayList<Event> eventListByPrice = new ArrayList<>();

        for (Event item : calendar) {
            if ((item.getTicket() >= min) && (item.getTicket() <= max)) {
                eventListByPrice.add(item);
            }
        }
        return eventListByPrice;
    }

    public Event getTheMostExpensiveByOrt(String ort) {
        Event mostExpensiveEvent = null;
        double highestX = 0;
        double temp = 0;

        for (Event item : calendar) {
            temp = item.getTicket();
            if (item.getOrt().equals(ort) && (temp > highestX)) {
                mostExpensiveEvent = item;
                highestX = temp;
            }
        }
        return mostExpensiveEvent;
    }

    public double getAvgPriceByOrt(String ort) {
        int counter = 0;
        double sum = 0;
        for (Event item : calendar) {
            if (item.getOrt().equals(ort)) {
                sum = sum + item.getTicket();
                counter++;
            }
        }
        return sum / counter;
    }
    public HashMap<String, Integer> getCountEventsByOrt() {
        HashMap<String, Integer> eventCountPerOrt = new HashMap<>();
        for (Event item : calendar) {
            String ort = item.getOrt();
            eventCountPerOrt.put(ort, eventCountPerOrt.getOrDefault(ort, 0) + 1);
        }
        return eventCountPerOrt;
    }

    HashMap<String, Double> getSumPriceEventsByOrt() {
        HashMap<String, Double> eventCostSumPerOrt = new HashMap<>();
        String ort;
        double cost;
        double currentSum;

        for (Event item : calendar) {
            ort = item.getOrt();
            cost = item.getTicket();

            if (eventCostSumPerOrt.containsKey(ort)) {
                currentSum = eventCostSumPerOrt.get(ort);
                eventCostSumPerOrt.put(ort, currentSum + cost);
            } else {
                eventCostSumPerOrt.put(ort, cost);
            }
        }
        return eventCostSumPerOrt;
    }

    public void printList(ArrayList<Event> calendar) {
        for (Event item : calendar) {
            System.out.print(item);
        }
    }
}
