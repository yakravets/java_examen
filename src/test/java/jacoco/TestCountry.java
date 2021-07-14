package jacoco;

import org.junit.Assert;
import models.Country;
import org.junit.Test;

public class TestCountry {

    @Test
    public void CheckCountryName() {
        Country country = new Country();
        country.setName("Ukraine");
        Assert.assertEquals(country.getName(), "Ukraine");
    }

    @Test
    public void CheckCountryShortName(){
        Country country = new Country();
        country.setShortName("UA");
        Assert.assertEquals(country.getShortName(), "UA");
    }

    @Test
    public void CheckCountryId(){
        Country country = new Country("Ukraine", "UA");
        country.setId(1);
        Assert.assertEquals(country.getId(), 1);
    }

    @Test
    public void TestConstructorWithParameters(){
        Country country = new Country("test", "test");
        Assert.assertNotNull(country);
    }
}
