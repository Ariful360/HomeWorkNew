package hw5Q2Constructor;

public class Computer {

	// variable Declare here

	public String brandName;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public String comBrand;
	public boolean usMade;

	// Declare default constructor
	public Computer() {
		System.out.println("This is from default Constructor of Computer class");

	}


	// Parameterized Constructor 01 declared
	public Computer(String brandName, String model) {
		this.brandName = brandName;
		this.model = model;
		System.out.println("Brand name Is: " + brandName + ", The model: " + model);
	}

	// Parameterized Constructor 02 declared
	public Computer(String brandName, String model, String operatingSystem) {
		this.brandName = brandName;
		this.model = model;
		this.operatingSystem = operatingSystem;
		System.out.println(
				"Brand name is: " + brandName + ", The model: " + model + ", Operating System is: " + operatingSystem);

	}

	// Parameterized Constructor 03 declared
	public Computer(String brandName, String model, String operatingSystem, int price, char grade, boolean usMade) {
		this.brandName = brandName;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.usMade = usMade;

		System.out.println("\nBrand name is: " + brandName + ", The model: " + model + ", The Name of Operating System is: "
						+ operatingSystem + ", Computer Price: " + price + ". Grade: " + grade + ", Made in USA: " + false);
	}
}