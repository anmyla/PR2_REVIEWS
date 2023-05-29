package Enum_ArrayList_Hashmap_Event;

public class Event {
    private EventType type;
    private String title;
    private String location;
    private double price;

    public Event(EventType type, String title, String location, double price) {
        this.type = type;
        this.title = title;
        this.location = location;
        this.price = price;
    }

    public Event(String title) {
        this.title = title;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Event{" +
                "type: " + type +
                ", title: '" + title + '\'' +
                ", location: '" + location + '\'' +
                ", price: " + price +
                '}' + '\'';
    }
}
