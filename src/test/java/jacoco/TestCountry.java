package jacoco;

import org.junit.Assert;
import models.Country;
import org.junit.Test;

public class TestCountry {

    @Test
    public void CheckCountryName() {
        Country country = new Country("Ukraine", "UA");
        Assert.assertTrue(country.getName().equals("Ukraine"));
    }

    @Test
    public void CheckCountryShortName(){
        Country country = new Country("Ukraine", "UA");
        Assert.assertEquals("Short name asserted", country.getShort_name(), "UA");
    }
}
