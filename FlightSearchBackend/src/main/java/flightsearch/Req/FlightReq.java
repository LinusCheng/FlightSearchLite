package flightsearch.Req;

import lombok.Data;

@Data
public class FlightReq {
    private String flight_num;
    private String origin;
    private String destination;
    private String date;

}
