package main.java.soundsystem.bean;

import main.java.soundsystem.interfaces.CompactDisc;

//@Component
public class CDPlayer {
	private CompactDisc cd;
	
	//@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd =cd;
	}
	
	public void play(){
		cd.play();
	}
}
