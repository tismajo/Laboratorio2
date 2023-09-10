public class Country {
    /**
     * Definimos los parámetros para el país, donde se nos especifica que debe tener muchas ubicaciones
     * y cada ubicación tiene diferentes recintos.
     */
    private String countryName, countryLocation, CountryEnclosure;

    public Country(String countryName, String countryLocation, String countryEnclosure) {
        this.countryName = countryName;
        this.countryLocation = countryLocation;
        CountryEnclosure = countryEnclosure;
    }

    public String getCountryLocation() {
        return countryLocation;
    }

    public void setCountryLocation(String countryLocation) {
        this.countryLocation = countryLocation;
    }

    Country(){

    }
}
