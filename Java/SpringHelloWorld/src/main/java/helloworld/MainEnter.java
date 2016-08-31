package main.java.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEnter {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("main/resources/Beans.xml");
		
		HelloWorld obj = context.getBean("hello", HelloWorld.class);
		
		obj.printMsg();

	}

}
