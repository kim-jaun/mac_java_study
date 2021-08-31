package ch08;

public class RemoteControlEx1 {
	public static void main(String[] args) {
		RemoteControl[] rcs = new RemoteControl[2];
		rcs[0] = new TV1();
		rcs[1] = new Radio1();
		for(RemoteControl rc : rcs) {
			rc.turnOn();
			rc.turnOff();
			rc.setMute(false);
			rc.setMute(true);
			RemoteControl.changeBattery();
		}
	}
}
