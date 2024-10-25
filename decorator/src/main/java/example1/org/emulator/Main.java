package example1.org.emulator;

import example1.org.emulator.engine.Nintendo64Emulator;
import example1.org.emulator.engine.PlayStationEmulator;
import example1.org.emulator.engine.VideoGameEmulator;
import example1.org.emulator.engine.filters.BilinearFiltering;
import example1.org.emulator.engine.filters.FxaaAntiAliasing;
import example1.org.emulator.engine.filters.SharpenFilter;

public class Main {

    /**
     * Main component to be decorated.
     */
    private static VideoGameEmulator videoGameEmulator;

    public static void main(String[] args) {
        VideoGameEmulator decoratedEmulator;

        // The user starts the PlayStation emulator with only bilinear filtering.
        videoGameEmulator = new PlayStationEmulator();
        decoratedEmulator = new BilinearFiltering(videoGameEmulator);
        System.out.println(decoratedEmulator.renderFrame());

        // The user adds other filters to enhance the image quality.
        decoratedEmulator = new BilinearFiltering(new FxaaAntiAliasing(new SharpenFilter(videoGameEmulator)));
        System.out.println(decoratedEmulator.renderFrame());

        // The user changes the screen resolution.
        videoGameEmulator.resolutionX = 800;
        videoGameEmulator.resolutionY = 600;
        System.out.println(decoratedEmulator.changeResolution());

        // The user now decides to play Nintendo64 with the same filters.
        videoGameEmulator = new Nintendo64Emulator();
        decoratedEmulator = new BilinearFiltering(new FxaaAntiAliasing(new SharpenFilter(videoGameEmulator)));
        System.out.println(decoratedEmulator.renderFrame());

        // ...but Nintendo64 also needs to enhance the resolution graph for some filters.
        System.out.println(decoratedEmulator.resolutionGraph());
    }

}
