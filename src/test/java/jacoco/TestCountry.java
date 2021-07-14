package jacoco;

import org.junit.Assert;
import models.Country;
import org.junit.Test;

public class TestCountry {

    private Country country;

    public TestCountry() {

        this.country = new Country("Ukraine", "UA");

    }

    @Test
    public void CheckCountryName() {
        Assert.assertTrue(country.getName().equals("Ukraine"));
    }

    @Test
    public void CheckCountryShortName(){
        Assert.assertEquals("Short name asserted", country.getShort_name(), "UA");
    }
}
