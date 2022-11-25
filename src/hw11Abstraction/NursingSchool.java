package hw11Abstraction;

public abstract class NursingSchool extends RockefellerUniversity implements LawSchool{
	// abstract method declared here
	public abstract void hygiene();

	// non abstract method implemented here
	public void caring() {
		System.out.println("This non abstract method is from NursingSchool ");

	}

}
