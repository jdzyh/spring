package main.java.datasource.bean;

public class AClass implements BaseClass{
	private String name;
	
	public AClass(String name){
		this.name = name;
	}
	
	public void display(){
		System.out.println(name);
	}
}
