package main.java.datasource.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import main.java.datasource.bean.BaseClass;
import main.java.datasource.bean.CClass;
import main.java.datasource.config.DataSourceConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DataSourceConfig.class)
@ActiveProfiles("prod")
public class DataSourceTest {
	
	@Autowired
	private BaseClass testclass;
	
	@Autowired
	private CClass cclass;
	
	@Test
	public void test1(){
		testclass.display();
		assertNotNull(testclass);
	}
	
	@Test
	public void test2(){
		cclass.display();
		assertNotNull(cclass);
	}
	

}
