package main.java.testframework;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.testframework.beans.ClientService;
import main.java.testframework.beans.UserInfo;

public class MainEnter {
	private static final Log log = LogFactory.getLog(MainEnter.class);
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("main/resources/Beans.xml");
		
		//HelloWorld obj = context.getBean("hello", HelloWorld.class);
		//obj.printMsg();
		
		UserInfo userInfo = context.getBean("userinfo", UserInfo.class);
		log.info(userInfo.getHelloworld().getMsg());
		
		ClientService clientService = context.getBean("clientService", ClientService.class);
		log.info(clientService.getMsg());
	}

}
