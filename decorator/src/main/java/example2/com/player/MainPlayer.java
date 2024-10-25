package example2.com.player;

import example2.com.player.engine.VideoDecoder;
import example2.com.player.engine.filters.BlackAndWhiteFilter;
import example2.com.player.engine.filters.ColorEnhanceFilter;
import example2.com.player.engine.filters.VhsFilter;

public class MainPlayer {

    private static final VideoDecoder DECODER = new VideoDecoder();

    public static void main(String[] args) {
        // ...movie file is loaded, the player can now render it to the screen, frame by frame...

        // Rendering a raw frame.
        System.out.println(DECODER.renderFrame());

        // Applying BlackAndWhiteFilter.
        DECODER.filters.add(new BlackAndWhiteFilter());
        System.out.println(DECODER.renderFrame());

        // Added two more filters.
        DECODER.filters.add(new ColorEnhanceFilter());
        DECODER.filters.add(new VhsFilter());
        System.out.println(DECODER.renderFrame());

        // The user does not want filters anymore.
        DECODER.filters.clear();
        System.out.println(DECODER.renderFrame());
    }

}
