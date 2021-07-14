package jacoco;

import models.Airport;
import models.Country;
import models.Terminal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAirport {

    @Test
    public void TestId(){
        Airport airport = new Airport();
        airport.setId(10);
        Assert.assertTrue(airport.getId() == 10);
    }

    @Test
    public void TestName() {

        Airport airport = new Airport();
        airport.setName("Boryspil");
        Assert.assertTrue(airport.getName().equals("Boryspil"));

    }

    @Test
    public void TestIataCode() {
        Airport airport = new Airport();
        airport.setIataCode("BSP");
        Assert.assertTrue(airport.getIataCode().equals("BSP"));
    }

    @Test
    public void TestIcaoCode() {
        Airport airport = new Airport();
        airport.setIcaoCode("EEUE");
        Assert.assertTrue(airport.getIcaoCode().equals("EEUE"));
    }

    @Test
    public void TestCountry() {
        Airport airport = new Airport();
        Country country = new Country();
        airport.setCountry(country);
        Assert.assertTrue(airport.getCountry().equals(country));
    }

    @Test
    public void TestLatitudeLongitude() {
        Airport airport = new Airport();
        airport.setLatitude(10.45);
        Assert.assertTrue(airport.getLatitude() == 10.45);
        airport.setLongitude(12.15);
        Assert.assertTrue(airport.getLongitude() == 12.15);
    }

    @Test
    public void TestStatus() {
        Airport airport = new Airport();
        airport.setStatus("OK");
        Assert.assertTrue(airport.getStatus().equals("OK"));
    }

    @Test
    public void TestTerminalsList() {

        Airport airport = new Airport();
        List<Terminal> terminals = new ArrayList<Terminal>();
        airport.setTerminals(terminals);

        Assert.assertTrue(airport.getTerminals().size() == 0);

        Terminal terminal = new Terminal("A", airport);
        terminals.add(terminal);
        Assert.assertTrue(airport.getTerminals().size() == 1);

    }

    @Test
    public void TestConstructorWithparameters() {
        Country country = new Country();
        Airport airport = new Airport("TEST", "ICAO", "IATA", "OK", 1.5, 2.5, country);
        Assert.assertNotNull(airport);
    }
}
