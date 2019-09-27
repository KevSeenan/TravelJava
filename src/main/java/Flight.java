import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public int passengerCount() {
        return this.passengers.size();
    }

    public String flightNumberCheck() {
        return this.flightNumber;
    }

    public String flightDestinationCheck() {
        return this.destination;
    }

    public String flightDepartureAirport() {
        return this.departureAirport;
    }

    public String flightDepartureTimeCheck() {
        return this.departureTime;
    }

    public void addPassenger(Passenger passenger) {
        if(this.passengerCount() < this.availableSeatsCheck()){
            this.passengers.add(passenger);
        }
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }

    public int availableSeatsCheck() {
        return this.plane.getCapacity() - this.passengerCount();
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}