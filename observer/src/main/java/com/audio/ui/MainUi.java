package com.audio.ui;

import com.audio.data.Audio;
import com.audio.data.ProjectSettings;
import com.audio.ui.widgets.Knob;
import com.audio.ui.widgets.Panel;
import com.audio.ui.widgets.Slider;

public class MainUi {

    // Main screen data objects.
    private ProjectSettings projectSettings;
    private Audio audio;

    // Next step is for the software to load its visual assets and widgets.
    // We load many widgets that compose a complex audio editing software screen.
    private Knob knob1 = new Knob();
    private Knob knob2 = new Knob();
    private Slider slider1 = new Slider();
    private Slider slider2 = new Slider();
    private Panel panel1 = new Panel();
    private Panel panel2 = new Panel();

    public void loadMainUi() {
        // Let's imagine the user just started the audio editing software and a new project was created with an empty audio track.

        // Loading default settings.
        setupProjectSettings(new ProjectSettings());
        projectSettings.loadDefaults();
        System.out.println(" ### Default settings loaded.\n");

        // Empty audio track.
        setupNewAudioTrack(new Audio());
        audio.createEmptyTrack();
        System.out.println(" ### Empty track created.\n");

        // At this point we have a new project with default settings and an empty track.
        // Let's imagine that the user opened an existing project.

        projectSettings.loadFromPath("/path/to/file");
        System.out.println(" ### Imported project settings loaded.\n");

        audio.loadAudioTrack("/path/to/file");
        System.out.println(" ### Imported track loaded.\n");

        // With the project opened and the widgets updated, let's imagine that the user moved a slider adding an effect to the song.
        // This effect changes many parts of the song making all sliders and knobs to move.

        slider1.slide(-10);
        System.out.println(" ### Slider updated.\n");
    }

    private void setupProjectSettings(ProjectSettings newProjectSettings) {
        projectSettings = newProjectSettings;
        projectSettings.attachObservers(panel1, panel2, knob1, knob2, slider1, slider2);
    }

    private void setupNewAudioTrack(Audio newAudio) {
        audio = newAudio;
        audio.attachObservers(knob1, knob2, slider1, slider2);

        // Widgets can also change the audio state. In that case, we need to associate the audio track with them.
        knob1.setAudio(audio);
        knob2.setAudio(audio);
        slider1.setAudio(audio);
        slider2.setAudio(audio);
    }

}
