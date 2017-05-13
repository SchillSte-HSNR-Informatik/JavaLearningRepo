
public class drumkitTestDrive {
	public static void main (String[] args){
		drumkit d = new drumkit();
		d.playSnare();
		d.snare = false;
		if (d.snare == true){
			d.playSnare();
		}
		d.playTopHat();
		
	}
}
