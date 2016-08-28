package main.java.hello;

public class HelloWorld {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void printMsg(){
		System.out.println("This msg is " + msg);
	}
}
