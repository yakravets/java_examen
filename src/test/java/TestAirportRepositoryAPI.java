import application.springboot.externalservices.AirportRepositoryAPI;
import org.junit.Assert;
import org.junit.Test;

public class TestAirportRepositoryAPI {

    @Test
    public void CreateObject() {
        AirportRepositoryAPI api = new AirportRepositoryAPI();
        Assert.assertNotNull(api);
    }
}
