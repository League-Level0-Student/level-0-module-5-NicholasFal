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
}
}
}
