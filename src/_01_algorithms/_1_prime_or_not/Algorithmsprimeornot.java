package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Algorithmsprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = JOptionPane.showInputDialog("Pick a number:");
		int numInt = Integer.parseInt(num);
		boolean prime = true;
		for(int check = 2; numInt > check; check++) {
			if(numInt % check == 0) {
				prime = false;
			}
		}
		if(numInt == 1) {
			JOptionPane.showMessageDialog(null,"That number is neither prime nor composite!");
		} else 
		if(prime) {
		JOptionPane.showMessageDialog(null, "That is a prime number!");
		} else {
			JOptionPane.showMessageDialog(null, "That is a composite number!");
		}
	}

}
