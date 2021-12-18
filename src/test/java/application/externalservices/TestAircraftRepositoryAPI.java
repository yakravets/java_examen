package application.externalservices;

import org.junit.Assert;
import org.junit.Test;

public class TestAircraftRepositoryAPI {

    @Test
    public void CreateObject() {
        AircraftRepositoryAPI api = new AircraftRepositoryAPI();
        Assert.assertNotNull(api);
    }
}
