package main.java.concert.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import main.java.concert.bean.Audience;
import main.java.concert.config.JavaConfig;
import main.java.concert.interfaces.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaConfig.class)
public class test {
	@Autowired
	public Audience audience;
	
	@Autowired
	@Qualifier("drama")
	public Performance performance;
	
	@Test
	public void testMusical(){
		assertNotNull(performance);
		performance.perform();
	}
}
