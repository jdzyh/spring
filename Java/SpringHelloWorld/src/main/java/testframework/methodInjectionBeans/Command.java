package main.java.testframework.methodInjectionBeans;

public class Command {
	private static Command command = new Command();
	
	private Object commandStatus;
	
	public void setState(Object commandStatus){
		if(null==this.commandStatus||this.commandStatus.equals("")) this.commandStatus = commandStatus;
	}
	public Object excute(){
		return commandStatus.toString();
	}
	protected Command createCommand(){
		return command;
	}
}
