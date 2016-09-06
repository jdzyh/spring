package main.java.testframework.serviceLocatorBeans;

import main.java.testframework.serviceLocatorBeans.ClientService;

public class DefaultServiceLocator {
	private ClientService clientService;
    
	public DefaultServiceLocator(ClientService clientService){
		this.clientService = clientService;
	}
	
	public ClientService createClientServiceInstance() {
		return clientService;
    }
}
