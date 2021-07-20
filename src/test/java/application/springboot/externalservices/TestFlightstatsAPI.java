package application.springboot.externalservices;

import application.springboot.externalservices.FlightstatsAPI;
import org.junit.Assert;
import org.junit.Test;

public class TestFlightstatsAPI {

    @Test
    public void TestURL() {
        FlightstatsAPI api = new FlightstatsAPI();
        Assert.assertNotNull(api.getUrl());
        Assert.assertNotEquals("", api.getUrl());
    }

    @Test
    public void TestAppId() {
        FlightstatsAPI api = new FlightstatsAPI();
        api.setAppId("TEST");
        Assert.assertEquals("TEST", api.getAppId());
    }

    @Test
    public void TestAppKey() {
        FlightstatsAPI api = new FlightstatsAPI();
        api.setAppKey("TEST_KEY");
        Assert.assertEquals("TEST_KEY", api.getAppKey());
    }
}
