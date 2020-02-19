package flightsearch.Res;

import lombok.Data;

@Data
public class FlightRes {

    private String flightNumber;
    private String carrier;
    private String origin;
    private String departure;
    private String destination;
    private String arrival;
    private String aircraft;
    private int distance;
    private String travelTime;
    private String status;

}
