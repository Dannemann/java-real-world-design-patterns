package example1.org.emulator.engine.filters;

import example1.org.emulator.engine.VideoGameEmulator;

/**
 * <p>Decorates a game frame.</p>
 * <p>This is the <b>Decorator</b> UML actor.</p>
 */
public abstract class FrameFilter extends VideoGameEmulator {

    private final VideoGameEmulator emulator;

    public FrameFilter(VideoGameEmulator emulator) {
        this.emulator = emulator;
    }

    // We implement all abstract methods from VideoGameEmulator so that decorators
    // are not required to implement them individually. Only the ones they need.

    @Override
    public String renderFrame() {
        return emulator.renderFrame();
    }

    @Override
    public String changeResolution() {
        return emulator.changeResolution();
    }

    // Other useful public non-abstract methods can also be decorated in the same way.

    @Override
    public String resolutionGraph() {
        return emulator.resolutionGraph();
    }

}
