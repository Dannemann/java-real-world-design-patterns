package example1.org.emulator.engine.filters;

import example1.org.emulator.engine.VideoGameEmulator;

/**
 * <p>Decorates a game frame.</p>
 * <p>This is the <b>Decorator</b> UML actor.</p>
 */
public class FrameFilter extends VideoGameEmulator {

	private final VideoGameEmulator emulator;

	public FrameFilter(VideoGameEmulator emulator) {
		this.emulator = emulator;
	}

	// We implement all abstract methods from VideoGameEmulator so that decorators
    // are not required to implement them individually. Only the ones they require.

	@Override
	public String renderFrame() {
		return emulator.renderFrame();
	}

	@Override
	public void changeResolution() {
		emulator.changeResolution();
	}

    // Other useful members of emulator can be exposed in the same way.



//    /**
//     * Note how this method is not part of VideoGameEmulator abstract methods. By doing this, we are decorating a typical
//     * public method from a higher class. You can do this if you are working with an already existing interface.
//     */
//    @Override
//    public void preparePixels(int width, int height) {
//        emulator.preparePixels(width, height);
//    }

}
