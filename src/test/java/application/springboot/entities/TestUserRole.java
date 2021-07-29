package application.springboot.entities;

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

    @Test
    public void TestAccess() {
        UserRole role = new UserRole();
        Assert.assertNotNull(role);

        role.setAccess(Access.ALL);
        Assert.assertEquals(Access.ALL, role.getAccess());
    }

    @Test
    public void TestTable() {
        UserRole role = new UserRole();
        Assert.assertNotNull(role);

        role.setTable("*");
        Assert.assertEquals("*", role.getTable());

        role.setTable("users");
        Assert.assertEquals("users", role.getTable());
    }

    @Test
    public void TestUser() {
        UserRole role = new UserRole();
        Assert.assertNotNull(role);
        Assert.assertNull(role.getUser());

        User user = new User();
        role.setUser(user);
        Assert.assertEquals(user, role.getUser());
    }
}
