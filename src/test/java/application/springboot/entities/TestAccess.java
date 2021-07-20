package application.springboot.entities;

import org.junit.Assert;
import org.junit.Test;

public class TestAccess {

    @Test
    public void TestAccessTypes() {

        Assert.assertEquals("ALL", Access.ALL.name());
        Assert.assertEquals("READ", Access.READ.name());
        Assert.assertEquals("READ", Access.READ.name());
        Assert.assertEquals("NONE", Access.NONE.name());

    }
}
