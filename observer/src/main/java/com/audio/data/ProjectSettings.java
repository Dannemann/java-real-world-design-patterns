package com.audio.data;

import com.audio.observer.Observer;
import com.audio.observer.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProjectSettings implements Subject {

    private Map<String, Object> projectSettings; // Storage for all project settings.

    private List<Observer> observers = new ArrayList<>();

    // Subject implementation:

    @Override
    public Object getState() {
        return projectSettings;
    }

    @Override
    public List<Observer> getObservers() {
        return observers;
    }

    // Business methods:

    public void loadDefaults() {
        System.out.println("ProjectSettings.loadDefaults");
        setProjectSettings(Map.of("key", "defaultValues"));
    }

    public void loadFromPath(String path) {
        System.out.println("ProjectSettings.loadFromPath: " + path);
        Map<String, Object> loadedSettings = Map.of("key", "loadedValue"); // Imagine this are the loaded settings.
        setProjectSettings(loadedSettings);
    }

    // Getters and setters:

    public void setProjectSettings(Map<String, Object> projectSettings) {
        this.projectSettings = projectSettings;
        notifyObservers();
    }

}
