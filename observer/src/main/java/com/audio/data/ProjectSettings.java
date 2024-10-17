package com.audio.data;

import com.audio.observer.Observer;
import com.audio.observer.Subject;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProjectSettings implements Subject {

    private Map<String, Object> projectSettings; // Storage for all project settings. Shared across the app.

    private Set<Observer> observers = new HashSet<>();

    // Subject implementation:

    @Override
    public Object getState() {
        return projectSettings;
    }

    @Override
    public Set<Observer> getObservers() {
        return observers;
    }

    // Business methods:

    public void loadDefaults() {
        System.out.println("ProjectSettings.loadDefaults");
        setProjectSettings(Map.of("key", "defaultValues"));
    }

    public void loadFromPath(String path) {
        System.out.println("ProjectSettings.loadFromPath: " + path);
        Map<String, Object> loadedSettings = Map.of("key", "loadedValue"); // Imagine these are the loaded settings.
        setProjectSettings(loadedSettings);
    }

    // Getters and setters:

    public void setProjectSettings(Map<String, Object> projectSettings) {
        this.projectSettings = projectSettings;
        notifyObservers();
    }

}
