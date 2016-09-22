package main.java.concert.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({JavaConfig.class})
@ImportResource("classpath:/main/java/concert/config/config.xml")
public class TopConfig {

}
