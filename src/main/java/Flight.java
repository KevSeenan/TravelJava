import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public int passengerCount() {
        return this.passengers.size();
    }
}
