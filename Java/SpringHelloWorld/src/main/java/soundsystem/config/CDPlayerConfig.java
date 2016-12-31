package main.java.soundsystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import main.java.soundsystem.bean.CDPlayer;
import main.java.soundsystem.bean.SuperCellDisc;
import main.java.soundsystem.interfaces.CompactDisc;

@Configuration
@PropertySource("classpath:/main/java/soundsystem/config/env.property")//…Í√˜ Ù–‘‘¥
//@ComponentScan(basePackages="main.java.soundsystem")
public class CDPlayerConfig {
	@Autowired
	Environment env;
	
	@Bean
	public CompactDisc superCellDisc(){
		SuperCellDisc scd = new SuperCellDisc(
					env.getProperty("disc.title", "Default Title Value."),
					env.getProperty("disc.artist", "Default Artist Value.")
				);
		scd.setRoll( env.getProperty("disc.roll",Integer.class, 10) );
		return scd;
	}
	
	@Bean
	public CDPlayer cdplayer(CompactDisc cd){
		return new CDPlayer(cd);
	}
}
