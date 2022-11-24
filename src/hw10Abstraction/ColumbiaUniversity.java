package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{

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
		
	}
	@Override
	public void hygiene() {
		
		
	}
	@Override
	public void emergencyRoom() {
		
	}
	@Override
	public void surgeryRoom() {
		
	}
	@Override
	public void cafeteria() {
		
	}
	@Override
	public void commonRoom() {
		
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void anguageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * A regular class cannot inherit an interface class with extends keyword. A
	 * regular class cannot inherit An abstract class with extends keyword. A
	 * regular class can only inherit a regular class. However, a regular class can
	 * only inherit one regular class.
	 * 
	 */

}
