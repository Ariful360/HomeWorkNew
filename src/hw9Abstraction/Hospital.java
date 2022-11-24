package hw9Abstraction;

public interface Hospital {
	// method declared here
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public static void morgue() {

	}

	public default void pharmacy() {

	}

}
