package example1.org.emulator;

import example1.org.emulator.engine.Nintendo64Emulator;
import example1.org.emulator.engine.PlayStationEmulator;
import example1.org.emulator.engine.VideoGameEmulator;
import example1.org.emulator.engine.filters.BilinearFiltering;
import example1.org.emulator.engine.filters.FxaaAntiAliasing;
import example1.org.emulator.engine.filters.SharpenFilter;

public class Main {

    public static void main(String[] args) {
        VideoGameEmulator emulator;
        String frame;

        emulator = new BilinearFiltering(new PlayStationEmulator());
        frame = emulator.renderFrame();
        System.out.println(frame);

        emulator = new BilinearFiltering(new SharpenFilter(new FxaaAntiAliasing(new Nintendo64Emulator())));
        frame = emulator.renderFrame();
        System.out.println(frame);
    }

}
