package main.java.testframework.beans;

public class UserInfo {
	private String userName;
	private String userID;
	private String userDesc;
	private HelloWorld helloworld;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserDesc() {
		return userDesc;
	}
	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}
	public HelloWorld getHelloworld() {
		return helloworld;
	}
	public void setHelloworld(HelloWorld helloworld) {
		this.helloworld = helloworld;
	}
	
}
