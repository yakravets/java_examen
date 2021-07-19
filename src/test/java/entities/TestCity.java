package entities;

import application.springboot.entities.City;
import application.springboot.entities.Country;
import org.junit.Assert;
import org.junit.Test;

public class TestCity {

    @Test
    public void CheckId()
    {
        City city = new City();
        city.setId(1);
        Assert.assertEquals(1, city.getId());
    }

    @Test
    public void CheckName(){
        City city = new City();
        city.setName("Rivne");
        Assert.assertEquals("Rivne", city.getName());
    }

    @Test
    public void CheckCountry(){
        Country country = new Country();
        City city = new City();
        city.setCountry(country);
        Assert.assertNotNull(city.getCountry());
    }
}
