package main.java.scheduledtasks;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan
@EnableScheduling
public class Application {
	private static final Log log = LogFactory.getLog(ScheduledTasks.class);
	
	public static void main(String[] args) {
		log.info("---START---");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

	}

}
