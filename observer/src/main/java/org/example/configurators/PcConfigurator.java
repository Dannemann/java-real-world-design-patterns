package org.example.configurators;

import java.util.Arrays;
import java.util.Map;

/**
 * This is a <b>concrete observer/subscriber</b> UML actor.
 */
public class PcConfigurator implements Configurator {

	public void update(Map newSettings) {
		System.out.println("Applying new backend settings for computer users: " +
				Arrays.toString(newSettings.entrySet().toArray()));
	}

}
