package com.audio.data;

import com.audio.ui.widgets.Observer;

import java.util.Arrays;
import java.util.Set;

/**
 * <p>A shared data object that must notify its dependents whenever its state changes.</p>
 * <p>This is the <b>Subject</b> UML actor.</p>
 */
public interface Subject {

    /**
     * Allows observers to access the current state.
     */
    Object getState();

    Set<Observer> getObservers();

    default void attachObserver(Observer observer) {
        getObservers().add(observer);
    }

    default void attachObservers(Observer... observers) {
        System.out.println("Subject.attachObservers: Attaching " + observers.length + " widgets to " + getClass().getSimpleName());
        getObservers().addAll(Arrays.asList(observers));
    }

    default void detachObserver(Observer observer) {
        getObservers().remove(observer);
    }

    default void clearObservers() {
        getObservers().clear();
    }

    /**
     * Adding extra parameters when necessary is a standard approach.
     * They can be passed to <code>subjectUpdated</code>.
     */
    default void notifyObservers() {
        System.out.println("Subject.notifyObservers: " + getClass().getSimpleName() + " state changed. Notifying " + getObservers().size() + " observers.");
        for (Observer observer : getObservers())
            observer.subjectUpdated(this);
    }

}
