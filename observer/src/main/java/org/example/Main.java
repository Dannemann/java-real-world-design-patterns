package org.example;

import java.util.HashMap;

import org.example.configurators.MobileConfigurator;
import org.example.configurators.OtherDevicesConfigurator;
import org.example.configurators.PcConfigurator;

/**
 * <p>
 * Imagine you are writing an application that can change its internal settings
 * at runtime, making necessary specific back-end configurations for client
 * platforms like PC, mobile, and other devices. So, that means each time we
 * change the application global properties (its state), a set of specific
 * back-end tasks should be executed for each client platform in order to update
 * its server configuration. The Observer design pattern fits very well in this
 * situation because it enables us to listen to these application state changes
 * and subscribe to them.
 * </p>
 * <p>
 * Note: While studying this pattern, we tend to focus solely on the
 * publish/subscriber aspect of it. Remember that the Observer design pattern is
 * about <b>listening for changes in the state of an object and then notify
 * subscribers about this state change</b>.
 * </p>
 */
public class Main {

	public static void main(String[] args) {
		ConfigurationManager configManager = new ConfigurationManager();
		configManager.attach(new PcConfigurator());
		configManager.attach(new MobileConfigurator());
		configManager.attach(new OtherDevicesConfigurator());
		configManager.setGlobalSettings(loadInitialSettings()); // Changes the application state and notifies it.

		System.out.println();

		// Imagine that we need to change our core application settings on Black Friday,
		// expecting that the correct back-end configurations for PC, mobile, and other
		// platforms are correctly applied on the server by the observers:
		configManager.setGlobalSettings(loadBlackFridaySettings()); // Changes the application state and notifies it.
	}

	// Helpers:

	private static HashMap loadInitialSettings() {
		// Loading and returning the initial application properties.
		return new HashMap() {{
				put("propA", "mocked_init_val");
				put("propB", "anotherMockedInitVal");
		}};
	}

	private static HashMap loadBlackFridaySettings() {
		// Loading and returning Black Friday specific application properties.
		return new HashMap() {{
				put("propA", "mocked_blackfriday_val");
				put("propB", "anotherMockedBlackFridayVal");
		}};
	}

}
