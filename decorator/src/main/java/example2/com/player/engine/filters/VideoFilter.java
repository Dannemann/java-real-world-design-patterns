package example2.com.player.engine.filters;

/**
 * <p>Decorates a video frame.</p>
 * <p>This is the <b>Decorator</b> UML actor.</p>
 * <p><i>As by GoF's bullet 4 at pages 179/180, this would be the <b>Strategy</b> UML actor.</i></p>
 */
public interface VideoFilter {

    /**
     * Imagine these are the necessary parameters to apply a filter and alter an
     * image. We could have passed the <code>VideoDecoder</code> instance instead of
     * all of them, but assume that our video player app is paid software. We do not
     * want to expose the whole object to users creating filters for it, only the
     * necessary data. We keep decorators decoupled from <code>VideoDecoder</code>.
     */
    String decorateFrame(String frameBytes, int width, int height, int subpixelDepth);

}
