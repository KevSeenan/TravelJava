import org.junit.Before;
import org.junit.Test;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger, passenger2, passenger3;
    Date date;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane,"LHR243","LHR","GLA", this.date);
        passenger = new Passenger("Jim Seenan",2);
        passenger2 = new Passenger("Gerry Seenan",3);
        passenger3 = new Passenger("Kathleen Seenan",1);
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
        assertEquals(this.date, flight.flightDepartureTimeCheck());
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

    @Test
    public void canCheckNumberOfAvailableSeats() {
        assertNotNull(flight);
        assertNotNull(passenger);

        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(2, flight.availableSeatsCheck());

    }

}
