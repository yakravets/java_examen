package models;

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
    public void TestConstructorWithParameters(){
        Country country = new Country("test", "test");
        Assert.assertNotNull(country);
    }

    @Test
    public void TestCitiesList() {
        Country country = new Country();
        Assert.assertNull(country.getCities());

        ArrayList<City> cities = new ArrayList<>();
        country.setCities(cities);
        Assert.assertNotNull(country.getCities());
    }

    @Test
    public void TestAirportsList() {
        Country country = new Country();
        Assert.assertNull(country.getAirports());

        ArrayList<Airport> airports = new ArrayList<>();
        country.setAirports(airports);
        Assert.assertNotNull(country.getAirports());
    }
}
