package jacoco;

import models.City;
import models.Country;
import org.junit.Assert;
import org.junit.Test;

public class TestCity {

    @Test
    public void CheckId()
    {
        City city = new City();
        city.setId(1);
        Assert.assertEquals(city.getId(), 1);
    }

    @Test
    public void CheckName(){
        City city = new City();
        city.setName("Rivne");
        Assert.assertEquals(city.getName(), "Rivne");
    }

    @Test
    public void CheckCountry(){
        Country country = new Country("Test","TEST");
        City city = new City();
        city.setCountry(country);
        Assert.assertNotNull(city.getCountry());
    }
}
