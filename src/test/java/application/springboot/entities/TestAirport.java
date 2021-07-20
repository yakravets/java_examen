package application.springboot.entities;

import application.springboot.entities.Airport;
import application.springboot.entities.Country;
import application.springboot.entities.Terminal;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAirport {

    @Test
    public void TestId(){
        Airport airport = new Airport();
        airport.setId(10);
        Assert.assertEquals(10, airport.getId());
    }

    @Test
    public void TestName() {
        Airport airport = new Airport();
        airport.setName("Boryspil");
        Assert.assertEquals("Boryspil", airport.getName());
    }

    @Test
    public void TestIataCode() {
        Airport airport = new Airport();
        airport.setIataCode("BSP");
        Assert.assertEquals("BSP", airport.getIataCode());
    }

    @Test
    public void TestIcaoCode() {
        Airport airport = new Airport();
        airport.setIcaoCode("EEUE");
        Assert.assertEquals("EEUE", airport.getIcaoCode());
    }

    @Test
    public void TestCountry() {
        Airport airport = new Airport();
        Country country = new Country();
        airport.setCountry(country);
        Assert.assertEquals(airport.getCountry(), country);
    }

    @Test
    public void TestLatitudeLongitude() {
        Airport airport = new Airport();
        airport.setLatitude(10.45);
        Assert.assertEquals(10.45, airport.getLatitude(), 0);
        airport.setLongitude(12.15);
        Assert.assertEquals(12.15, airport.getLongitude(), 0);
    }

    @Test
    public void TestStatus() {
        Airport airport = new Airport();
        airport.setStatus("OK");
        Assert.assertEquals("OK", airport.getStatus());
    }

    @Test
    public void TestTerminalsList() {
        Airport airport = new Airport();
        List<Terminal> terminals = new ArrayList<>();
        airport.setTerminals(terminals);
        Assert.assertEquals(0, airport.getTerminals().size());

        Terminal terminal = new Terminal();
        terminal.setName("A");
        terminal.setAirport(airport);
        terminals.add(terminal);
        Assert.assertEquals(1, airport.getTerminals().size());
    }
}
