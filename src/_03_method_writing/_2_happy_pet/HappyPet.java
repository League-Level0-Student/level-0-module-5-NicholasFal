package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want/have? (Dog, cat, fish, bunny)");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for(int stop = 0; stop < 1;) {	
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle with your pet", "Feed your pet", "Take your pet out on a walk" }, null);
			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0) {
				cuddle(pet);
			} else if(task == 1) {
				feed(pet);
			} else if(task == 2) {
				walk(pet);
			}
			if(happinessLevel < -4) {
				JOptionPane.showMessageDialog(null, "Your pet has died!");
				stop = 1;
			} else if(happinessLevel > 4) {
				JOptionPane.showMessageDialog(null, "Your pet is exceedingly happy!");
				stop = 1;
			}
		}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	private static void cuddle(String pet) {
		// TODO Auto-generated method stub
		if(pet.equalsIgnoreCase("bunny")) {
			happinessLevel++;
			JOptionPane.showMessageDialog(null, "The bunny is happy to be given attention!");
		} else if(pet.equalsIgnoreCase("dog")) {
			happinessLevel += 3;
			JOptionPane.showMessageDialog(null, "The dog is thrilled to get to snuggle with their owner!");
		} else if(pet.equalsIgnoreCase("fish")) {
			happinessLevel -= 1000;
			JOptionPane.showMessageDialog(null, "The fish dies due to being removed from its tank and being squished!");
		} else if(pet.equalsIgnoreCase("cat")) {
			happinessLevel += 2;
			JOptionPane.showMessageDialog(null, "The cat purs in the owner's lap!");
		}
	}
	private static void feed(String pet) {
		if(pet.equalsIgnoreCase("bunny")) {
			happinessLevel += 2;
			JOptionPane.showMessageDialog(null, "The bunny gobbles up his carrots!");
		} else if(pet.equalsIgnoreCase("dog")) {
			happinessLevel += 2;
			JOptionPane.showMessageDialog(null, "The dog gobbles up his food!");
		} else if(pet.equalsIgnoreCase("fish")) {
			happinessLevel += 2;
			JOptionPane.showMessageDialog(null, "The fish gobbles up his food!");
		} else if(pet.equalsIgnoreCase("cat")) {
			happinessLevel += 2;
			JOptionPane.showMessageDialog(null, "The cat gobbles up his food!");
		}
		
	}
	private static void walk(String pet) {
		if(pet.equalsIgnoreCase("bunny")) {
			happinessLevel++;
			JOptionPane.showMessageDialog(null, "The bunny is happy that it gets to hop around!");
		} else if(pet.equalsIgnoreCase("dog")) {
			happinessLevel += 3;
			JOptionPane.showMessageDialog(null, "The dog is thrilled that it gets to release its energy!");
		} else if(pet.equalsIgnoreCase("fish")) {
			happinessLevel -= 1000;
			JOptionPane.showMessageDialog(null, "The fish dies due to it being removed from its tank!");
		} else if(pet.equalsIgnoreCase("cat")) {
			happinessLevel -= 2;
			JOptionPane.showMessageDialog(null, "The cat is annoyed that it has to walk!");
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}