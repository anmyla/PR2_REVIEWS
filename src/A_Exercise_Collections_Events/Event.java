package A_Exercise_Collections_Events;

public class Event {

    private String title;
    private String ort;

    private double ticket;

    public Event(String title, String ort, double ticket) {
        this.title = title;
        this.ort = ort;
        this.ticket = ticket;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getTicket() {
        return ticket;
    }

    public void setTicket(double ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Event : " +
                "TITLE: " + title + '\'' +
                ", ORT: " + ort + '\'' +
                ", TICKET: " + ticket + '\n';
    }
}