package my.application.regular.singleton;

public class Main {

	/**
	 * This is usually the most popular way to use a Singleton.
	 */
	public static void main(String[] args) {
		// BackgroundImages backgroundImages = new BackgroundImages(); // Compiler error!
		BackgroundImages singleton = BackgroundImages.getInstance();

		assert singleton == BackgroundImages.getInstance(); // Same instance.

		// Internal objects were initialized.
		assert singleton.getHeavyBackground1() != null;
		assert singleton.getHeavyBackground2() != null;
		assert singleton.getHeavyBackground3() != null;

		// Singleton is a regular class. It can have fields, business methods, static
		// members, and everything that a normal independent class should have.
		assert singleton.invertBackgroundColor(singleton.getHeavyBackground1()) == singleton.getHeavyBackground1();
		assert singleton.moveBackgroundImg(singleton.getHeavyBackground2(), 0, 0) == singleton.getHeavyBackground2();
	}

}
