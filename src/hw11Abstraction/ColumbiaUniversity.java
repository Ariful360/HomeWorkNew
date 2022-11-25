package hw11Abstraction;

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
		System.out.println("this constructo from ColumbiaUniversity class");

	}

	public void biology() {
		System.out.println("This void type method is from ColumbiaUniversity class");
		
	}

	public static void biologyInfo() {
		System.out.println("\"This static method from ColumbiaUniversity Class \"");
		
	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
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
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void aeronauticalInfo() {
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
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mechanicalLab() {
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
