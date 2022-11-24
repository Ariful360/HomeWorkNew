package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		// Constructor is initialized here

		aboutMe.myName = "Ariful"; // Here variables is initialize
		aboutMe.myAge = 30;
		aboutMe.mySex = 'M';
		aboutMe.myHouseRent = 1900;
		aboutMe.myIdNumber = 24256501l;
		aboutMe.myPhoneBill = 300;
		aboutMe.myEyepower = 1.25f;
		aboutMe.myGrade = 2.919;
		aboutMe.usCitizen = true;
		aboutMe.aboutMe(); // method initialized

		System.out.println("\n---------------------------------------------------------");

		AboutMe alex = new AboutMe();
		// Variable is initialized
		alex.myName = "Alex";
		alex.myAge = 29;
		alex.mySex = 'M';
		alex.myHouseRent = 1400;
		alex.myIdNumber = 25425797;
		alex.myPhoneBill = 310;
		alex.myEyepower = 2.25f;
		alex.myGrade = 3.18;
		alex.usCitizen = false;
		alex.aboutMe();// method initialized

	}

}

//
