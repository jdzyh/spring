package spittr.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spitter {
	private String username;
	private String password;

	public Spitter(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public Spitter(){
		
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//注意必须重载这两个函数
	@Override
	public boolean equals(Object that){
		return EqualsBuilder.reflectionEquals(this, that, "username", "password");
	}
	
	@Override
	public int hashCode(){
		return HashCodeBuilder.reflectionHashCode(this, "username", "password");
	}
}
