package spittr.test;

import static org.junit.Assert.assertNotNull;

import java.io.PrintStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spittr.config.DaoConfig;
import spittr.dao.JdbcSpitterRepository;
import spittr.data.SpitterRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DaoConfig.class)
public class DaoTest {
	static final PrintStream stream = System.out;
	
	@Autowired
	JdbcSpitterRepository spitterRepository;
	
	@Test
	public void test() {
		assertNotNull(spitterRepository);
	}

	public static void main(String[] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoConfig.class);
		
		JdbcSpitterRepository spitterRepository = (JdbcSpitterRepository) context.getBean("spitterRepository");
		
		stream.println(spitterRepository);
	}
}
