package com.audio.data;

import com.audio.observer.Observer;
import com.audio.observer.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>Consider this class as the audio data object the user is editing. It is
 * displayed as an audio wave on the screen and shared among various widgets,
 * each managing specific properties that directly alter the wave. Widgets can
 * change volume, tempo, pitch, reverb, delay, equalization, and do many other
 * audio effects.</p>
 * <p>The audio wave can be modified by multiple independent widgets. When this
 * occurs, all widgets that rely on this data must be notified to update
 * themselves, ensuring they reflect the most recent data. A typical scenario is
 * adjusting one slider while the others automatically adjust in response.</p>
 * <p>This is a scenario where multiple independent components rely on the same
 * data object and must be notified of any changes on it. Since this class
 * serves as the central access point for this data (<code>audioData</code>), it
 * is implemented as a <code>Subject</code> to facilitate notifying its
 * observers when updates occur.</p>
 * <p>This is the <b>concrete subject/publisher</b> UML actor.</p>
 * <p>Check <code>ProjectSettings</code> for an example with no comments.</p>
 */
public class Audio implements Subject {

    private Object audioData; // The actual audio (or song) the user edits.

    private List<Observer> observers = new ArrayList<>();

    // Subject implementation:

    @Override
    public Object getState() {
        return audioData;
    }

    @Override
    public List<Observer> getObservers() {
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
     * This setter changes the whole audio file state. Therefore, it must notify all subscribers.
     */
    public void setAudioData(Object audioData) {
        this.audioData = audioData;
        notifyObservers();
    }

}
