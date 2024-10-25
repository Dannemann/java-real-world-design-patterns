package example1.org.emulator.engine;

/**
 * <p>This class also implements the <code>VideoGameEmulator</code> interface,
 * which makes it compatible with any available filter.</p>
 * <p>This is the <b>ConcreteComponent</b> UML actor.</p>
 */
public class Nintendo64Emulator extends VideoGameEmulator {

    // ...implementation...

    @Override
    public String renderFrame() {
        return "N64.renderFrame";
    }

    @Override
    public String changeResolution() {
        return "N64.resolutionChangedTo " + resolutionX + "x" + resolutionY;
    }

    // ...implementation...

}
