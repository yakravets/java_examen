package jacoco;

import models.Airport;
import models.Terminal;
import org.junit.Assert;
import org.junit.Test;

public class TestTermial {

    @Test
    public void TestName() {
        Terminal terminal = new Terminal();
        terminal.setName("Test");
        Assert.assertEquals(terminal.getName(), "Test");
    }

    @Test
    public void TestId() {
        Terminal terminal = new Terminal();
        terminal.setId(5);
        Assert.assertEquals(terminal.getId(), 5);
    }

    @Test
    public void TestAirport() {
        Airport airport = new Airport();
        Terminal terminal = new Terminal();
        terminal.setAirport(airport);
        Assert.assertNotNull(terminal.getAirport());
    }

    @Test
    public void TestConstructorWithParameters() {
        Airport airport = new Airport();
        Terminal terminal = new Terminal("Test", airport);
        Assert.assertNotNull(terminal);
    }
}
