package main.java.concert.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import main.java.concert.bean.Audience;
import main.java.concert.bean.CountPerform;
import main.java.concert.bean.Drama;
import main.java.concert.bean.Musical;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class JavaConfig {
	
	@Bean
	public Audience audience(){
		return new Audience();
	}
	
	@Bean
	@Qualifier("musical")
	public Musical musical(){
		return new Musical();
	}
	
	@Bean
	@Qualifier("drama")
	public Drama drama(){
		return new Drama();
	}
	
	@Bean
	public CountPerform countPerform(){
		return new CountPerform();
	}
}
