package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class methodwritingrobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rob.penDown();
		rob.setSpeed(2);
		drawSquare();
	}

	static Robot rob = new Robot();

	static void drawSquare() {
		
		for (int sides = 0; sides < 4; sides++) {
			rob.move(100);
			rob.turn(90);
		}
	}
}