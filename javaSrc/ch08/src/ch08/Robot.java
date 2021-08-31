package ch08;



public interface Robot {}

class DanceRobot implements Robot {
	void dance() {
		System.out.println("Dance");
	}
}

class SingRobot implements Robot {
	void sing() {
		System.out.println("Sing");
	}
}

class DrawRobot implements Robot {
	void draw() {
		System.out.println("Draw");
	}
}

