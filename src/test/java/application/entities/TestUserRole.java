package application.entities;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRole {

    @Test
    public void TestId() {
        UserRole role = new UserRole();
        Assert.assertNotNull(role);

        role.setId(10);
        Assert.assertEquals(10, role.getId());
    }

    @Test
    public void TestName() {
        UserRole role = new UserRole();
        Assert.assertNotNull(role);

        role.setName("Admin");
        Assert.assertEquals("Admin", role.getName());
    }
}
