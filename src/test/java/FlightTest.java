import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void setUp() {
        flight = new Flight("LHR243","LHR","GLA","20.00");
        plane = new Plane(PlaneType.BOEING747);
        passenger = new Passenger("Jim Seenan",2);
    }

    @Test
    public void planeHasNoPassengers() {
        assertNotNull(flight);
        assertNotNull(plane);
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void flightHasANumber() {
        assertNotNull(flight);
        assertEquals("LHR243", flight.flightNumberCheck());
    }

    @Test
    public void flightHasADestination() {
        assertNotNull(flight);
        assertEquals("LHR", flight.flightDestinationCheck());
    }

    @Test
    public void flightHasADepartureAirport() {
        assertNotNull(flight);
        assertEquals("GLA", flight.flightDepartureAirport());
    }

    @Test
    public void flightHasADepertureTime() {
        assertNotNull(flight);
        assertEquals("20.00", flight.flightDepartureTimeCheck());
    }

    @Test
    public void canAddAPassenger() {
        assertNotNull(flight);
        assertNotNull(passenger);
        flight.addPassenger(passenger);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void canRemoveAPassenger() {
        assertNotNull(flight);
        assertNotNull(passenger);
        flight.removePassenger(passenger);
        assertEquals(0, flight.passengerCount());
    }

}
