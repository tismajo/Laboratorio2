import java.util.Date;

public class Event {
    private int eventID, eventCountryID, timeTable, eventDuration, eventAttendeesNumber;
    private String artistName;
    private Date eventDate;

    Event(){
        
    }

    public Event(int eventID, int eventCountryID, int timeTable, int eventDuration, int eventAttendeesNumber,
            String artistName, Date eventDate) {
        this.eventID = eventID;
        this.eventCountryID = eventCountryID;
        this.timeTable = timeTable;
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
    public int getTimeTable() {
        return timeTable;
    }
    public void setTimeTable(int timeTable) {
        this.timeTable = timeTable;
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
}
