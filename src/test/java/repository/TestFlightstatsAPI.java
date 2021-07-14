package repository;

import org.junit.Assert;
import org.junit.Test;

public class TestFlightstatsAPI {

    @Test
    public void TestURL() {
        FlightstatsAPI api = new aircraftRepositoryAPI();
        Assert.assertNotNull(api.getUrl());
        Assert.assertNotEquals("", api.getUrl());
    }

    @Test
    public void TestAppId() {
        FlightstatsAPI api = new aircraftRepositoryAPI();
        api.setAppId("TEST");
        Assert.assertEquals("TEST", api.getAppId());
    }

    @Test
    public void TestAppKey() {
        FlightstatsAPI api = new aircraftRepositoryAPI();
        api.setAppKey("TEST_KEY");
        Assert.assertEquals("TEST_KEY", api.getAppKey());
    }
}
