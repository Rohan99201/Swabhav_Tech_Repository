class DrumkitTest {
	boolean topHat=true;
	boolean snare=true;
	
	void playSnare() {
		System.out.println("ding ding da-ding");
	}
	void playTopHat() {
		System.out.println("bang bang ba-bang");
	}
}
class Drumkit {
	public static void main(String [] args) {
		DrumkitTest d=new DrumkitTest();
		d.playSnare();
		d.snare=false;
		d.playTopHat();
		
		if(d.snare==true) {
			d.playSnare();
		}
	}
	
}
