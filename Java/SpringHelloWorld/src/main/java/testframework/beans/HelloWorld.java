package main.java.testframework.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import main.java.scheduledtasks.ScheduledTasks;

public class HelloWorld {
	private static final Log log = LogFactory.getLog(ScheduledTasks.class);
	
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void printMsg(){
		log.info("HelloWorld's msg is " + msg);
	}
}
