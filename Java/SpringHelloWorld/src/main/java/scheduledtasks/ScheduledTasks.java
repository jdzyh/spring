package main.java.scheduledtasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	private static final Log log = LogFactory.getLog(ScheduledTasks.class);
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	
	@Scheduled(fixedRate=1000)
	public void reportCurrentTime(){
		log.info("The time is now "+dateFormat.format(new Date()));
	}
	
	@Scheduled(fixedRate=500)
	public void reportXXX(){
		log.info("XXXXX");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
