package hw10Abstraction;

public abstract class EngineeringSchool extends MedicalSchool implements College {
	// abstract method declared here
	public abstract void mechanicalLab();

	// non abstract method implemented here
	public void computerLab() {
		System.out.println("This non abstract method is from EngineeringSchool ");

		/*
		 * Two keywords are used for the inheritance in an Abstract class which are
		 * "extends" and "implements". An abstract class With the "extends" keyword an
		 * abstract class can inherit an Abstract class or one regular class. However,
		 * it can't inherit an Interface by extends key word. Implements keyword is used
		 * to inherit Interface and more than one can be inherited An Abstract class can
		 * not inherit a regular class or abstract class by implements keyword.
		 */

	}

}
