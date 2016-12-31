package main.java.concert.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import main.java.concert.bean.Audience;
import main.java.concert.bean.CountPerform;
import main.java.concert.config.JavaConfig;
import main.java.concert.config.TopConfig;
import main.java.concert.interfaces.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TopConfig.class)
public class test {
	@Autowired
	public Audience audience;
	
	@Autowired
	public CountPerform countPerform;
	
	@Autowired
	@Qualifier("drama")
	public Performance performance;
	
	@Test
	public void testAudience(){
		assertNotNull(audience);
	}
	
	@Test
	public void testMusical(){
		assertNotNull(performance);
		performance.perform();
	}
	
	@Test
	public void testAopArgs(){
		performance.id(1);
		performance.id(2);
		performance.id(3);
		performance.id(3);
		performance.id(3);
		
		assertEquals(1,countPerform.getPerformCount(1));
		assertEquals(1,countPerform.getPerformCount(2));
		assertEquals(3,countPerform.getPerformCount(3));
	}
}
