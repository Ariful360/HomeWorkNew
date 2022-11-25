package hw9Abstraction;

public class ColumbiaUniversity extends MedicalSchool{

	// method implemented
	public void chemistry() {
		System.out.println("This method is from ColumbiaUniversity class ");

	}
	// abstract method declared
	/*
	 * public abstract void biology(); a regular class cannot have abstract method
	 * method can't be declared in a regular class.
	 */

	// Default Constructor declared here
	// Yes, we can create a Constructor in regular class.
	public ColumbiaUniversity() {

	}
	@Override
	public void anatomyLab() {
		// implemented from MedicalSchool abstract class
		
	}
	@Override
	public void hygiene() {
		// implemented from NursingSchool abstract class
		
	}

	/*
	 * A regular class cannot inherit an interface class with extends keyword. A
	 * regular class cannot inherit An abstract class with extends keyword. A
	 * regular class can only inherit a regular class. However, a regular class can
	 * only inherit one regular class.
	 * 
	 */

}
