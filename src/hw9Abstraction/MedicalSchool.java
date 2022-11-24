package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	// abstract method declared here
	public abstract void anatomyLab();

	// non abstract method implemented here
	public void biochemistryLab() {
		System.out.println("This non abstract method is from MedicalSchool");

	}

	// Declare default constructor
	public MedicalSchool() {
		System.out.println("This is default Constructor of MediccalSchool class ");
	}
	
	/*
	 * There is only one keyword in java for inheritance as far as we know for abstract class.
	 * abstract class can inherit only one regular class with extends keyword, but cannot inherit interface with extends keyword.
	 * abstract class inherit only one abstract class,only one inheritance is .possible.
	 */

}
