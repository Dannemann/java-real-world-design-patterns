package example1.org.emulator.engine;

/**
 * <p>Generic behavior for console emulation.</p>
 * <p>This is the <b>Component</b> UML actor.</p>
 * <p>If initializing this class becomes too resource-intensive, it can impact
 * system performance, as all decorators will inherit its overhead. In this
 * situation, consider making this class implement a lightweight interface which
 * only declares the methods intended for enhancement by decorators. This
 * approach allows <code>VideoGameEmulator</code> and all decorators to share a
 * common interface, which is necessary for object chaining.</p>
 * <p>In our case, this will never be a problem because our filters are Singletons.</p>
 */
public abstract class VideoGameEmulator {

    // Imagine these are some generic complex instance variables used in game rendering.
    public Object graphicsFrameBuffer;
    public int resolutionX; // public for brevity. No getters/setters.
    public int resolutionY;

    // ...other instance variables and member definitions...

    /**
     * Main method for game emulation.
     */
    public abstract String renderFrame();

    public abstract String changeResolution();

    // ...other member definitions...

    /**
     * Exemplifies a typical business method that is not abstract and can also be decorated.
     */
    public String resolutionGraph() {
        return "VideoGameEmulator.resolutionGraph";
    }

    // ...

}
