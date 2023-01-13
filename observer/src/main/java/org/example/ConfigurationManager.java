package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.example.configurators.Configurator;

/**
 * This is the <b>subject/publisher</b> UML actor.
 */
public class ConfigurationManager {

	private List<Configurator> configurators = new ArrayList<Configurator>();
	private Map globalSettings;

	public void attach(Configurator configurator) {
		configurators.add(configurator);
	}

	/**
	 * This is a very important method for the Observer design pattern. When the
	 * subject changes its state, it notifies all observers/subscribers about it.
	 */
	public void setGlobalSettings(Map newSettings) {
		this.globalSettings = newSettings;
		notifyConfigurationChange();
	}

	private void notifyConfigurationChange() {
		for (Configurator c : configurators)
			c.update(globalSettings);
	}

}
