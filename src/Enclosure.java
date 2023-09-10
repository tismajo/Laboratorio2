public class Enclosure {
    private int countryID, enclosureID, capacity;
    private String location;
    
    public Enclosure(int countryID, int enclosureID, int capacity, String location) {
        this.countryID = countryID;
        this.enclosureID = enclosureID;
        this.capacity = capacity;
        this.location = location;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
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
