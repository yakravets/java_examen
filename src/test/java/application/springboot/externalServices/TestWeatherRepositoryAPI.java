package application.springboot.externalServices;

import org.junit.Assert;
import org.junit.Test;

public class TestWeatherRepositoryAPI {
    @Test
    public void CreateObject() {
        WeatherRepositoryAPI api = new WeatherRepositoryAPI();
        Assert.assertNotNull(api);
    }
}
