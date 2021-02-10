package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;
import java.util.Random;

public class SkillPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimesInt = Integer.parseInt(dimes);
		dimesInt = dimesInt * 10;
		JOptionPane.showMessageDialog(null, "You have " + dimesInt + " cents." );
		String inches = JOptionPane.showInputDialog("How tall are you in inches?");
		int height = Integer.parseInt(inches);
		if(height < 36) {
		JOptionPane.showMessageDialog(null, "You need to eat your Wheaties");
		}
		for(int third = 1; third <= 30; third++) {
			if(third % 3 == 0) {
				System.out.println(third);
			}
		}
		Random rand = new Random();
		int randomNum = rand.nextInt(20);
		System.out.println(randomNum);
		int anotherRandom = rand.nextInt(10);
		System.out.println(anotherRandom);
		System.out.println(randomNum - anotherRandom);
		String city = JOptionPane.showInputDialog("What city do you live in?");
		if(city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city!");
		} else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego");
		}
		int cars = 0;
		if(cars == 0) {
			JOptionPane.showMessageDialog(null, "I use public transportation.");
		} else if(cars == 1) {
			JOptionPane.showMessageDialog(null, "Lexus");
		} else if(cars > 1) {
			cars = cars * 4;
			JOptionPane.showMessageDialog(null, "The total number of wheels amongst all of those cars is " + cars);
		}
		String school = JOptionPane.showInputDialog("What school do you attend?");
			JOptionPane.showMessageDialog(null, school + " is a great school.");
	}
	

}
