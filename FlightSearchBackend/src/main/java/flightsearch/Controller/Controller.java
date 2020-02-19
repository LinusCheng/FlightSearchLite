package flightsearch.Controller;

import flightsearch.Req.FlightReq;
import flightsearch.Res.FlightRes;
import flightsearch.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class Controller {

    @Autowired
    FlightService flightService;

    @PostMapping("/flight")
    public List<FlightRes> flight(@RequestBody FlightReq flightReq){
        return flightService.getFlights(flightReq);
    }

}
