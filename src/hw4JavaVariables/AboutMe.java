package hw4JavaVariables;

public class AboutMe {
	//Variables are declared Here
	public String myName;
	public byte myAge;
	public char mySex;
	public int myHouseRent;
	public long myIdNumber;
	public short myPhoneBill;
	public float myEyepower;
	public double myGrade;
	public boolean usCitizen;

	// This is a Constructor.
	// Here Constructor declared

	public AboutMe() {

		System.out.println("This is all about us: \n");

	}

	// here method is implemented.

	public void aboutMe() {

		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nSex: " + mySex + "\nMy Id Number: "
				+ myIdNumber + "\nMy Phone Bill" + myPhoneBill + "\nHouse Rent: " + myHouseRent + "\nMy Eyepower: "
				+ myEyepower + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);

	}

}
//
