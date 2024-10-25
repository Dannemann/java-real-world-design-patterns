package example1.org.emulator.engine;

/**
 * <p>Generic behavior for console emulation.</p>
 * <p>This is the <b>Component</b> UML actor.</p>
 * <p>If initializing this class becomes too resource-intensive, it can impact
 * system performance, as all decorators will inherit its overhead. In this
 * situation, consider creating and implementing a lightweight interface which
 * only declares the methods intended for enhancement by decorators. This
 * approach allows <code>VideoGameEmulator</code> and all decorators to share a
 * common interface, which is necessary for object chaining.</p>
 * <p>In our case, this will never be a problem because all filters are Singletons.</p>
 */
public abstract class VideoGameEmulator {

    // Imagine these are some generic complex instance variables used in game rendering.
    protected Object graphicsFrameBuffer;
    protected int resolutionX;
    protected int resolutionY;

    // ...other instance variables and member definitions...

    public abstract String renderFrame();

    public abstract void changeResolution();

    /**
     * Exemplifies a generic business method dependent of both abstract methods.
     */
    public void executeResolutionChange() {
        // ...executing preparations and other logic...
        changeResolution();
        renderFrame();
        // ...resuming the game...
    }

    // ...other member definitions...

}
