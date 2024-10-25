package example1.org.emulator.engine.filters;

import example1.org.emulator.engine.VideoGameEmulator;

/**
 * <p>Adds FXAA antialiasing to a frame.</p>
 * <p>This is the <b>ConcreteDecorator</b> UML actor.</p>
 */
public class FxaaAntiAliasing extends FrameFilter {

    public FxaaAntiAliasing(VideoGameEmulator emulator) {
        super(emulator);
    }

    @Override
    public String renderFrame() {
        String renderedFrame = super.renderFrame();
        // ...complex code to add FxaaAntiAliasing to renderedFrame...
        return renderedFrame + " with FxaaAntiAliasing";
    }

    /**
     * <p>Imagine that antialiasing algorithms require special handling when the resolution changes.</p>
     * <p>Note that this is the only decorator that improves this method.</p>
     */
    @Override
    public String changeResolution() {
        String newResolutionFrameBuffer = super.changeResolution();
        // ...complex code to change resolution with antialiasing...
        return newResolutionFrameBuffer + " with FxaaAntiAliasing";
    }

}
