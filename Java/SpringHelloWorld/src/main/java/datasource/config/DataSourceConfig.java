package main.java.datasource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

import main.java.datasource.bean.AClass;
import main.java.datasource.bean.BClass;
import main.java.datasource.bean.BaseClass;
import main.java.datasource.bean.CClass;

@Configuration
//@Import({AConfig.class,BConfig.class})
public class DataSourceConfig {

	@Bean
	public CClass getCClass(){
		return new CClass("I'm CClass.");
	}
	
	@Bean
	@Profile("dev")
	public BaseClass getAClass(){
		return new AClass("I'm AClass.");
	}
	
	@Bean
	@Profile("prod")
	public BaseClass getBClass(){
		return new BClass("I'm BClass.");
	}
}
