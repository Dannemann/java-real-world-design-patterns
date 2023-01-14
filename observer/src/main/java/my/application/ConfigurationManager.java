package my.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import my.application.configurators.Configurator;

/**
 * This is the <b>subject/publisher</b> UML actor.
 */
public class ConfigurationManager {

	/**
	 * The observer pattern can cause memory leaks, known as the lapsed listener
	 * problem, because in a basic implementation, it requires both explicit
	 * registration and explicit deregistration, as in the dispose pattern, because
	 * the subject holds strong references to the observers, keeping them alive.
	 * This can be prevented if the subject holds weak references to the observers.
	 */
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
