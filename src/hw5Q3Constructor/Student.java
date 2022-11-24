package hw5Q3Constructor;

public class Student {
	//Variables are declared here
	public String stName;
	public int stId;
	public char sex;
	public boolean isProgramer;
	public float grade;
	
	//default constructor is Declared here
	public Student() {
		
		System.out.println("This is from default Constructor of Student. ");
	}
	
	// Parameterized Constructor 01 declared
	public Student(String stName, int stId, char sex, boolean isProgramer, float grade) {
		this.stName = stName;
		this.stId = stId;
		this.sex = sex;
		this.isProgramer = isProgramer;
		this.grade = grade;
		System.out.println("\nStudent Name: " + stName + ", Studet Id: " + stId + ", Gander: " + sex + ", Programer: " + isProgramer + ", Grade: " + grade);
		
				
		
		
	}
	

}
