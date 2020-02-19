package flightsearch.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "flights")
public class Entity {

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
