package hw11Abstraction;

public class TestInstitute {
	
	
	public static void main(String[] args) {
		System.out.println("\n--------------ColumbiaUniversity-----------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		ColumbiaUniversity.biologyInfo(); // Here static method of ColumbiaUniversity class called by the class itself.
		columbiaUniversity.lawInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.caring();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.vocationalInfo();
		
		System.out.println("\n------------MedicalSchool------------\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		MedicalSchool.Ariful(); // Here static method of  MedicalSchool called by the class itself.
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();

		System.out.println("\n------------University------------\n");
		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		University.gymnasium();
		University.library(); // Here static method of University Interface called by the class itself.
		university.commonRoom();
		university.laboratory();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();

	}

}
