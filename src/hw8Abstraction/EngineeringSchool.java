package hw8Abstraction;

public abstract class EngineeringSchool {
	    // abstract method declared here
		public abstract void mechanicalLab();
		// non abstract method implemented here
		public void computerLab() {
			System.out.println("This non abstract method is from EngineeringSchool ");
		}

}
