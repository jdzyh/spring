package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import spittr.data.SpittleRepositoryImp;

@Configuration
@ComponentScan(basePackages={"spittr"}, excludeFilters = {@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {
	@Bean
	public SpittleRepositoryImp spittleRepositoryImp(){
		return new SpittleRepositoryImp();
	}
}
