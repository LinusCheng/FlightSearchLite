package flightsearch.Config;

import flightsearch.Repo.Repo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories(basePackageClasses= Repo.class)
@Configuration
public class MongodbConfig {


}
