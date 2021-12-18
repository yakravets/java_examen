package application.externalservices;

import org.junit.Assert;
import org.junit.Test;

public class TestAirlineRepositoryAPI {

    @Test
    public void CreateObject() {
        AirlineRepositoryAPI api = new AirlineRepositoryAPI();
        Assert.assertNotNull(api);
    }
}
