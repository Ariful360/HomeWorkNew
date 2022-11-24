package hw10UseOfSuperInChildClass;

public class Daughter extends Father {

	// variables declared
	public String birthMonth;
	public int age;

	// Default Constructor declared
	public Daughter() {
		// super method is use to call parent class
		super();
		super.familyName = "Islam";

		System.out.println("default constructor from class Daughter ");

	}

	// Parameterized Constructor
	public Daughter(String birthMonth, int age) {
		super("Ariful", 30, 'M', true);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Bith Month is: " + birthMonth + "Age is: " + age);
	}

	public void daughter() {
		super.father();
		System.out.println("default void type method is from class Daughter ");
	}

	// Parameterized Constructor
	public void daughterInfo(String birthMonth, int age) {
		super.fatherInfo("Md", 56, 'M', false);
		super.familyName = "Miah";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Bith Month is: " + birthMonth + "Age is: " + age);
	}

}
