package main.java.soundsystem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.java.soundsystem.bean.CDPlayer;
import main.java.soundsystem.config.BeanConfig;
import main.java.soundsystem.interfaces.CompactDisc;

public class MainEnter {
	private static final Log log = LogFactory.getLog(MainEnter.class);
			
	public static void main(String[] args) {
		log.info("--SATRT--");
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		CompactDisc cd = context.getBean(CompactDisc.class);
		CDPlayer player = context.getBean(CDPlayer.class);
		
		cd.play();
		player.play();
	}

}
