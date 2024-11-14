package com.audio.ui.widgets;

import com.audio.data.Subject;

/**
 * <p>A dependent of a shared data object. Data changes are notified through <code>subjectUpdated</code>.</p>
 * <p>This is the <b>observer/subscriber</b> UML actor.</p>
 */
public interface Observer {

	/**
	 * Adding extra parameters when necessary is a standard approach.
	 */
    void subjectUpdated(Subject subject);

}
