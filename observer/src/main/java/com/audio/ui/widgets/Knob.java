package com.audio.ui.widgets;

import com.audio.data.Audio;
import com.audio.data.Subject;

import java.util.Map;

/**
 * <p>Imagine that in our audio editing app, the knob widget is something like the image at the bottom.</p>
 * <p>This is a <b>concrete observer/subscriber</b> UML actor.</p>
 * <p>Check <code>Slider</code> and <code>Panel</code> for detailed comments.</p>
 * <p><img src="https://guitargearfinder.com/wp-content/uploads/2021/03/daw-controller-knobs.jpg"></p>
 */
public class Knob implements Observer {

    private Audio audio;

    @Override
    public void subjectUpdated(Subject subject) {
        Object state = subject.getState();
        if (state instanceof Map projectSettings)
            System.out.println("Knob.subjectUpdated: Project settings changes rendered.");
        else
            System.out.println("Knob.subjectUpdated: Audio properties changes rendered.");
    }

    public void turn(int value) {
        System.out.println("Knob.turn: Turned to value " + value + ". Modifying audio...");
        audio.modify(Map.of("someProperty", value));
    }

    public void setAudio(Audio audio) {
        System.out.println("Knob.setAudio: Now references subject " + audio);
        this.audio = audio;
    }

}
