package hw6IfElseCondition01;

public class Voter {

	public static void main(String[] args) {
		// variable initialized here
		int myAge = 30;

		if (myAge == 18) {
			System.out.println("I am a Voter ");
		} else if (myAge < 18) {
			System.out.println("I am not a Voter ");
		} else if (myAge > 18) {
			System.out.println("I am a Voter ");
		} else {
			System.out.println("Please add a valid age ");
		}

	}
}
