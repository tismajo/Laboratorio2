import java.util.ArrayList;

public class Enclosure {
    private int enclosureCountryID, enclosureID, enclosureCapacity;
    private String location;
    ArrayList<Event> events = new ArrayList<Event>();

    Enclosure(){}

    public Enclosure(int enclosureCountryID, int enclosureID, int enclosureCapacity, String location,
            ArrayList<Event> events) {
        this.enclosureCountryID = enclosureCountryID;
        this.enclosureID = enclosureID;
        this.enclosureCapacity = enclosureCapacity;
        this.location = location;
        this.events = events;
    }

    public int getEnclosureCountryID() {
        return enclosureCountryID;
    }
    public void setEnclosureCountryID(int enclosureCountryID) {
        this.enclosureCountryID = enclosureCountryID;
    }
    public int getEnclosureID() {
        return enclosureID;
    }
    public void setEnclosureID(int enclosureID) {
        this.enclosureID = enclosureID;
    }
    public int getEnclosureCapacity() {
        return enclosureCapacity;
    }
    public void setEnclosureCapacity(int enclosureCapacity) {
        this.enclosureCapacity = enclosureCapacity;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public ArrayList<Event> getEvents() {
        return events;
    }
    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }


}
