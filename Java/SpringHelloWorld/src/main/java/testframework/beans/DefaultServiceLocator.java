package main.java.testframework.beans;

import main.java.testframework.beans.ClientService;

public class DefaultServiceLocator {
	private ClientService clientService;
    
	public DefaultServiceLocator(ClientService clientService){
		this.clientService = clientService;
	}
	
	public ClientService createClientServiceInstance() {
		return clientService;
    }
}
