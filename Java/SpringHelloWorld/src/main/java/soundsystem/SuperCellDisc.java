package main.java.soundsystem;

//@Component
public class SuperCellDisc implements CompactDisc {
	private String title = "Supercell's New Music Disc";
	private String artist = "ryo";
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+title+" by "+artist);
	}

}
