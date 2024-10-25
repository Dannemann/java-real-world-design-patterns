package example2.com.player.engine;

import example2.com.player.engine.filters.VideoFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>The video rendering engine. Generates each frame the user sees on screen.</p>
 * <p>This is the <b>ConcreteComponent</b> UML actor.</p>
 */
public class VideoDecoder {

    // Imagine these are some complex instance variables used in video rendering.
    private int resolutionX;
    private int resolutionY;
    private int subpixelDepth;

    // ...other instance variables and member definitions...

    /**
     * List of decorators.
     */
    public List<VideoFilter> filters = new ArrayList<>(); // public for brevity. No getters/setters.

    // Business methods:

    public String renderFrame() {
        // ...complex code to render a frame...
        String frame = "Frame rendered";
        return decorate(frame);
    }

    /**
     * <p>Using <code>new Decorator1(new Decorator2(new MainObject()))</code>, as shown
     * in the first example (package <code>example1.org.emulator</code>), fully
     * decouples Decorators from the main component, making it agnostic to any
     * applied decorator. This approach, however, adds complexity.</p>
     * <p>Alternatively, with Strategies, decorators are coupled to
     * <code>VideoDecoder</code> (the main component), which is now aware of them.
     * The benefit is a simpler implementation.</p>
     */
    private String decorate(String img) {
        for (VideoFilter f : filters)
            img = f.decorateFrame(img, resolutionX, resolutionY, subpixelDepth); // We pass the decorated result to the next filter.

        return img;
    }

    // ...other methods and member definitions...

}
