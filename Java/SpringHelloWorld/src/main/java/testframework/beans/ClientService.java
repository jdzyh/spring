package main.java.testframework.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ClientService {
	private static final Log log = LogFactory.getLog(ClientService.class);
	
	private String msg;

	public ClientService(String msg, int id){
		this.msg = msg;
		log.info("Input ID is : "+id);
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
