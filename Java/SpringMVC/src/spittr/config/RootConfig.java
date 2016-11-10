package spittr.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import spittr.bean.Spittle;
import spittr.data.SpittleRepositoryImp;

@Configuration
@ComponentScan(basePackages={"spittr"}, excludeFilters = {@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {
	@Bean
	public SpittleRepositoryImp spittleRepositoryImp(){
		List<Spittle> retList = new ArrayList<Spittle>();
		for(int i=0;i<50; i++){
			Spittle spittle = new Spittle("message", new Date(), 1000.0, 1000.0);
			retList.add(spittle);
		}
		return new SpittleRepositoryImp(retList);
	}
	
	
}
