package com.audio.data;

import com.audio.ui.widgets.Observer;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>Consider this class to be the audio data object that the user is editing. It
 * is shared across the application, and various widgets manage specific
 * properties that directly alter its state. Widgets can change volume, tempo,
 * pitch, reverb, delay, equalization, and apply many other audio effects.</p>
 * <p>When this occurs, all widgets that rely on the data must be notified to
 * update themselves, ensuring they reflect the most recent update. A typical
 * scenario is adjusting one slider while the others automatically adjust in
 * response.</p>
 * <p>Since this class serves as the central access point for this data
 * (<code>audioData</code>), it is implemented as a <code>Subject</code> to
 * facilitate notifying its observers when updates happen.</p>
 * <p>This is the <b>concrete subject/publisher</b> UML actor.</p>
 * <p>Check <code>ProjectSettings</code> for an example with no comments.</p>
 */
public class Audio implements Subject {

    private Object audioData; // The actual audio (or song) the user edits. Shared across the app.

    private Set<Observer> observers = new HashSet<>();

    // Subject implementation:

    @Override
    public Object getState() {
        return audioData;
    }

    @Override
    public Set<Observer> getObservers() {
        return observers;
    }

    // Business methods:

    public void createEmptyTrack() {
        System.out.println("Audio.createEmptyAudioTrack");
        setAudioData(new Object()); // Change state and notify.
    }

    public void loadAudioTrack(String path) {
        System.out.println("Audio.loadAudioTrack: " + path);
        Object loadedAudio = new Object(); // Imagine this is the loaded track.
        setAudioData(loadedAudio); // Change state and notify.
    }

    public void modify(Map<String, Object> properties) {
        System.out.println("Audio.modify: " + properties);
        notifyObservers();
    }

    // Getters and setters:

    /**
     * This setter changes the whole audio file state. Therefore, it must notify its observers.
     */
    public void setAudioData(Object audioData) {
        this.audioData = audioData;
        notifyObservers();
    }

}
