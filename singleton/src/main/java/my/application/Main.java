package my.application;

/**
 * Imagine you are writing a desktop application that in a certain moment in
 * time, loads some heavy-weight background images which are frequently swapped
 * by the user. You and your team decided that the best approach for the
 * business is to keep them in memory for fast and easy swap, as they never
 * change. The Singleton design pattern can be useful in this situation. You
 * guarantee that only one instance of the class will exist in the application
 * life-span.
 */
public class Main {

	public static void main(String[] args) {
		BackgroundImages singleton = BackgroundImages.INSTANCE;

		assert singleton == BackgroundImages.INSTANCE; // Same instance.

		// Internal objects were initialized.
		assert singleton.getHeavyBackground1() != null;
		assert singleton.getHeavyBackground2() != null;
		assert singleton.getHeavyBackground3() != null;

		// Enums are regular "classes". They can have fields, business methods, static
		// members, and almost everything that a normal independent class can have.
		assert singleton.invertBackgroundColor(singleton.getHeavyBackground1()) == singleton.getHeavyBackground1();
		assert singleton.moveBackgroundImg(singleton.getHeavyBackground2(), 0, 0) == singleton.getHeavyBackground2();
	}

}
