package application.springboot.externalservices;

import application.springboot.externalservices.AirlineRepositoryAPI;
import org.junit.Assert;
import org.junit.Test;

public class TestAirlineRepositoryAPI {

    @Test
    public void CreateObject() {
        AirlineRepositoryAPI api = new AirlineRepositoryAPI();
        Assert.assertNotNull(api);
    }
}
