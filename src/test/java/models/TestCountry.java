package models;

import org.junit.Assert;
import org.junit.Test;

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
}
