package main.java.datasource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import main.java.datasource.bean.AClass;
import main.java.datasource.bean.BaseClass;

@Configuration
@Profile("dev")
public class AConfig {
	@Bean
	public BaseClass getAClass(){
		return new AClass("I'm AClass.");
	}
}
