import application.springboot.entities.Airport;
import application.springboot.entities.City;
import application.springboot.entities.Country;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestCountry {

    @Test
    public void CheckCountryName() {
        Country country = new Country();
        country.setName("Ukraine");
        Assert.assertEquals("Ukraine", country.getName());
    }

    @Test
    public void CheckCountryShortName(){
        Country country = new Country();
        country.setShortName("UA");
        Assert.assertEquals("UA", country.getShortName());
    }

    @Test
    public void CheckCountryId(){
        Country country = new Country();
        country.setId(1);
        Assert.assertEquals(1, country.getId());
    }

    @Test
    public void TestCitiesList() {
        Country country = new Country();
        Assert.assertNotNull(country.getCities());

        ArrayList<City> cities = new ArrayList<>();
        country.setCities(cities);
        Assert.assertEquals(cities, country.getCities());
    }

    @Test
    public void TestAirportsList() {
        Country country = new Country();
        Assert.assertNotNull(country.getAirports());

        ArrayList<Airport> airports = new ArrayList<>();
        country.setAirports(airports);
        Assert.assertEquals(airports, country.getAirports());
    }
}
