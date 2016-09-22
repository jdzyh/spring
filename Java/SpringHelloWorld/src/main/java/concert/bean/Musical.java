package main.java.concert.bean;

import main.java.concert.interfaces.Performance;

public class Musical implements Performance {

	@Override
	public void perform() {
		System.out.println("Musical.La La La ~~~");
	}
	
	@Override
	public void id(int t) {
		System.out.println("Musical ID:"+t);
	}
}
