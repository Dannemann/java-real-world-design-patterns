package example1.org.emulator.engine.filters;

import example1.org.emulator.engine.VideoGameEmulator;

/**
 * <p>Adds a sharpen effect to a frame.</p>
 * <p>This is the <b>ConcreteDecorator</b> UML actor.</p>
 */
public class SharpenFilter extends FrameFilter {

    public SharpenFilter(VideoGameEmulator emulator) {
        super(emulator);
    }

    @Override
    public String renderFrame() {
        String renderedFrame = super.renderFrame();
        // ...complex code to add SharpenFilter to renderedFrame...
        return renderedFrame + " with SharpenFilter";
    }

}
