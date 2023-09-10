import java.util.Date;

public class Event {
    private int eventID, eventCountryID, eventTimeTable, eventDuration, eventAttendeesNumber;
    private String artistName;
    private Date eventDate;

    public Event(int eventID, int eventCountryID, int eventTimeTable, int eventDuration, int eventAttendeesNumber,
        String artistName, Date eventDate) {
        this.eventID = eventID;
        this.eventCountryID = eventCountryID;
        this.eventTimeTable = eventTimeTable;
        this.eventDuration = eventDuration;
        this.eventAttendeesNumber = eventAttendeesNumber;
        this.artistName = artistName;
        this.eventDate = eventDate;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getEventCountryID() {
        return eventCountryID;
    }

    public void setEventCountryID(int eventCountryID) {
        this.eventCountryID = eventCountryID;
    }

    public int getEventTimeTable() {
        return eventTimeTable;
    }

    public void setEventTimeTable(int eventTimeTable) {
        this.eventTimeTable = eventTimeTable;
    }

    public int getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(int eventDuration) {
        this.eventDuration = eventDuration;
    }

    public int getEventAttendeesNumber() {
        return eventAttendeesNumber;
    }

    public void setEventAttendeesNumber(int eventAttendeesNumber) {
        this.eventAttendeesNumber = eventAttendeesNumber;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    Event(){

    }

}
