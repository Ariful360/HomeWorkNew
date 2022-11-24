package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		// Animal is Hierarchical Inheritance because more than one
		// derived class created from this.
		// Example: Mammal extends Animal, Reptile extends Animal,
		// Birds extends Animal.

		System.out.println("-----------------------------------------");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		// an object Can call other methods if the class is extended.
		// Here Birds is a Child class
		// Animal is a Parent Class
		// Here Birds extends from Animal. So, this is a Single Inheritance

		System.out.println("----------------------------------------");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		// Yes, an object Can call other methods if the class is extended
		// Here reptile is a Child class
		// Animal is a Parent Class
		// Here reptile extends from Animal. So, this is a Single Inheritance

		System.out.println("-----------------------------------------");
		Mammal mammal = new Mammal();
		mammal.mamaalInfo();
		mammal.animalInfo();
		// Yes, an object Can call other methods if the class is extended
		// Here mammal is a Child class
		// Animal is a Parent Class
		// Here mammal extends from Animal. So, this is a Single Inheritance

		System.out.println("-----------------------------------------");
		Robin robin = new Robin();
		// Robin is a child class
		// here birds is the parent class of robin
		// animal is a parent class of birds.
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("-----------------------------------------");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mamaalInfo();
		dog.animalInfo();

		System.out.println("-----------------------------------------");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("-----------------------------------------");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mamaalInfo();
		bullDog.animalInfo();

		System.out.println("-----------------------------------------");
		/* These are example of multilevel inheritance because a derived class
		 * created from another derived class.
		 * for example, Cobra extends Snake, Snake extends Reptile,
		 * Reptile extends Animal.
		*/
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
