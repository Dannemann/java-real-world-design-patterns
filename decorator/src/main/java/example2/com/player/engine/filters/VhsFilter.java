package example2.com.player.engine.filters;

/**
 * <p>Apply VHS effect to a video frame.</p>
 * <p>This is the <b>ConcreteDecorator</b> UML actor.</p>
 * <p><i>As by GoF's bullet 4 at pages 179/180, this would be the <b>ConcreteStrategy</b> UML actor.</i></p>
 */
public class VhsFilter implements VideoFilter {

    @Override
    public String decorateFrame(String frameBytes, int width, int height, int subpixelDepth) {
        // ...complex code to apply VHS effect to the image (frameBytes)...
        return frameBytes + " with VhsFilter";
    }

}
