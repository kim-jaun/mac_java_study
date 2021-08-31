package ch08;

public class VolumeEx {
	public static void main(String[] args) {
		Volume[] vols = new Volume[3];
		vols[0] = new Radio();
		vols[1] = new TV();
		vols[2] = new Speaker();
		
		for (Volume vol : vols) {
			int v1 = (int)(Math.random() * 10);
			int v2 = (int)(Math.random() * 10);
			vol.volumeUp(v1);
			vol.volumeDown(v2);
		}
	}
}
