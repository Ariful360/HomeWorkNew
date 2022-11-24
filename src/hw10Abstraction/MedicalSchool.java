package hw10Abstraction;

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
	 * There two keywords used to inheritance abstract class.
	 * abstract class can inherit only one regular class with extends keyword, but cannot inherit interface with extends keyword.
	 * abstract can inherit interface class with implements keyword
	 * abstract class inherit only one abstract class,only one inheritance is possible.
	 * 
	 */

}
