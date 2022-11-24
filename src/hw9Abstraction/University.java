package hw9Abstraction;

public interface University extends Hospital, College {
	// method declared.
	public void classSize();

	public void playGround();

	public void teacher();

	/*
	 * public University() { } In Java, We can not create a Constructor inside
	 * Interface because All data members in interfaces are public static final by
	 * default, They are constant. They are abstract by nature.
	 */

	public static void gymnasium() {

	}

	public default void library() {

	}

	/*
	 * interface class uses one keyword for inheritance. interface cannot inherit a
	 * regular class or abstract class. interface can inherit one or more than on
	 * interface class with the help of extends keyword.
	 */

}
