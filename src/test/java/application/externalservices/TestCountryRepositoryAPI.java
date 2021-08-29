package application.externalservices;

import org.junit.Assert;
import org.junit.Test;

public class TestCountryRepositoryAPI {
    @Test
    public void CreateObject() {
        CountryRepositoryAPI api = new CountryRepositoryAPI();
        Assert.assertNotNull(api);
    }
}
