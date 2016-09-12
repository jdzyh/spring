package main.java.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="main.java.soundsystem")
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
