package main.java.concert.bean;

import main.java.concert.interfaces.Performance;

public class Drama implements Performance {

	@Override
	public void perform() {
		System.out.println("Lo Lo Lo !");

	}

}
