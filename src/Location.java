import java.util.ArrayList;

public class Location {
    /**
     * Definimos los parámetros para el país, donde se nos especifica que debe tener muchas ubicaciones
     * y cada ubicación tiene diferentes recintos.
     */
    private int id, LocationCapacity;
    private String name;
    ArrayList<Enclosure> enclosures = new ArrayList<Enclosure>();

    Location(){}

    public Location(int id, int locationCapacity, String name, ArrayList<Enclosure> enclosures) {
        this.id = id;
        LocationCapacity = locationCapacity;
        this.name = name;
        this.enclosures = enclosures;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getLocationCapacity() {
        return LocationCapacity;
    }
    public void setLocationCapacity(int locationCapacity) {
        LocationCapacity = locationCapacity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }
    public void setEnclosures(ArrayList<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }
}
