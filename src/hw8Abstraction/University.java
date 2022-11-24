package hw8Abstraction;

public interface University {
	// method declared.
	public void classSize();

	public void playGround();

	public void teacher();

	/*
	 * public University() { } In Java, We can not create a Constructor inside
	 * Interface because All data members in interfaces are public static final by
	 * default, They are constant. They are abstract by nature.
	 */

}
