package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n-----Default constructor is initialized here-----\n");
		Daughter daughter = new Daughter();

		System.out.println("\n-----Parameterized constructor initialized here------\n");
		Daughter daughter2 = new Daughter("March", 25);

		System.out.println("\n-----Void type method is initialized here-----\n");
		daughter2.daughter();

		System.out.println("\n----parameterized method is initialized here:-----\n");
		daughter2.daughterInfo("April", 18);

		System.out.println("\n-----Default constructor is initialized here-----\n");
		Father father1 = new Father();

		System.out.println("\n-----Parameterized constructor initialized here------\n");
		Father father2 = new Father("Ariful", 30, 'M', true);

		System.out.println("\n--------Void type method is initialized here--------\n");
		father2.father();

		System.out.println("\n------parameterized method is initialized here:-------\n");
		father2.fatherInfo("Md", 56, 'M', false);

	}

}
