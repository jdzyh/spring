package main.java.soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.soundsystem.CDPlayer;
import main.java.soundsystem.CompactDisc;
import main.java.soundsystem.SuperCellDisc;

@Configuration
//@ComponentScan(basePackages="main.java.soundsystem")
public class CDPlayerConfig {

	@Bean
	public CompactDisc superCellDisc(){
		return new SuperCellDisc();
	}
	
	@Bean
	public CDPlayer cdplayer(CompactDisc cd){
		return new CDPlayer(cd);
	}
}
