package main.java.testframework.methodInjectionBeans;

public abstract class CommandManager {
	
	public Object process(Object commandState) {
		Command command = createCommand();
		command.setState(commandState);
		return command.excute();
	}
	protected abstract Command createCommand();
	
}
