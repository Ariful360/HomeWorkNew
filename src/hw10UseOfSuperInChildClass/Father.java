package hw10UseOfSuperInChildClass;

public class Father {

	// Variables declared.
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// default constructor implemented
	public Father() {
		System.out.println("default constructor from class Father ");
	}

	// Parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My Name: " + name + ", My Age: " + age + ", My Sex: " + sex + ", I Am Citizen: " + usCitizen);
	}

	// void type method implemented
	public void father() {
		System.out.println("This void type method is from class Father ");
	}

	// void type parameterized constructor
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My Name: " + name + ", My Age: " + age + ", My Sex: " + sex + ", I Am Citizen: " + usCitizen);
	}

}
