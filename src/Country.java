public class Country {
    private String countryName, location, enclosure;

    public Country(String country, String location, String enclosure) {
        this.countryName = country;
        this.location = location;
        this.enclosure = enclosure;
    }

    public String getCountry() {
        return countryName;
    }

    public void setCountry(String country) {
        this.countryName = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }
}
