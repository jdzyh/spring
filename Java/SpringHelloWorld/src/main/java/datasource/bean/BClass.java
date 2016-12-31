package main.java.datasource.bean;

public class BClass implements BaseClass{
	private String name;
	
	public BClass(String name){
		this.name = name;
	}
	
	public void display(){
		System.out.println(name);
	}
}
