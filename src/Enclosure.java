public class Enclosure {
    private int enclosureCountryID, enclosureID, capacity;
    private String location;

    Enclosure(){
        
    }
    
    public Enclosure(int enclosureCountryID, int enclosureID, int capacity, String location) {
        this.enclosureCountryID = enclosureCountryID;
        this.enclosureID = enclosureID;
        this.capacity = capacity;
        this.location = location;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
