package hw10Abstraction;

public class NYUniversity extends NursingSchool implements University {

	// method implemented
	public void anthropology() {
		System.out.println("This method is from NYUniversity ");

		/*
		 * A regular class can inherit one regular class and one Abstract class with
		 * "extends" keyword. However, a regular class can't inherit a Interface with
		 * "extends" keyword. For a regular class to inherit a Interface it have to Use
		 * "implements" keyword, but with this keyword a regular class can't inherit a
		 * regular class nor an Abstract class. With "implements" keyword a regular
		 * class can inherit more then on Interface.
		 */
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anguageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

}
