package application.springboot.entities;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class TestSession {

    @Test
    public void TestId() {

        Session session = new Session();
        Assert.assertNotNull(session);
        session.setId(10);
        Assert.assertEquals(10, session.getId());

    }

    @Test
    public void TestUser() {
        Session session = new Session();
        Assert.assertNotNull(session);

        User user = new User();
        Assert.assertNotNull(user);

        session.setUser(user);
        Assert.assertEquals(user, session.getUser());
    }

    @Test
    public void TestDate() {
        Session session = new Session();
        Assert.assertNotNull(session);

        Date date = new Date();
        session.setDate(date);

        Assert.assertEquals(date, session.getDate());
    }
}
