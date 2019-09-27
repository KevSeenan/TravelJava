public class FlightManager {

    private Flight flight;


    public FlightManager(Flight flight) {

        this.flight = flight;
    }

    public int reservedBaggageWeight() {
        int totalWeight = flight.getPlane().getWeight();
        int baggageWeight = totalWeight/2;
        return baggageWeight / flight.getPlane().getCapacity();
    }
}
