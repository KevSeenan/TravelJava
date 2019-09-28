public class FlightManager {

    private Flight flight;
    private int bagWeight;


    public FlightManager(Flight flight) {

        this.flight = flight;
        this.bagWeight = 5;
    }

    public int reservedBaggageWeight() {
        int totalWeight = flight.getPlane().getWeight();
        int baggageWeight = totalWeight/2;
        return baggageWeight / flight.getPlane().getCapacity();
    }

    public int passengerBaggageWeight() {
        // for passenger in passenger ArrayList
        // get total number of bags for passengers
        // add bags each passenger has to numberOfBags
        // return the passenger baggage weight
        // by multiplying the bag weight by the number of bags

        int numberOfBags = 0;
        for(Passenger passenger : this.flight.getPassengers()){
            numberOfBags += passenger.getNumberOfBags();
        }
        return this.bagWeight * numberOfBags;
    }
}
