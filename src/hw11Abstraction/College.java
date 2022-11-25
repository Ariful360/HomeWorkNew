package hw11Abstraction;

public interface College {
	// method declared here
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public static void dorm() {

	}

	public default void studyRoom() {

	}

}
