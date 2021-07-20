package application.springboot.entities;

import org.junit.Assert;
import org.junit.Test;

public class TestUser {

    @Test
    public void TestFirstName() {
        User user = new User();
        Assert.assertNotNull(user);

        user.setFirstName("Name");
        Assert.assertEquals("Name", user.getFirstName());
    }
}
