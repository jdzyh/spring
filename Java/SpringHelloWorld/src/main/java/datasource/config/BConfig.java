package main.java.datasource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import main.java.datasource.bean.BClass;
import main.java.datasource.bean.BaseClass;

@Configuration
@Profile("prod")
public class BConfig {
	@Bean
	public BaseClass getBClass(){
		return new BClass("I'm BClass.");
	}
}
