package ch08;

public class RobotEx {
	public static void main(String[] args) {
		Robot[] rbs = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		for (Robot rb : rbs) {
			action(rb);
		}
	}
	private static void action(Robot rb) {
		if (rb instanceof DanceRobot) ((DanceRobot) rb).dance();
		else if (rb instanceof SingRobot) ((SingRobot) rb).sing();
		else ((DrawRobot)rb).draw();
	}
}
