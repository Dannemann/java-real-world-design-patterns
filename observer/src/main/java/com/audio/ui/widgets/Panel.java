package com.audio.ui.widgets;

import com.audio.observer.Observer;
import com.audio.observer.Subject;

import java.util.Map;

/**
 * <p>A panel is just a container widget in our system.</p>
 * <p>This class demonstrates that an Observer can only receive notifications
 * having limited knowledge about the subject it observes.</p>
 * <p>This is a <b>concrete observer/subscriber</b> UML actor.</p>
 */
public class Panel implements Observer {

    // ...project-specific panel implementation...

    /**
     * A panel serves as a container and does not have the ability to modify the
     * audio file. It is only concerned with changes to the project UI settings.
     */
    @Override
    public void subjectUpdated(Subject subject) {
        Object state = subject.getState();
        if (state instanceof Map projectSettings)
            System.out.println("Panel.subjectUpdated: Project settings changes rendered.");
    }

    // ...project-specific panel implementation...

}
