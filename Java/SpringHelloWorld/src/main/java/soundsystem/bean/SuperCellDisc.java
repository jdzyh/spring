package main.java.soundsystem.bean;

import main.java.soundsystem.interfaces.CompactDisc;

//@Component
public class SuperCellDisc implements CompactDisc {
	private String title;
	private String artist;
	private int roll;
	
	public SuperCellDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}



	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+title+" by "+artist+", roll="+roll);
	}

}
