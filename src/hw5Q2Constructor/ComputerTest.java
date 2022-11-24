package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		// default Constructor initialized
		Computer computer01 = new Computer();
		// Parameterized Constructor Initialized
		Computer computer02 = new Computer("Apple", "MacBook Pro");
		// Parameterized constructor is initialized here
		Computer computer03 = new Computer("Apple", "MacBook Pro", "MacOS Monterey");
		// Parameterized constructor is initialized here
		Computer computer04 = new Computer("Apple", "MacBook Pro", "MacOs Monterey", 1850, 'A', false);
		}

}
