package example2.com.player.engine.filters;

/**
 * <p>Apply color enhancement to a video frame.</p>
 * <p>This is the <b>ConcreteDecorator</b> UML actor.</p>
 * <p><i>As by GoF's bullet 4 at pages 179/180, this would be the <b>ConcreteStrategy</b> UML actor.</i></p>
 */
public class ColorEnhanceFilter implements VideoFilter {

    @Override
    public String decorateFrame(String frameBytes, int width, int height, int subpixelDepth) {
        // ...complex code to enhance the image (frameBytes) colors...
        return frameBytes + " with ColorEnhanceFilter";
    }

}