package ch08;

public interface RemoteControl {
	int MAX_VOLUME = 10; // public final static
	int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();		 // public abstract;
//	모든 객체들이 공통으로 사용하는 메서드
	default void setMute(boolean mute) {
		if (mute) System.out.println("무음처리");
		else System.out.println("무음해제");
	}
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
