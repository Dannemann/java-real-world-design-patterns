package my.application.regular.singleton;

/**
 * <p>This is usually the most popular way to implement a Singleton. It is not
 * considered completely safe because we can still instantiate this class with
 * the use of reflection.</p>
 * <p>As the constructor is private making inheritance impossible, we mark the
 * class as <code>final</code> (just to make it easier to notice).</p>
 */
public final class BackgroundImages {

	// Fields:

	private Object heavyBackground1;
	private Object heavyBackground2;
	private Object heavyBackground3;

	// Singleton:

	private static BackgroundImages instance;

	// Private constructor. Can only be instantiated in this file.
	private BackgroundImages() {
	}

	public static BackgroundImages getInstance() {
		if (instance == null) {
			// Thread-safety workaround.
			synchronized (BackgroundImages.class) {
				if (instance == null) {
					instance = initializeBackgroundImages();
				}
			}
		}

		return instance;
	}

	private static BackgroundImages initializeBackgroundImages() {
		BackgroundImages backgroundImages_ = new BackgroundImages();
		// Logic to initialize heavy-weight images that should always stay in memory...
		backgroundImages_.heavyBackground1 = new Object();
		backgroundImages_.heavyBackground2 = new Object();
		backgroundImages_.heavyBackground3 = new Object();
		return backgroundImages_;
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
