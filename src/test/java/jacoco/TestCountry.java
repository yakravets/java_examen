package jacoco;

import org.junit.Assert;
import models.Country;
import org.junit.Test;

public class TestCountry {

    @Test
    public void CheckCountryName() {
        Country country = new Country();
        country.setName("Ukraine");
        Assert.assertTrue(country.getName().equals("Ukraine"));
    }

    @Test
    public void CheckCountryShortName(){
        Country country = new Country();
        country.setShortName("UA");
        Assert.assertEquals("Short name asserted", country.getShortName(), "UA");
    }

    @Test
    public void CheckCountryId(){
        Country country = new Country("Ukraine", "UA");
        country.setId(1);
        Assert.assertTrue(country.getId() == 1);
    }
}
