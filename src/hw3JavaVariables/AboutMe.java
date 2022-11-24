package hw3JavaVariables;

public class AboutMe {
	// Here variable is declared

	public String name;

	// Here variables is initialize
	public String myName = "Ariful";
	public byte myAge = 30;
	public char mySex = 'M';
	public int myHouseRent = 1900;
	public long myIdNumber = 24256501l;
	public short myPhoneBill = 300;
	public float myEyepower = 1.25f;
	public double myGrade = 2.919;
	public boolean usCitizen = true;

	public static void main(String[] args) {
//
		AboutMe aboutMe = new AboutMe();

		System.out.println("My Name: " + aboutMe.myName);
		System.out.println("My Age: " + aboutMe.myAge);
		System.out.println("My Sex: " + aboutMe.mySex);
		System.out.println("My Rent: " + aboutMe.myHouseRent);
		System.out.println("My Id Number: " + aboutMe.myIdNumber);
		System.out.println("My Phone Bill: " + aboutMe.myPhoneBill);
		System.out.println("My Eyepower: " + aboutMe.myEyepower);
		System.out.println("I'm CitiZen: " + aboutMe.usCitizen);

		System.out.println(aboutMe.myName + aboutMe.myAge + aboutMe.usCitizen);

	}

}
//