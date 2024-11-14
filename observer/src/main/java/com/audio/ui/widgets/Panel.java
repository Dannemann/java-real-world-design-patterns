package com.audio.ui.widgets;

import com.audio.data.Subject;

import java.util.Map;

/**
 * <p>A panel is just a container widget in our system.</p>
 * <p>This class demonstrates that an Observer can be simple as just a subscriber,
 * having limited knowledge about the subject it observes.</p>
 * <p>This is a <b>concrete observer/subscriber</b> UML actor.</p>
 */
public class Panel implements Observer {

	// ...instance variables, methods and other members...

	@Override
	public void subjectUpdated(Subject subject) {
		Object state = subject.getState();
		if (state instanceof Map projectSettings) {
			// A panel serves as a container and does not have the ability to modify the
			// audio file. It is only concerned with changes to the project UI settings
			System.out.println("Panel.subjectUpdated: Project settings changes rendered.");
		}
	}

	// ...

}
