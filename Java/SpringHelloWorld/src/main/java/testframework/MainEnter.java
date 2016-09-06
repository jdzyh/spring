package main.java.testframework;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.testframework.methodInjectionBeans.CommandManager;
import main.java.testframework.serviceLocatorBeans.ClientService;
import main.java.testframework.serviceLocatorBeans.UserInfo;

public class MainEnter {
	private static final Log log = LogFactory.getLog(MainEnter.class);
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("main/java/testframework/applicationContext.xml");

		
		ClientService clientService = context.getBean("clientService", ClientService.class);
		log.info(clientService.getMsg());
		
		CommandManager commandManager = (CommandManager) context.getBean("commandManager");
		String s = (String)commandManager.process("Method Injection.!!");
		log.info(s);
	}

}
