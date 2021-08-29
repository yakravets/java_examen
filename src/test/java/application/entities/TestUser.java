package application.entities;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class TestUser {

    @Test
    public void TestFirstName() {
        User user = new User();
        Assert.assertNotNull(user);

        user.setFirstName("Name");
        Assert.assertEquals("Name", user.getFirstName());
    }

    @Test
    public void TestLastName() {
        User user = new User();
        Assert.assertNotNull(user);

        user.setLastName("Test");
        Assert.assertEquals("Test", user.getLastName());
    }

    @Test
    public void TestId() {
        User user = new User();
        Assert.assertNotNull(user);

        user.setId(10L);
        Assert.assertEquals(10L, user.getId(), 0);
    }

    @Test
    public void TestEmail() {
        User user = new User();
        Assert.assertNotNull(user);
        user.setEmail("test@test.com");
        Assert.assertEquals("test@test.com", user.getEmail());
        Assert.assertTrue(user.getEmail().contains("@"));
        Assert.assertTrue(user.getEmail().contains("."));
    }

    @Test
    public void TestPassword() {
        User user = new User();
        Assert.assertNotNull(user);

        user.setPassword("12345678");
        Assert.assertEquals("12345678", user.getPassword());
    }

    @Test
    public void TestActive() {
        User user = new User();
        Assert.assertNotNull(user);

        user.setActive(true);
        Assert.assertTrue(user.isActive());
    }

    @Test
    public void TestBlocked() {
        User user = new User();
        Assert.assertNotNull(user);

        user.setBlocked(true);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void EmailConfirmed() {
        User user = new User();
        Assert.assertNotNull(user);

        user.setEmailConfirmed(true);
        Assert.assertTrue(user.isEmailConfirmed());
    }

    @Test
    public void TestDateRegistration() {
        User user = new User();
        Assert.assertNotNull(user);

        Date date = new Date();
        user.setDataRegistration(date);
        Assert.assertEquals(date, user.getDataRegistration());
    }
}
