package _02_nested_loops._3_for_loop_gauntlet;

public class ForloopGauntlet {

	public static void main(String[] args) {
		for(int count = 0; count < 101; count++) {
			System.out.println(count);
		}{
	 
	for(int countmore = 100; countmore >= 0; countmore--) {
		System.out.println(countmore);
	}
	for(int skipcount = 2; skipcount <101; skipcount+=2) {
		System.out.println(skipcount);
	}
	for(int oddcount = 1; oddcount < 100; oddcount += 2) {
		System.out.println(oddcount);
	}
	for(int smartcount = 1; smartcount < 501; smartcount++) {
		if(smartcount % 2 == 0) {
		System.out.println(smartcount + " is even");
	} else {
		System.out.println(smartcount + " is odd");
	}
	}
	for(int sevencount = 7; sevencount < 778; sevencount += 7) {
		System.out.println(sevencount);
	}
	int year = 0;
	for(int age = 0; age < 13; age++) {
		year = 2008 + age;
		System.out.println("In " + year + " I was " + age + " years old.");
	}
	for(int repeat = 0; repeat < 3 ; repeat++) {
		for(int times = 0; times < 3; times++) {
			System.out.println(repeat + " " + times);
			}
	}
	for(int main = 0; main < 9; main+= 3) {
		for(int num = 1; num < 4; num++) {
			System.out.print(main + num  + " ");
		}
		System.out.println();
	}
	for(int main = 0; main < 100; main+= 10) {
		for(int num = 1; num < 11; num++) {
			System.out.print(main + num  + " ");
		}
		System.out.println();
	}
	for(int stars = 1; stars < 7; stars++) {
		for(int numberstar = 0; numberstar < stars; numberstar++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
	}
}



