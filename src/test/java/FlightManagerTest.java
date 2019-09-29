import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FlightManagerTest {

    Flight flight;
    Plane plane;
    Passenger passenger, passenger2, passenger3;
    FlightManager flightManager;
    Date date;

    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane,"LHR243","LHR","GLA",this.date);
        passenger = new Passenger("Jim Seenan",2);
        passenger2 = new Passenger("Gerry Seenan",3);
        passenger3 = new Passenger("Kathleen Seenan",1);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canCalculateReseveredBaggeWeight() {
        assertNotNull(flight);
        assertNotNull(plane);
        flight.addPassenger(passenger);
        assertEquals(30, flightManager.reservedBaggageWeight());

    }

    @Test
    public void canCalculateBaggageWeightBookedByPassengers() {
        assertNotNull(flight);
        assertNotNull(plane);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(30, flightManager.passengerBaggageWeight());
    }

    @Test
    public void canCalculateRemainingReservedWeightForBaggage() {
        assertNotNull(flight);
        assertNotNull(plane);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(0, flightManager.remainingBaggageWeight());
    }
}
