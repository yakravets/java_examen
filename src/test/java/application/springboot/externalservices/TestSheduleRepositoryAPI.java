package application.springboot.externalservices;

import org.junit.Assert;
import org.junit.Test;

public class TestSheduleRepositoryAPI {
    @Test
    public void CreateObject() {
        SheduleRepositoryAPI api = new SheduleRepositoryAPI();
        Assert.assertNotNull(api);
    }
}
