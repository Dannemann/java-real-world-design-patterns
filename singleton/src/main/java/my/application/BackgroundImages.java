package my.application;

/**
 * This is currently the recommended way to write a Singleton. Handles
 * serialization and avoids reflection attacks.
 */
public enum BackgroundImages {

	INSTANCE;

	private final Object heavyBackground1;
	private final Object heavyBackground2;
	private final Object heavyBackground3;

	// Private constructor. Enums guarantees only one instance.
	BackgroundImages() {
		// Logic to initialize heavy-weight images that should always stay in memory...
		heavyBackground1 = new Object();
		heavyBackground2 = new Object();
		heavyBackground3 = new Object();
	}

	// Business methods, getters, and etc:

	public Object invertBackgroundColor(Object bgImage) {
		// Complex code to invert "bgImage" color.
		return bgImage;
	}

	public Object moveBackgroundImg(Object bgImage, int x, int y) {
		// Complex code to move "bgImage" to "x" and "y" coordinates.
		return bgImage;
	}

	public Object getHeavyBackground1() {
		return heavyBackground1;
	}

	public Object getHeavyBackground2() {
		return heavyBackground2;
	}

	public Object getHeavyBackground3() {
		return heavyBackground3;
	}

}
