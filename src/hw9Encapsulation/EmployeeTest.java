package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("Employee Information");
		Employee employee = new Employee();
		// we put argument in the parameterized method
		employee.setName("Ariful");
		employee.setAge(30);
		employee.setSex('M');
		employee.setUsCitizen(true);
		
		System.out.println("Name: " + employee.getName() + ", \nAge: " + employee.getAge() + ", \nSex: " + employee.getSex() + ", \nUS Citizen: " + employee.getUsCitizen());
		

	}

}
