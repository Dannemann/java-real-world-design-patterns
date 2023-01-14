package my.application.configurators;

import java.util.Arrays;
import java.util.Map;

/**
 * This is a <b>concrete observer/subscriber</b> UML actor.
 */
public class MobileConfigurator implements Configurator {

	public void update(Map newSettings) {
		System.out.println("Applying new backend settings for Mobile users: " +
				Arrays.toString(newSettings.entrySet().toArray()));
	}

}
