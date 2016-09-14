package main.java.concert.bean;

import main.java.concert.interfaces.Performance;

public class Musical implements Performance {

	@Override
	public void perform() {
		System.out.println("La La La ~~~");
	}

}
