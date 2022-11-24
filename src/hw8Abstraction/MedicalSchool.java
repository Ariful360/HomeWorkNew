package hw8Abstraction;

public abstract class MedicalSchool {
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

}
