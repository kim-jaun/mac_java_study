package ch08;

public class RemoteControlEx2 {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("sound on");
			}
			public void turnOff() {
				System.out.println("sound off");
			}
			
		};
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		RemoteControl.changeBattery();
		RemoteControl rc2 = new RemoteControl() {
			public void turnOn() {
				System.out.println("speaker on");
			}
			public void turnOff() {
				System.out.println("speaker off");
			}
			
		};
		rc2.turnOn();
		rc2.turnOff();
		rc2.setMute(false);
		RemoteControl.changeBattery();
	}
}
