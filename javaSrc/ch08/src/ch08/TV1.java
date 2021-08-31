package ch08;

public class TV1 implements RemoteControl {
	public void turnOn() {
		System.out.println("TV on");
	}
	public void turnOff() {
		System.out.println("TV off");
	}

}
class Radio1 implements RemoteControl {
	public void turnOn() {
		System.out.println("Radio on");
	}
	public void turnOff() {
		System.out.println("Radio off");
	}
}
