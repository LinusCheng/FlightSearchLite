package flightsearch.Service;

import flightsearch.Req.FlightReq;
import flightsearch.Res.FlightRes;

import java.util.List;

public interface FlightService {

    public List<FlightRes> getFlights(FlightReq flightReq);

}
