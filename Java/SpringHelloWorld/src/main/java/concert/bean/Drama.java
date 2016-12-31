package main.java.concert.bean;

import main.java.concert.interfaces.Performance;

public class Drama implements Performance {

	@Override
	public void perform() {
		System.out.println("Drama.Lo Lo Lo !");
	}

	@Override
	public void id(int t) {
		System.out.println("Drama ID:"+t);
	}
}
