package week3.day1;

public class Samsung extends AndroidTV implements Android{

	public void watchVideo() {
		System.out.println("Watch a Video");
		
	}
	
	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.openApp();
		s.watchVideo();
	}
}
