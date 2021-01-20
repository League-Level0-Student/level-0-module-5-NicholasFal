package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class methodwritingrobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rob.penDown();
		rob.setSpeed(2);
		String color = JOptionPane.showInputDialog("What color would you like the robot's shape he will draw to be?");
		if(color.equalsIgnoreCase("Red")) {
		rob.setPenColor(Color.red);  //rob.setPenColor(255, 0, 0);
		} else if(color.equalsIgnoreCase("Orange")) {
			rob.setPenColor(Color.orange);
		} else if(color.equalsIgnoreCase("Yellow")) {
			rob.setPenColor(Color.yellow);
		} else if(color.equalsIgnoreCase("Green")) {
			rob.setPenColor(Color.green);
		} else if(color.equalsIgnoreCase("Blue")) {
			rob.setPenColor(Color.blue);
		} else if(color.equalsIgnoreCase("Pink")) {
			rob.setPenColor(Color.pink);
		} else if(color.equalsIgnoreCase("White")) {
			rob.setPenColor(Color.white);
		} else if(color.equalsIgnoreCase("Black")) {
			rob.setPenColor(Color.black);
		} else if(color.equalsIgnoreCase("Cyan")) {
			rob.setPenColor(Color.cyan);
		} else if(color.equalsIgnoreCase("Magenta")) {
			rob.setPenColor(Color.magenta);
		} else if(color.equalsIgnoreCase("Gray")) {
			rob.setPenColor(Color.gray);
		} else {
			JOptionPane.showMessageDialog(null, "Color not available!");
		}
		String shape = JOptionPane.showInputDialog("What shape do you would you like the robot to draw?");
		if(shape.equalsIgnoreCase("circle")) {
		drawCircle();
		} else if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
			}else if(shape.equalsIgnoreCase("square")) {
				drawSquare();
			} else {
				JOptionPane.showMessageDialog(null, "Shape not available!");
			}
	}

	static Robot rob = new Robot();

	static void drawSquare() {
		
		for (int sides = 0; sides < 4; sides++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	static void drawTriangle() {
		for (int tri = 0; tri < 3; tri++) {
			rob.move(133);
			rob.turn(120);
		}
	}
	static void drawCircle() {
		for(int circle = 0; circle < 360; circle++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}