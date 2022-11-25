package hw11Abstraction;

public class TestInstitute {
	
	
	public static void main(String[] args) {
		System.out.println("\n--------------ColumbiaUniversity----------------\n");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.languageClub();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.biology();
		ColumbiaUniversity.biologyInfo();
		columbiaUniversity.cafeteria();
		columbiaUniversity.caring();
		columbiaUniversity.chemistry();
		columbiaUniversity.classSize();
		columbiaUniversity.commonRoom();
		columbiaUniversity.computerLab();
		columbiaUniversity.classSize();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.hygiene();
		columbiaUniversity.laboratory();
		columbiaUniversity.lawInfo();
		columbiaUniversity.playGround();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.teacher();
		columbiaUniversity.vocationalInfo();
		
		System.out.println("\n--------------University----------------\n");
		University university = new ColumbiaUniversity();
		university.languageClub();
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.pharmacy();
		university.playGround();
		university.studyRoom();
		university.surgeryRoom();
		university.teacher();
		University.library();
		
		
		
		System.out.println("\n--------------MedicalSchool----------------\n");
		MedicalSchool medicalSchool =new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		MedicalSchool.ariful();
		medicalSchool.anthropology();
		medicalSchool.caring();
		medicalSchool.aeronauticalInfo();
		medicalSchool.computerLab();
		medicalSchool.hygiene();
		medicalSchool.lawInfo();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();
	}	

}
