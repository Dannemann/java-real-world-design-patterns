package com.audio.observer;

import java.util.Arrays;
import java.util.List;

/**
 * A shared data object that must notify its dependents whenever its state changes.
 */
public interface Subject {

    /**
     * Allows observers to retrieve the current state.
     */
    Object getState();

    List<Observer> getObservers();

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

    default void notifyObservers() {
        System.out.println("Subject.notifyObservers: " + getClass().getSimpleName() + " state changed. Notifying " + getObservers().size() + " observers.");
        for (Observer observer : getObservers())
            observer.subjectUpdated(this);
    }

}
