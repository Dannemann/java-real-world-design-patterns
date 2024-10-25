package example1.org.emulator.engine.filters;

import example1.org.emulator.engine.VideoGameEmulator;

/**
 * <p>Adds bilinear filtering to a frame.</p>
 * <p>This is the <b>ConcreteDecorator</b> UML actor.</p>
 */
public class BilinearFiltering extends FrameFilter {

    public BilinearFiltering(VideoGameEmulator emulator) {
        super(emulator);
    }

    @Override
    public String renderFrame() {
        String renderedFrame = super.renderFrame();
        // ...complex code to add BilinearFiltering to renderedFrame...
        return renderedFrame + " with BilinearFiltering";
    }

}
