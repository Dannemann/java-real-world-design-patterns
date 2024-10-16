package com.audio.observer;

/**
 * <p>A dependent of a shared data object. Data changes are notified through <code>subjectUpdated</code>.</p>
 * <p>This is the <b>observer/subscriber</b> UML actor.</p>
 */
public interface Observer {

    void subjectUpdated(Subject subject);

}
